package ru.netology.Homework;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation = minStation;
    private int currentVolume = minVolume;

    private int totalStation = 10;


    public Radio(int totalStation) {
        this.totalStation = totalStation;
        maxStation = minStation + totalStation - 1;

    }

    public Radio() {
        this.totalStation = totalStation;
        maxStation = maxStation + totalStation - 1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = minStation;
        }
        currentStation = newCurrentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getTotalStation() {
        return totalStation;
    }

    public void setTotalStation(int totalStation) {
        this.totalStation = totalStation;
        maxStation = minStation + totalStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        int newCurrentStation = currentStation;

        if (newCurrentStation == maxStation) {
            newCurrentStation = minStation;
        } else {
            newCurrentStation = newCurrentStation + 1;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        int newVolume = currentVolume + 1;
        if (newVolume > maxVolume) {
            newVolume = 100;
        }
        currentVolume = newVolume;
    }

    public void prevStation() {
        int newCurrentStation = currentStation;
        if (newCurrentStation == minStation) {
            newCurrentStation = maxStation;
        } else {
            newCurrentStation = newCurrentStation - 1;
        }
        currentStation = newCurrentStation;
    }

    public void decreaseVolume() {
        int newVolume = currentVolume - 1;
        if (newVolume < minVolume) {
            newVolume = 0;
        }
        currentVolume = newVolume;
    }
}


