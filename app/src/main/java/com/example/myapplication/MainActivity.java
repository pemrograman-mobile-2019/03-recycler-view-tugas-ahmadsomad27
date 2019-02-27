package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
   int[] IMAGES = {R.drawable.DSC_3507, R.drawable.dsc_0023, R.drawable.Adin, R.drawable.Erly,
   R.drawable.ic_launcher_background};
   String[] NAMES = {"BIG B", "Gandhi", "Steve Jobs","APJ Abdul",
   "Rohmat"};
   String[] DESCRIPTIONS = {"Actor", "Freedom", "Sports", "Scientifyc", "Penjahit"};

   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       ListView ListView=(ListView) findViewById(R.id.ListView);
   }

   class CustomAdapter extends BaseAdapter(
        @Override
        public int getCount(){
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i){
            return null;
        }
        @Override
        public long getItemId(int i){
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup){
            return null;
        }
            )
}