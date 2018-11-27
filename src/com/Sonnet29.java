package com;

public class Sonnet29 implements Poem {
    private static String LINES[] = {
            "everybody ok off",
            "everybody ok on",
            "everybody ok ok"
    };

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
