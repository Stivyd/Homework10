import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая радиостанция " + radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        System.out.print("Текущая радиостанция " + radio.getCurrentStation() + ", ");
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println("Следующая радиостанция " + radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        System.out.print("Текущая радиостанция " + radio.getCurrentStation() + ", ");
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
        System.out.println("Предыдущая радиостанция " + radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println("Текущий уровень громкости  " + radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        System.out.print("Прошлый уровень громкости  " + radio.getCurrentVolume() + ", ");
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println("Новый уровень громкости  " + radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        System.out.print("Текущий уровень громкости  " + radio.getCurrentVolume() + ", ");

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println("После уменьшения получаем  " + radio.getCurrentVolume());
    }
}
