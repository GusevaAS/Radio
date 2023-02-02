package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void choiceRadioValidValue() {
        radio.setRadio(9);
        int expected = 9;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioOverValidValues() {
        radio.setRadio(100);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioNegativeValues() {
        radio.setRadio(-3);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioMinLimitValues() {
        radio.setRadio(0);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioBelowMinLimitValues() {
        radio.setRadio(-1);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioHighMinLimitValues() {
        radio.setRadio(1);
        int expected = 1;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioMaxLimitValues() {
        radio.setRadio(9);
        int expected = 9;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioLowMaxLimitValues() {
        radio.setRadio(8);
        int expected = 8;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioHighMaxLimitValues() {
        radio.setRadio(10);
        int expected = 0;
        int actual = radio.getRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioValidValues() {
        radio.setRadio(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMaxLimitValues() {
        radio.setRadio(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioLowMaxLimitValues() {
        radio.setRadio(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioMinLimitValues() {
        radio.setRadio(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioHighMinLimitValues() {
        radio.setRadio(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioValidValues() {
        radio.setRadio(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMaxLimitValues() {
        radio.setRadio(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioLowMaxLimitValues() {
        radio.setRadio(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioMinLimitValues() {
        radio.setRadio(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioHighMinLimitValues() {
        radio.setRadio(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void VolumeNegativeValue() {
        radio.setVolume(-2);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeOverLimitValue() {
        radio.setVolume(200);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMinLimitValue() {
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeHighMinLimitValue() {
        radio.setVolume(1);
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeLowMinLimitValue() {
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMaxLimitValue() {
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeLowMaxLimitValue() {
        radio.setVolume(99);
        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeHighMaxLimitValue() {
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeValidValue() {
        radio.setVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxLimitValue() {
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLowMaxLimitValue() {
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMInLimitValue() {
        radio.setVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHighMinLimitValue() {
        radio.setVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reductionVolumeValidValue() {
        radio.setVolume(5);
        radio.reductionVolume();
        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMaxLimitValue() {
        radio.setVolume(100);
        radio.reductionVolume();
        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeLowMaxLimitValue() {
        radio.setVolume(99);
        radio.reductionVolume();
        int expected = 98;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeMinLimitValue() {
        radio.setVolume(0);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeHighMinLimitValue() {
        radio.setVolume(1);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void WhenMaxLimitRadio() {
        Radio radio = new Radio(200);
        radio.setRadio(199);
        int expected = 199;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenHighMaxLimitRadio() {
        Radio radio = new Radio(200);
        radio.setRadio(200);
        int expected = 0;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenLowMaxLimitRadio() {
        Radio radio = new Radio(200);
        radio.setRadio(198);
        int expected = 198;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenNegativeValueRadio() {
        Radio radio = new Radio(200);
        radio.setRadio(-5);
        int expected = 0;
        int actual = radio.getRadio();
        Assertions.assertEquals(expected, actual);
    }
}
