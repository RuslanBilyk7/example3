package com;

import javax.sound.midi.*;

public class MusicTest {
//    public void play(){
//        try {
//            Sequencer sequencer= (Sequencer) MidiSystem.getSequencer();
//        } catch (MidiUnavailableException e) {
//            System.out.println("Неудача");;
//        }
//        System.out.println("Мы получили синтезатор");
//    }
//
//    public static void main(String[] args) {
//            MusicTest musicTest=new MusicTest();
//            musicTest.play();
//    }

        public static void main(String[] args) {
            MusicTest mini = new MusicTest();
            mini.play();
        }

        private void play() {

            try {

                // make (and open) a sequencer, make a sequence and track

                Sequencer sequencer = MidiSystem.getSequencer();
                sequencer.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);
                Track track = seq.createTrack();

                // now make two midi events (containing a midi message)
                MidiEvent event = null;

                // first make the message
                // then stick the message into a midi event
                // and add the event to the track

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 20, 100);
                MidiEvent noteOn = new MidiEvent(a, 3); // <-- means at tick one, the above event happens
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 8, 64, 100);
                MidiEvent noteOff = new MidiEvent(b, 16); // <-- means at tick one, the above event happens
                track.add(noteOff);


                // add the events to the track

                // add the sequence to the sequencer, set timing, and start
                sequencer.setSequence(seq);

                sequencer.start();
                // new
//                Thread.sleep(1000);
//                sequencer.close();
//                System.exit(0);
            } catch (Exception ex) {ex.printStackTrace();}
        } // close play

    } // close class