public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void toMaxVolume() {
        currentVolume = 100;
    }

    public void toMinVolume() {
        currentVolume = 0;
    }

    public void riseVolume() {
        if (currentVolume <= 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume >= 0) {
            currentVolume--;
        }
    }


    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > 9) {
            newStation = 0;
        }
        if (newStation < 0) {
            newStation = 9;
        }
        currentStation = newStation;
    }

    public void toMaxStation() {
        currentStation = 9;
    }

    public void toMinStation() {
        currentStation = 0;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        }
    }
}

