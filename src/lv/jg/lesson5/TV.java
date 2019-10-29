package lv.jg.lesson5;

import org.omg.CORBA.TCKind;

import java.util.Objects;

public class TV {

    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn= true;

    public TV (String manufacturer, int currentChannel, int currentVolumeLevel){
        this.currentVolumeLevel=currentVolumeLevel;
        this.manufacturer=manufacturer;
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (turnedOn == true) {
            currentChannel++;
        }


    }

    public void previousChannel() {
        if (turnedOn == true) {
            currentChannel--;
        }
    }

    public void increaseVolume() {
        if (turnedOn == true) {
            currentVolumeLevel++;
        }
    }

    public void decreaseVolume() {
        if (turnedOn == true) {
            currentVolumeLevel--;
        }
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public int getCurrentVolumeLevel() {
        return this.currentVolumeLevel;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        TV tv = (TV) object;
        return this.manufacturer.equals(tv.manufacturer) && this.currentChannel == tv.currentChannel
                && this.currentVolumeLevel == tv.currentVolumeLevel && this.turnedOn == tv.turnedOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolumeLevel, manufacturer, turnedOn);
    }

    @Override
    public String toString() {
        if (turnedOn == true) {
            return "Manufacturer : " + manufacturer
                    + ". Current channel : " + currentChannel
                    + ". Current volume : " + currentVolumeLevel;
        } else {
            return "Tv is turned off";
        }
    }
}
