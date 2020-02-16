package com.example.quiz;

public class Questionario {
    public String questions[] = {
            "A resposta é A.",
            "A resposta é B.",
            "A resposta é C.",
    };

    public String choices[][] = {
            {"A", "B", "C", "D"},
            {"A", "B", "C", "D"},
            {"A", "B", "C", "D"}
    };

    public String correctAnswer[] = {
            "A",
            "B",
            "C"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
