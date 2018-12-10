package com.example.asus.converterapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class Favourite extends AppCompatActivity {


    private ListView lv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_favourite);


            ListView lv = findViewById(R.id.list_view);
            lv.setAdapter(new ItemAdapter(this,FavouriteItemsList.getArray()));
        }

        public class ItemAdapter extends ArrayAdapter<FavouriteItem> {
            private Context mContext;
            private List<FavouriteItem> items = new ArrayList<>();


            public ItemAdapter(Context context, ArrayList<FavouriteItem> list) {
                super(context, 0, list);
                mContext = context;
                items = list;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                View listItem = convertView;
                if (listItem == null)
                    listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

                final FavouriteItem currentItem = items.get(position);

                ImageButton button = (ImageButton) listItem.findViewById(R.id.imageButton);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        remove(currentItem);
                        FavouriteItemsList.removeFavoriteItem(getContext(),currentItem);

                        Toast prompt = Toast.makeText(Favourite.this, "Removed from favourites", Toast.LENGTH_SHORT);
                        prompt.show();

                    }
                });

                TextView text = (TextView) listItem.findViewById(R.id.textView);
                text.setText(currentItem.toString());
                return listItem;
            }
        }




    }
