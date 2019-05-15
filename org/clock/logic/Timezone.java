package org.clock.logic;

public class Timezone {
    private int hour;
    private int minute;
    private int pos;
    public Timezone( int hour, int minute, int pos){
        this.hour = hour;
        this.minute = minute;
        this.pos = pos;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getPos(){
        return pos;
    }

}
