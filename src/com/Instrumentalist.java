package com;

import javax.sound.midi.Instrument;

public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() {
        System.out.println("Playing "+song+ ":");
        instrument.play();
    }
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    private Instrument1 instrument;

    public void setInstrument(Instrument1 instrument){
        this.instrument=instrument;
    }

}
