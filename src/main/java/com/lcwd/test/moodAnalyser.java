package com.lcwd.test;
import com.lcwd.test.MoodAnalyserException;

public class moodAnalyser  {
    private String message;
    public moodAnalyser(){
        this.message = "";
    }
    public moodAnalyser(String message) throws MoodAnalyserException{
        if(message == null){
            throw new MoodAnalyserException("Invalid mood");
        }
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
