package clock;

public class ClockTest {

    public static void main(String[] args) {
        Clock tester = new Clock(0, 37, "Askisi2", 10, 30, true);
        
        tester.tellTime();
        
        tester.advanceTime(111);
        
        tester.tellTime();
        
        if(tester.getName().contains("a")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
            
    }

}
