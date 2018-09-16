package com.example.jihyechae.instagram;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textview);


        final Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView.setText("Jihye");
                    }
                }
        );


    }
}
