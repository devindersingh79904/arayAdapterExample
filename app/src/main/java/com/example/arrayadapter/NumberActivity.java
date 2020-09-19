package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One","1"));
        words.add(new Word("Two","2"));
        words.add(new Word("Three","3"));
        words.add(new Word("Four","4"));
        words.add(new Word("Five","5"));
        words.add(new Word("Six","6"));
        words.add(new Word("Seven","7"));
        words.add(new Word("Eigth","8"));
        words.add(new Word("Nine","9"));
        words.add(new Word("Ten","10"));
        words.add(new Word("Eleven","11"));
        words.add(new Word("Twevle","12"));
        words.add(new Word("Therteen","13"));
        words.add(new Word("Fourteen","14"));
        words.add(new Word("Fivteen","15"));
        words.add(new Word("Sixteen","16"));
        words.add(new Word("Seventeen","17"));
        words.add(new Word("Eighteen","18"));
        words.add(new Word("Nineteen","19"));
        words.add(new Word("Twenty","20"));



        WordAdapter aAdapter= new WordAdapter(this,words);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(aAdapter);

    }
}