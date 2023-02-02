package org.example;

public class Radio {
    private int radio;
    private int volume;
    private int maxRadio;
    private int minRadio;
    private int maxVolume;
    private int minVolume;

    public Radio() {
        maxRadio = 9;
        minRadio = 0;
        maxVolume = 100;
        minVolume = 0;
    }

    public Radio(int sizeMaxRadio) {
        maxRadio = sizeMaxRadio - 1;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getRadio() {

        return radio;
    }

    public void setRadio(int radio) {
        if (radio < minRadio) {
            return;
        }
        if (radio > maxRadio) {
            return;
        }
        this.radio = radio;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }


    public void nextStation() {
        if (radio != maxRadio) {
            radio++;
        } else {
            radio = minRadio;
        }
    }

    public void prevStation() {
        if (radio != minRadio) {
            radio--;
        } else {
            radio = maxRadio;
        }
    }

    public void increaseVolume() {
        if (volume != maxVolume) {
            volume++;
        } else {
            volume = maxVolume;
        }
    }

    public void reductionVolume() {
        if (volume != minVolume) {
            volume--;
        } else {
            volume = minVolume;
        }
    }

}