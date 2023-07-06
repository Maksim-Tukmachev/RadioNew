import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void normalStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(11);
        int expected = 11;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveNormalStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(21);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowNormalStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(-21);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adoveMaxStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(21);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMinStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(-3);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStation() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(17);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(15);
        radio.next();
        int expected = 16;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(17);
        radio.prev();
        int expected = 16;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBelowNullStation() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 17;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeAboveMax() {
        Radio radio = new Radio(17);
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMin() {
        Radio radio = new Radio(17);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeNormal() {
        Radio radio = new Radio(17);
        radio.setCurrentVolume(77);
        int expected = 77;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextVolumeAboveMax(){
        Radio radio = new Radio(29);
        radio.setCurrentVolume(100);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextVolumeNormal(){
        Radio radio = new Radio(29);
        radio.setCurrentVolume(98);
        radio.nextVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevVolumeBelowMin(){
        Radio radio = new Radio(29);
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevVolumeNormal(){
        Radio radio = new Radio(29);
        radio.setCurrentVolume(98);
        radio.prevVolume();
        int expected = 97;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
//
