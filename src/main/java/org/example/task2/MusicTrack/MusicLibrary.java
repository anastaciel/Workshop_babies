package org.example.task2.MusicTrack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MusicLibrary {

    private HashMap<String, HashSet<MusicTrack>> library;

    public MusicLibrary(){
        this.library = new HashMap<>();
    }

    public void addTrack(MusicTrack track){
        library.putIfAbsent(track.getGenre(), new HashSet<>());
        library.get(track.getGenre()).add(track);
    }

    public void removeTrack(MusicTrack track){
        library.get(track.getGenre()).remove(track);
    }

    public void getTracksByGenre(String genre) {
        System.out.println( library.getOrDefault(genre, new HashSet<>()));
    }

    public void printLibrary() {
        for (String genre : library.keySet()) {
            System.out.println("Genre: " + genre);
            for (MusicTrack track : library.get(genre)) {
                System.out.println("  " + track);
            }
        }
    }
    @Override
    public String toString() {
        return "MusicLibrary{" +
                "library=" + library +
                '}';
    }
}
