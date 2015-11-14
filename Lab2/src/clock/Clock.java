package clock;

public class Clock {

    private int hour;
    private int min;
    private String name;
    private int alarmHour;
    private int alarmMin;
    private boolean format; //True = 24hour, False = 12hour.
    
    //Constructor
    public Clock(int _Hour, int _Min, String _Name, int _alarmHour, int _alarmMin, boolean _Format){
        name = _Name;
        hour = _Hour;
        min = _Min;
        alarmHour = _alarmHour;
        alarmMin = _alarmMin;
        format = _Format; 
    }
    
    //Getters kai setter
    public int getHour() {
        return hour;
    }

    
    public void setHour(int hour) {
        this.hour = hour;
    }

    
    public int getMin() {
        return min;
    }

    
    public void setMin(int min) {
        this.min = min;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAlarmHour() {
        return alarmHour;
    }

    
    public void setAlarmHour(int alarmHour) {
        this.alarmHour = alarmHour;
    }

    
    public int getAlarmMin() {
        return alarmMin;
    }

    
    public void setAlarmMin(int alarmMin) {
        this.alarmMin = alarmMin;
    }
   
    public boolean isMilitary() {
        return format;
    }
    
    public void setFormat(boolean format) {
        this.format = format;
    }
    
    
    public void advanceTime(int time){
        //Elenxoume an to roloi einai 24wro
        if(this.isMilitary()){
            //Elenxoume an prepei na pame mprosta mia wra
            if(time + min > 60){
                hour = (hour + 1 >= 24) ? 0 : hour + 1; //Elenxoume an prepei na gurisoume stn arxh tou rologiou (24 --> 00)
                advanceTime(time - 60);
            }else{
                min+=time;
            }
        }else{
            //To idio m apo panw alla gia 12wro roloi
            if(time + min > 60){
                hour = (hour + 1 > 12) ? 1 : hour + 1;
                advanceTime(time - 60);
            }else{
                min+=time;
            }
        }
    }
    
    public void tellTime(){
        //H String.format einai gia na mporesw na exw to string mou se metavliti k na mporw na kanw tn wra na emfanizete san roloi (px 09:01 kai oxi 9:1) 
        String timeToShow = String.format("The time now is %02d:%02d and the alarm is set for %-2d:%-2d", hour, min, alarmHour, alarmMin);
        System.out.println(timeToShow);
    }
    
    
}
