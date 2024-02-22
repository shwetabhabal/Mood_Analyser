package com.lcwd.test;

public class moodAnalyser {
    public static String analyseMood(String message){
        if(message.contains("happy")){
            return "Happy";
        }
        else if (message.contains("sad")){
            return "Sad";
        }
        else {
            return "unknown";
        }
    }
    public static void main(String[] args) {
        String message = "I am feeling happy";
        System.out.println(analyseMood(message));
        String message2 = "I am feeling sad";
        System.out.println(analyseMood(message2));
    }
}
