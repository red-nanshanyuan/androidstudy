package com.tencent.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.tencent.myapplication.R;
import com.tencent.myapplication.activity.task.RotationAsyncTask;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startHandler(View view) {
        Intent intent = new Intent(this, HandlerTestActivity.class);
        startActivity(intent);
    }
}
