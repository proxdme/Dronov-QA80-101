public class Radio {
    private int radioNumber;
    private int currentVolume;

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

    public void next() {
        if (radioNumber >= 9) {
            radioNumber = 0;
        } else {
            radioNumber = radioNumber + 1;
        }
    }

    public void prev() {
        if (radioNumber <= 0) {
            radioNumber = 9;
        } else {
            radioNumber = radioNumber - 1;
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

    public void plusV() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void minusV() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
