package com.sample.transitionsample;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.sample.transitionsample.android.AndroidTransitionsActivity;
import com.sample.transitionsample.transitionseverywhere.TransitionsEverywhereActivity;

public class MainActivity extends AppCompatActivity {
    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void goToAndroid(View view) {
        Intent intent = new Intent(this, AndroidTransitionsActivity.class);
        startActivity(intent);
    }

    public void goToTransitionsEverywhere(View view) {
        Intent intent = new Intent(this, TransitionsEverywhereActivity.class);
        startActivity(intent);
    }
}
