package com;

public class Magician implements Performer {
    public Magician() {
    }

    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magicbox contains  ");
        System.out.println(magicBox.getContents());//исследует содержимое ящика
    }

    //внедрение
    private MagicBox magicBox;

    public void setMagicBox(MagicBox magicBox){
        this.magicBox=magicBox;//внедрение волшебного ящика
    }
private String magicWords;

    public void setMagicWords(String magicWords){
        this.magicWords=magicWords;
    }
}
