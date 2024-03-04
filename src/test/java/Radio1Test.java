import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Radio1Test {
    @Test
    public void shouldSetMaxRadioNumber() {
        Radio1 maxNumbers = new Radio1(10);
        Assertions.assertEquals(9, maxNumbers.getMaxRadio());
    }

    @Test
    public void shouldSetRadioNumberCorr() {
        Radio1 stationcorr = new Radio1(-1);

        Assertions.assertEquals(0, stationcorr.getRadioNumber());

    }

    @Test
    public void shouldSetRadioNumber() {
        Radio station = new Radio(10);

        Assertions.assertEquals(0, station.getRadioNumber());

    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusV() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusV() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio1 station = new Radio1();
        station.setRadioNumber(10); // шаг вверх возвращает к началу

        int expected = 0;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStartNext() {
        Radio1 station = new Radio1(10);
        station.setRadioNumber(0); // от нуля
        station.next();
        int expected = 1;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEndNext() {
        Radio1 station = new Radio1();
        station.setRadioNumber(9); // шаг вверх возвращает к началу
        station.next();
        int expected = 0;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStartPrev() {
        Radio1 station = new Radio1(10);
        station.setRadioNumber(0);
        station.prev();
        int expected = 9;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio1 station = new Radio1(10);
        station.setRadioNumber(-1); // шаг вниз за последнюю станцию - поднимает вверх

        int expected = 9;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddPrev() {
        Radio1 station = new Radio1(10);
        station.setRadioNumber(5); // выбрали станцию
        station.prev(); // наш метод переключения
        int expected = 4;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddNext() {
        Radio1 station = new Radio1(10);
        station.setRadioNumber(5); // шаг вверх в пределах списка станций
        station.next();
        int expected = 6;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddPlusV() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(99);
        volume.plusV();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMinusV() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(1);
        volume.minusV();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEndPlusV() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(100);
        volume.plusV();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEndMinusV() {
        Radio1 volume = new Radio1();
        volume.setCurrentVolume(0);
        volume.minusV();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}