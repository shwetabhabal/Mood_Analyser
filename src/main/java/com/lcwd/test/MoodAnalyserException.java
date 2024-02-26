package com.lcwd.test;
public class MoodAnalyserException extends Exception{
    public String message;
    public MoodAnalyserException(MoodAnalysisErrors e,String message){
//        super(message);
        System.out.println(message);
    }
    public enum MoodAnalysisErrors{
        enterEmpty,
        enterNull,
    }
}