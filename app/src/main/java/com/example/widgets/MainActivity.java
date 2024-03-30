package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.myShflBtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Button clicked");
                TextView textViewToShuffle = (TextView) findViewById(R.id.textToShfl);
                EditText myNewEditText = (EditText) findViewById(R.id.myNewEdt);
                String textFromEditText = myNewEditText.getText().toString();
                textViewToShuffle.setText("Your text shuffled: " + shuffler(textFromEditText));
            }
        });
    }

    public String shuffler(String textToShuffle) {
        List<Character> charactersToShuffle = new ArrayList<>();

        for (char i : textToShuffle.toCharArray()) {
            charactersToShuffle.add(i);
        }

        Collections.shuffle(charactersToShuffle);

        StringBuilder backToString = new StringBuilder();
        for (char i : charactersToShuffle) {
            backToString.append(i);
        }

        return backToString.toString();
    }

}
