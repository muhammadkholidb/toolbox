package com.gitlab.muhammadkholidb.toolbox.exception;

public class Exceptions {

    private Exceptions() {
    }

    public static String getMessageOrDefault(Throwable ex, String defaultMessage) {
        String message = ex.getMessage();
        return message == null ? defaultMessage : message;
    }

    public static String getMessage(Throwable ex) {
        return getMessageOrDefault(ex, ex.toString());
    }

}