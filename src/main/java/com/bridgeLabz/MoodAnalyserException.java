package com.bridgeLabz;

public class MoodAnalyserException extends  Exception{
    public String message;
    static ExceptionType type;

    enum ExceptionType {
        EMPTY, NULL;
    }
    public MoodAnalyserException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }
    @Override
    public String getMessage() {
        return message;
    }

}
