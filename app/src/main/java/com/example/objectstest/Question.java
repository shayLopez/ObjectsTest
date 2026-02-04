package com.example.objectstest;

import java.io.Serializable;

public class Question implements Serializable {
    private String text;
    private int yourAnswer;
    private int rightAnswer;
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

    public int getYourAnswer() {
        return yourAnswer;
    }

    public void setYourAnswer(int yourAnswer) {
        this.yourAnswer = yourAnswer;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
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
        return "Question{" +
                "text='" + text + '\'' +
                ", yourAnswer=" + yourAnswer +
                ", rightAnswer=" + rightAnswer +
                ", isRight=" + isRight +
                '}';
    }
}
