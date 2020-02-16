package com.example.quiz;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ErrorQuestion extends AppCompatActivity {
    Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.error_question);
            button = (Button) findViewById(R.id.Backbutton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    VoltarTela();
                }
            });
        }
        protected void VoltarTela(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        }
    }
