public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;


    public Radio(int stationCount) {
        maxStation = stationCount;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
            return;
        }


    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

        public void  prevVolume(){
            if (currentVolume == 0){
                return;
            }
            else{
                currentVolume--;
            }
            this.currentVolume=currentVolume;

        }
        public void  nextVolume(){
            if (currentVolume == 100){
                return;
            }
            else{
                currentVolume++;
            }
            this.currentVolume=currentVolume;

        }
//
}
