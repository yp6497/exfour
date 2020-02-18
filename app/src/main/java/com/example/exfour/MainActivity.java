package com.example.exfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int x=0;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
    }

    public void go(View view) {
        x++;
        String str=x+" ";
        if(x%7==0) {
            str="boom";
        }
        btn.setText("This is a click number:");
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

    }
}
