package com.lcwd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moodAnalyserTest {
    @Test
    public void analyseMoodTest_noParameter() throws MoodAnalyserException {
        moodAnalyser ma = new moodAnalyser();
        String regex = ma.analyseMood();
        Assertions.assertEquals("happy", regex);
    }
    @Test
    public void analyseMoodwithParameter() throws MoodAnalyserException{
        moodAnalyser ma = new moodAnalyser("I am in sad mood");
        String regex = ma.analyseMood();
        Assertions.assertEquals("sad",regex);
    }
//    public void analyseMoodTest_happy() {
//        String regex = moodAnalyser.analyseMood("I am in any Mood");
//        Assertions.assertEquals("happy", regex);
//    }

    @Test
    public void nullSceario(){
        try{
            moodAnalyser ma = new moodAnalyser(null);
            String mood = ma.analyseMood();
            Assertions.assertEquals("happy", mood);
        }
        catch (MoodAnalyserException e){
        }
    }
    @Test
    public void nullMoodTest(){
        try{
            moodAnalyser ma = new moodAnalyser(null);
            ma.analyseMood();
        }
        catch (MoodAnalyserException e){
            Assertions.assertEquals( e.getMessage(), e.err);
        }
    }

}