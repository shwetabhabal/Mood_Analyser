package com.lcwd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moodAnalyserTest {
    @Test
    public void analyseMoodTest(){
        String regex = moodAnalyser.analyseMood("I am feeling sad");
        Assertions.assertEquals("sad",regex);
    }
    public void analyseMoodTest_happy(){
        String regex = moodAnalyser.analyseMood("I am in any Mood");
        Assertions.assertEquals("happy", regex);
    }
}
