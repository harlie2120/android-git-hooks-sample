package com.example.other;

import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OtherActivity extends AppCompatActivity {
    int abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.otherlayout);
        layout.setBackgroundColor(R.color.bg);
    }
}
