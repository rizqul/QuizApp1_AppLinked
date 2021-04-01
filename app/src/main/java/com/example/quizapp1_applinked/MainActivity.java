package com.example.quizapp1_applinked;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toAboutMe(View view) {
        Intent a = new Intent(MainActivity.this, AboutMe.class);
        startActivity(a);
    }

    public void toMap(View view) {
        String uri = "geo:-5.138763,119.476405";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }

    public void toCall(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0811413627"));
        startActivity(intent);
    }

    public void toQuit(View view) {
        quit(this);
    }

    public static void quit(Activity activity) {
        AlertDialog.Builder quitAlert = new AlertDialog.Builder(activity);
        quitAlert.setTitle("Quit");
        quitAlert.setMessage("Are you sure ?");

        quitAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });
        quitAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        quitAlert.show();
    }

}