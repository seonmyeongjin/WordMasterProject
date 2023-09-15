package com.word.project;

public class Word {
    private int id;
    private int level;
    private String word;
    private String meaning;

    Word(){} //생성자 형성
    Word(int id, int level, String word, String meaning){//멤버 변수를 생성자로 받음
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String toString(){
        String star="";
        for(int i=0;i<level;i++){
            star += "*";
        }
        String voca = String.format("%-3s",star) + String.format("%15s", word)+ " " + meaning;

        return voca;
    }

    public String toFileString(){
        return this.level + "|" + this.word + "|" +this.meaning;
    }
}
