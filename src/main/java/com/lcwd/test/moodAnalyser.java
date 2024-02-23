package com.lcwd.test;

public class moodAnalyser {
    private String message;
    public moodAnalyser(){
        this.message = "";
    }
    public moodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("sad")) {
            return "sad";
        } else {
            return "happy";
        }
    }


}
