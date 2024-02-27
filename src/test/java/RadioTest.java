import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioNumber() {
        Radio station = new Radio();
        station.setRadioNumber(5);

        int expected = 5;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusV() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusV() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio station = new Radio();
        station.setRadioNumber(10); // шаг вверх возвращает к началу

        int expected = 0;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio station = new Radio();
        station.setRadioNumber(-1); // шаг вниз за последнюю станцию - поднимает вверх

        int expected = 9;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddPrev() {
        Radio station = new Radio();
        station.prev(5); // шаг вниз в пределах списка станций

        int expected = 4;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddNext() {
        Radio station = new Radio();
        station.next(5); // шаг вверх в пределах списка станций

        int expected = 6;
        int actual = station.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddPlusV() {
        Radio volume = new Radio();
        volume.plusV(99);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddMinusV() {
        Radio volume = new Radio();
        volume.minusV(1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
