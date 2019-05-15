package org.clock.logic;

public class ClockLogic {
    private int hour;
    private int minute;
    private int second;
    public ClockLogic(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public ClockLogic(int hour, int minute, int second, Timezone hb){
        if( hb.getPos() == 1){
            this.hour = hour + hb.getHour();
            this.minute = minute + hb.getMinute();
            if(this.second >= 60){
                this.minute += this.second/60;
                this.second = this.second%60;
            }
            if( this.minute >= 60){
                this.hour += this.minute/60;
                this.minute = this.minute%60;
            }
            if( this.hour >= 12){
                this.hour = this.hour%12;
            }
        }else{
            this.hour = hour - hb.getHour();
            this.minute = minute - hb.getMinute();
        }

    }
    public void setClock(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void tik( int sec ){
       // if(sec>=3600){
            hour += sec/3600;
            sec = sec%3600;
            minute += sec/60;
            sec = sec%60;
            second += sec;
       /* }else if(sec >= 60){
            minute += sec/60;
            sec = sec%60;
            second = sec;
        }else {
            second = sec;
        }*/
        if(second >= 60){
            minute += second/60;
            second = second%60;
        }
        if( minute >= 60){
            hour += minute/60;
            minute = minute%60;
        }
        if( hour >= 12){
            hour = hour%12;
        }
        System.out.println(second);
    }
}
