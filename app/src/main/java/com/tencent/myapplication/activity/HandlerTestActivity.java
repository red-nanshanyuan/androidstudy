package com.tencent.myapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tencent.myapplication.R;

public class HandlerTestActivity extends Activity implements View.OnClickListener {
    private TextView textView;
    private Button btn;

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_handler);
        textView = findViewById(R.id.h_editText);
        btn = findViewById(R.id.h_button);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        new WorkThread().start();
    }

    private class WorkThread extends Thread {
        @Override
        public void run() {
            textView.setText("completed!");
        }
    }
}
