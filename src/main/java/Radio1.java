import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Radio1 {
    private int radioNumber;
    private int currentVolume;
    private int maxRadio;
    private int minRadio = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio1 (int totalRadio) {
        if (totalRadio > 0) {
            this.maxRadio = totalRadio - 1;
            this.radioNumber = 0;
        }
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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        } else if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = newCurrentVolume;
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