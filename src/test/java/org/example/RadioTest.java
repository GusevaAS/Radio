package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void choiceRadioValidValue() {
        Radio radio = new Radio();
        radio.setRadio(9);
        int expected = 9;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioOverValidValues() {
        Radio radio = new Radio();
        radio.setRadio(100);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioNegativeValues() {
        Radio radio = new Radio();
        radio.setRadio(-3);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(0);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioBelowMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(-1);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioHighMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(1);
        int expected = 1;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(9);
        int expected = 9;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioLowMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(8);
        int expected = 8;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioHighMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(10);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextRadioValidValues() {
        Radio radio = new Radio();
        radio.setRadio(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioLowMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioHighMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioValidValues() {
        Radio radio = new Radio();
        radio.setRadio(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioLowMaxLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioHighMinLimitValues() {
        Radio radio = new Radio();
        radio.setRadio(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void VolumeNegativeValue() {
        Radio radio = new Radio();
        radio.setVolume(-2);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeOverLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMinLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeHighMinLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeLowMinLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(10);
        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeLowMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(9);
        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeHighMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeValidValue() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMInLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHighMinLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reductionVolumeValidValue() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.reductionVolume();
        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.reductionVolume();
        int expected = 9;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeLowMaxLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.reductionVolume();
        int expected = 8;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMinLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeHighMinLimitValue() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}