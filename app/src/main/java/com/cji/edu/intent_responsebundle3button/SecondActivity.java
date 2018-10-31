package com.cji.edu.intent_responsebundle3button;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextSecond;
    Button buttonSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextSecond = findViewById(R.id.editTextSecond);
        buttonSecond = findViewById(R.id.buttonSecond);
        buttonSecond.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("saveValue", "NO DATA");
        editTextSecond.setText(bundle.getString("saveValue", "NO DATA"));
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("saveValue", editTextSecond.getText().toString());

        Intent intent = new Intent();
        intent.putExtras(bundle);

        startActivityForResult(intent, Activity.RESULT_FIRST_USER);
    }
}
