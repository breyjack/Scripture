package com.example.bradenyoung.scripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToScripture (View view)
    {
        EditText et = (EditText) findViewById(R.id.Book);
        String text = et.getEditableText().toString();
        EditText et2 = (EditText) findViewById(R.id.Chapter);
        String text2 = et2.getEditableText().toString();
        EditText et3 = (EditText) findViewById(R.id.Verse);
        String text3 = et3.getEditableText().toString();


        Intent intent = new Intent (this, Main2Activity.class);
        intent.putExtra("Book", text);
        intent.putExtra("Chapter", text2);
        intent.putExtra("Verse", text3);
        startActivity(intent);
    }

}
