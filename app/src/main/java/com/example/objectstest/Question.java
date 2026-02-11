package com.example.objectstest;

import java.io.Serializable;

public class Question implements Serializable {
    private String text;
    private String yourAnswer;
    private String rightAnswer;
    private boolean isRight;

    public Question(String text,String yourAnswer, String rightAnswer, boolean isRight) {
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

    public String getYourAnswer() {
        return yourAnswer;
    }

    public void setYourAnswer(String yourAnswer) {
        this.yourAnswer = yourAnswer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
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
        String st= "Question: " + text + '\n' +
                " your Answer: " + yourAnswer +
                "\n right Answer: " + rightAnswer+"\n" ;
        if(this.isRight)
            st+="CORRECT \n";
        else
            st+="INCORRECT \n";
        return st;
                        //+ " \nisRight=" + isRight ;
    }
}
