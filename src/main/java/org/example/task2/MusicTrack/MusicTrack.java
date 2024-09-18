package org.example.task2.MusicTrack;

public class MusicTrack {
    private String name;
    private String singer;
    private String genre;

    public MusicTrack(String name, String singer, String genre) {
        this.name = name;
        this.singer = singer;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "MusicTrack{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
