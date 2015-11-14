package clock;

public class Clock {

    private NumberDisplay hour;
    private NumberDisplay min;
    private NumberDisplay alarmHour;
    private NumberDisplay alarmMin;
    private String name;
    private boolean format; //True = 24hour, False = 12hour.
    
    //Constructor
    public Clock(int _Hour, int _Min, int _alarmHour, int _alarmMin, String _Name, boolean _Format){
        //Ftiaxnoume ena NumberDisplay object kai m ena mikro conditional elenxoume an eimaste sto 12wro h 24wro format kai thetoume ta limit analoga.
        hour = new NumberDisplay(_Hour, _Format ? 24 : 12);         
        
        min = new NumberDisplay(_Min, 60);
        
        alarmHour = new NumberDisplay(_alarmHour, _Format ? 12 : 24); //To idio me to hour.
        
        alarmMin = new NumberDisplay(_alarmMin, 60);
        
        name = _Name;
        
        format = _Format;
    }
    
    //I suppose time is meant to be in min only
    public void advanceTime(int time){
        int tempHours = time / 60; //Kratame tis wres pou uparxoun sta lepta pou mas edwsan
        int tempMinutes = time % 60; //Kai ta lepta pou periseuoun, px 80 min = 1hour + 20min
        
        //Prosthetoume ta lepta st roloi mas k elenxoume an prepei na proxwrisoume 1 wra brosta
        min.setValue(min.getValue()+tempMinutes);
        if(min.getValue() >= min.getLimit()){
            min.setValue(min.getValue() - 60);
            tempHours++;
        }
        //Prosthetoume tis wres k elenxoume an exoume kanei enan olokliro kuklo kai prepei na gurisoume piso sto 00:00 h 01:00
        hour.setValue(hour.getValue() + tempHours);
        if(hour.getValue() >= hour.getLimit()){
            hour.setValue(hour.getValue() % hour.getLimit());
        }
    }
    
    public void tellTime(){
        //Ftiaxnoume ena String me to mhnuma tis wras kai xrisimopoioume thn method format gia na kanoume morfopoihseis stis metavlites mas (09:01 anti gia 9:1)
        String timeToShow = String.format("The time now is %02d:%02d and the alarm is set for %02d:%02d", hour.getValue(), min.getValue(), alarmHour.getValue(), alarmMin.getValue());
        System.out.println(timeToShow);
    }

    /* Getters kai Setters. Prosoxi st oti edw
     * dn xreiazomaste getter&setter gia hour, min
     * kai alarm kathos uparxoun st NumberDisplay class
     */
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public boolean isMilitary() {
        return format;
    }

   
    public void setFormat(boolean format) {
        this.format = format;
    }
    
}
