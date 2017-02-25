package com.codekul.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        public static final String TAG =MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new click());

    }
    private class click implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText editText=(EditText) findViewById(R.id.editText);
            String data =editText.getText().toString();
            editText.setText(data.toUpperCase());
            Log.i( TAG,data);
        }
    }
}
