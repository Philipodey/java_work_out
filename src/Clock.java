public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds){
       this.hour = hour;
       this.minutes = minutes;
       this.seconds = seconds;
    }
    public void setHour(int hour){
        if(hour > 23) this.hour = 0;
    }
    public int getHour(){
        return hour;
    }
    public void setMinutes(int minutes){
        if(minutes > 59) this.minutes = 0;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setSeconds(int seconds){
        if(seconds > 59) this.seconds = 0;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setDisplayTime(int hour, int minutes, int seconds) {
        System.out.printf("%.2d:%.2d:%.2d", hour, minutes, seconds);
    }


}

