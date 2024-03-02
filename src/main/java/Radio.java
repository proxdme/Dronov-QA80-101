public class Radio {
    private int radioNumber ;
    private int currentVolume;
    private int maxRadio;
    private int minRadio = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int totalRadio) {
        if(totalRadio > 0) {
            this.maxRadio = totalRadio - 1;
            this.radioNumber = 0;
        }

    }

    // первый конструктор
    public Radio() {
        int totalRadio = 10;
        this.maxRadio = totalRadio - 1;
    }
    // второй конструктор

    public int getRadioNumber() {
        return radioNumber;
    }
    public int getMaxRadioNumber() {
        return maxRadio;
    }
    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber > maxRadio) {
            radioNumber = minRadio;
        } else if (newRadioNumber < minRadio) {
            radioNumber = maxRadio;
        } else {
            radioNumber = newRadioNumber;
        }
    }

    public void next() {
        if (radioNumber >= maxRadio) {
            radioNumber = minRadio;
        } else {
            radioNumber = radioNumber + 1;
        }
    }

    public void prev() {
        if (radioNumber <= minRadio) {
            radioNumber = maxRadio;
        } else {
            radioNumber = radioNumber - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        } else if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void plusV() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void minusV() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
