package com.lcwd.test;

public class moodAnalyser  {
     String message;
    public moodAnalyser(){
        this.message = null;
    }
    public moodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() throws MoodAnalyserException {
//        if (message.contains("sad")) {
//            return "sad";
//        } else {
//            return "happy";
//        }

        try{
            if(message.contains("")){
                throw new MoodAnalyserException(MoodAnalyserException.MoodAnalysisErrors.enterEmpty,"enter mood");
            }
            else if(message.contains("sad")) {
                return "sad";
            }

        }
        catch (NullPointerException n){
            throw new MoodAnalyserException(MoodAnalyserException.MoodAnalysisErrors.enterNull,"enter mood");
        }
        return "happy";
    }
}
