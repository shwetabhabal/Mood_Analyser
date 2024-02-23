package com.lcwd.test;

public class moodAnalyser {
    public static String analyseMood(String message) {
        if (message.contains("sad")) {
            return "sad";
        } else {
            return "happy";
        }
    }


}
