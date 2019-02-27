package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
}