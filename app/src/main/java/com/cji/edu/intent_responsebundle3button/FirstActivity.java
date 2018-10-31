package com.cji.edu.intent_responsebundle3button;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        buttonFirst = findViewById(R.id.buttonFirst);
        buttonFirst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextFirst = findViewById(R.id.editTextFirst);

        Bundle bundle = new Bundle();
        bundle.putString( "saveValue", editTextFirst.getText().toString());

        Intent intent = new Intent( this, SecondActivity.class);
        intent.putExtras(bundle);

        startActivityForResult(intent, Activity.RESULT_FIRST_USER);
    }
}
