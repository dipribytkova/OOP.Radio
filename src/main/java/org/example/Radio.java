package org.example;

public class Radio {
    private int quantityStation = 10;
    private int currentStation;
    private int currentVolume;

    public Radio (int quantityStation) {
    this.quantityStation = quantityStation;
    }

    public Radio () {
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    private int getMaxStation() {
        return quantityStation - 1;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > this.getMaxStation()) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation < this.getMaxStation()) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = this.getMaxStation();
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
