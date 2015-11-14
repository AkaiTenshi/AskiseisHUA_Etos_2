package clock;

/* To class auto tha voithisei sthn kalhterh diaxeirish
 * twn timwn kai oriwn stous "deiktes" tou rologiou mas
 */
public class NumberDisplay {
    private int limit; //Edw tha kratame to orio (12, 24 h 60)
    private int value; //H timh gia tis wres h ta lepta.
    
    //Constructor
    public NumberDisplay(int _Value, int _Limit){
        limit = _Limit;
        value = _Value;
    }
    
    //Getter kai Setters
    public int getLimit() {
        return limit;
    }

    
    public void setLimit(int limit) {
        this.limit = limit;
    }

    
    public int getValue() {
        return value;
    }

    
    public void setValue(int value) {
        this.value = value;
    }
}
