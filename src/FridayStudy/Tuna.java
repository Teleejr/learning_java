package src.FridayStudy;

public class Tuna {
    //Recreate time class example with Leah.
    //Fields
    private int hour;
    private int minute;
    private int second;

    //Constructors
    //No arg
    public Tuna() {
        this(0, 0, 0);
    }
    //1 arg
    public Tuna(int h) {
        this(h, 0, 0);
    }
    //2 args
    public Tuna(int h, int m) {
        this(h, m, 0);
    }
    //3 args
    public Tuna(int h, int m, int s) {
        this.setTime(h, m, s);
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

    public void setHour(int h){
        hour = (h >= 0 && h < 24) ? h : 0;
    }

    public void setMinute(int m){
        minute = (m >= 0 && m < 24) ? m : 0;
    }

    public void setSecond(int s){
        second = (s >= 0 && s < 24) ? s : 0;
    }

    private void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public String printTuna() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }


}
