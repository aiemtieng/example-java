public class quiz {
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.turnOn();
        t1.tostring();

        TV t2 = new TV(30, 3);
        t2.turnOn();
        t2.tostring();

        TV t3 = new TV(30, 1);
        t3.turnOn();
        t3.channelUp();
        t3.volumeDown();
        t3.volumeDown();
        t3.tostring();
    }

    public static class TV {
        private int channel;
        private int volumeLevel;
        private boolean on = false;

        public TV() {
            channel = 1;
            volumeLevel = 1;
        }

        public TV(int Ch, int Vol) {
            this.channel = Ch;
            this.volumeLevel = Vol;
        }

        public void turnOn() {
            on = true;
        }

        public void turnOff() {
            on = false;
        }

        public void setChannel(int newChannel) {
            if (on && newChannel >= 1 && newChannel <= 30)
                channel = newChannel;
        }

        public void channelUp() {
            if (on && channel < 30)
                channel++;
        }

        public void channelDown() {
            if (on && channel > 1)
                channel--;
        }

        public void setVolume(int newVolumeLevel) {
            if (on && newVolumeLevel >= 0 && newVolumeLevel <= 15)
                volumeLevel = newVolumeLevel;
        }

        public void volumeUp() {
            if (on && volumeLevel < 15)
                volumeLevel++;
        }

        public void volumeDown() {
            if (on && volumeLevel > 0)
                volumeLevel--;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolume() {
            return volumeLevel;
        }

        public void tostring() {
            System.out.println("Now TV's channel is " + getChannel() + " and volume level is " + getVolume());
        }
    }
}
