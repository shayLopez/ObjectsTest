package com.example.objectstest;

import java.io.Serializable;

public class Question implements Serializable {
    private String text;
    private double yourAnswer;
    private double rightAnswer;
    private boolean isRight;

    public Question(String text, int yourAnswer, int rightAnswer, boolean isRight) {
        this.text = text;
        this.yourAnswer = yourAnswer;
        this.rightAnswer = rightAnswer;
        this.isRight = isRight;
    }

    public Question() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getYourAnswer() {
        return yourAnswer;
    }

    public void setYourAnswer(double yourAnswer) {
        this.yourAnswer = yourAnswer;
    }

    public double getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(double rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    @Override
    public String toString() {
        return
                "Question='" + text + '\n' +
                " yourAnswer=" + yourAnswer +
                "\n rightAnswer=" + rightAnswer +
                " \nisRight=" + isRight ;
    }
}
