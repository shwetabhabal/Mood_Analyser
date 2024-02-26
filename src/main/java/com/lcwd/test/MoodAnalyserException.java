package com.lcwd.test;
public class MoodAnalyserException extends Exception{
    public MoodAnalysisErrors err;
    public String message;
    public MoodAnalyserException(MoodAnalysisErrors error,String message){
//        super(message);
        System.out.println(message);
    }
    public enum MoodAnalysisErrors{
        enterEmpty,
        enterNull,
    }
}