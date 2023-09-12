package Tdd;

public class Television {
        private int channel;
        private int volumeLevel=1;
        private boolean on =false;

        public void turnOff(){
            this.on=false;
        }

        public void turnOn() {
            this.on = true;
        }

        public void setChannel(int newChannel){

            if (on && newChannel>=1 && newChannel<120 )
                channel=newChannel;
        }

        public void setVolume(int newVolumeLevel) {
            if (on && newVolumeLevel>1 && newVolumeLevel<7)
                volumeLevel = newVolumeLevel;
        }
        public void increaseVolume(){
            if (volumeLevel>1 && volumeLevel<7)
                volumeLevel=volumeLevel+1;

        }
        public void decreaseVolume(){
            if (volumeLevel>1 && volumeLevel<7)
                volumeLevel=volumeLevel-1;

        }
        public void channelUp(){
            if (on && channel<120)
                channel=channel+1;
        }
        public void channelDown(){
            if (on && channel>1)
                channel= channel-1;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolumeLevel() {
            return volumeLevel;
        }
    }



