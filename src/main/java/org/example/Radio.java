package org.example;

public class Radio {
    private int radio;
    private int volume;

    public void nextStation() {
        if (radio != 9) {
            radio++;
        } else {
            radio = 0;
        }
    }

    public void prevStation() {
        if (radio != 0) {
            radio--;
        } else {
            radio = 9;
        }
    }

    public void increaseVolume() {
        if (volume != 10) {
            volume++;
        } else {
            volume = 10;
        }
    }

    public void reductionVolume() {
        if (volume != 0) {
            volume--;
        } else {
            volume = 0;
        }
    }


    public int getRadio() {
        return radio;
    }

    public void setRadio(int radiostation) {
        if (radiostation < 0) {
            return;
        }
        if (radiostation > 9) {
            return;
        }
        this.radio = radiostation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }
}