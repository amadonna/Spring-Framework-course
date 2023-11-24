package classes;

import interfaces.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Save me";
    }
}
