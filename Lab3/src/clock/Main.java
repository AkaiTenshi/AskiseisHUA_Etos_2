package clock;

public class Main {
    public static void main(String args[]){
        Clock test = new Clock(12, 0, 7, 40, "Testing Clock", true);
        
        test.tellTime();
        
        test.advanceTime(60);
        
        test.tellTime();
    }
}
