package classes;

import interfaces.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Seasons of Vivaldi";
    }
}
