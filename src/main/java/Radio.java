public class Radio {
    public int radioNumber;
    public int currentVolume;

    public int getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber > 9) {
            radioNumber = 0;
        } else if (newRadioNumber < 0) {
            radioNumber = 9;
        } else {
            radioNumber = newRadioNumber;
        }
    }

    public void next(int newRadioNumber) {
        if (newRadioNumber > 9) {
            radioNumber = 0;
        } else {
            radioNumber = newRadioNumber + 1;
        }
    }

    public void prev(int newRadioNumber) {
        if (newRadioNumber < 0) {
            radioNumber = 9;
        } else {
            radioNumber = newRadioNumber - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else if (newCurrentVolume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void plusV(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
    }

    public void minusV(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
    }
}
