package com.example.arrayadapter;

public class Word {
    String uppperWord;
    String lowerWord;
    int imageResourceId;

    public Word() {
    }

    public Word(String uppperWord, String lowerWord, int imageResourceId) {
        this.uppperWord = uppperWord;
        this.lowerWord = lowerWord;
        this.imageResourceId = imageResourceId;
    }

    public String getUppperWord() {
        return uppperWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getLowerWord() {
        return lowerWord;
    }
}
