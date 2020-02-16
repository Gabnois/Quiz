package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuizGame extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizz_game);

        random = new Random();


        btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);

        NextQuestion(random.nextInt(questionLength));
    }

    private Button btn_one, btn_two, btn_three, btn_four;
    private TextView tv_question;

    private Questionario question = new Questionario();

    String answer;
    int questionLength = question.questions.length;
    Random random;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText() == answer){
                    Toast.makeText(QuizGame.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    //NextQuestion(random.nextInt(questionLength));
                    openNewActivity();

                }else{
                    GameOver();
                }

                break;

            case R.id.btn_two:
                if(btn_two.getText() == answer){
                    Toast.makeText(QuizGame.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    //NextQuestion(random.nextInt(questionLength));
                    openNewActivity();
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_three:
                if(btn_three.getText() == answer){
                    Toast.makeText(QuizGame.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    //NextQuestion(random.nextInt(questionLength));
                    openNewActivity();
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_four:
                if(btn_four.getText() == answer){
                    Toast.makeText(QuizGame.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    //NextQuestion(random.nextInt(questionLength));
                    openNewActivity();
                }else{
                    GameOver();
                }

                break;
        }
    }

    private void GameOver(){
        Intent intent = new Intent(this, ErrorQuestion.class);
        startActivity(intent);
    }

    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }

    private void openNewActivity(){
        Intent intent = new Intent(this, RightQuestion.class);
        startActivity(intent);
    }
}
