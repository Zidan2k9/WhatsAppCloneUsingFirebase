package com.zainulabdeen.flashchatnewfirebase;

/**
 * Created by zainu on 28/02/2018.
 */

public class InstantMessage {

    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public InstantMessage() {
    }
}
