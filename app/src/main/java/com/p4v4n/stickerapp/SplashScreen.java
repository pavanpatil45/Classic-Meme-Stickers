package com.p4v4n.stickerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SplashScreen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** START - this is the purpose of this Activity */
        Intent intent = new Intent(this, EntryActivity.class);
        startActivity(intent);
        finish();
        /** END - everything more than this is time consuming */
    }
}