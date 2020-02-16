package com.example.quiz;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button buttonExit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);

            //botao de comecar o jogo
            button = findViewById(R.id.btbegin);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ComecarJogo();
                }
            });

            //botao de sair do jogo
            buttonExit = findViewById(R.id.btexit);
            buttonExit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.exit(1);
                }
            });
        }

        protected void ComecarJogo(){
            Intent intent = new Intent(this, QuizGame.class);
            startActivity(intent);
        }
    }
