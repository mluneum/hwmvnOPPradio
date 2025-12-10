package ru.netology.javamvn.radioForImportantClient.newFunction;

public class Radio {
    private int currentStation;   // номер текущей радиостанции (0–9)
    private int currentVolume;    // громкость (0–100)


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0 && newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
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