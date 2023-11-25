package classes;

import interfaces.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MusicPlayer {
    private List<Music> playList = new ArrayList<>();
    private Music music;
    private String author;
    private int volume;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(){}
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing:    " + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicPlayer that)) return false;
        return getVolume() == that.getVolume() && Objects.equals(music, that.music) && Objects.equals(getAuthor(), that.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(music, getAuthor(), getVolume());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "playList=" + playList +
                ", music=" + music.getSong() +
                ", author='" + author + '\'' +
                ", volume=" + volume +
                '}';
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }
}
