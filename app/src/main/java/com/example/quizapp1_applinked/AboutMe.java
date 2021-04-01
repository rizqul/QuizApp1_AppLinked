package com.example.quizapp1_applinked;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    public void toBack(View view) {
        Intent a = new Intent(AboutMe.this, MainActivity.class);
        startActivity(a);
    }

    public void toQuit(View view) {
        MainActivity.quit(this);
    }
}