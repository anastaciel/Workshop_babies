package org.example.task2.MusicTrack;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        MusicTrack track1 = new MusicTrack("Popular Monster", "Falling in Reverse", "Rock");
        MusicTrack track2 = new MusicTrack("My Love Mine All Mine", "Mitski", "Indie");
        MusicTrack track3 = new MusicTrack("Immortal", "MARINA", "Indie");
        MusicTrack track4 = new MusicTrack("Cruel Summer", "Taylor Swift", "Pop");

        MusicLibrary library = new MusicLibrary();
        library.addTrack(track1);
        library.addTrack(track2);
        library.addTrack(track3);
        library.addTrack(track4);

        System.out.println(library.toString());
        library.removeTrack(track2);
        System.out.println(library.toString());
        library.getTracksByGenre("Rock");
        library.printLibrary();
    }
}
