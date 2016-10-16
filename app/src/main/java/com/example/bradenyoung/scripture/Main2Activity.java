package com.example.bradenyoung.scripture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.bradenyoung.scripture.R.id.Book;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String Book = extras.getString("Book");
        String Chapter = extras.getString("Chapter");
        String Verse = extras.getString("Verse");

        TextView textView = (TextView) findViewById(R.id.textView6);
        textView.setText("Your favorite scripture is " + Book + " " + Chapter + ":" + Verse);
    }
}
