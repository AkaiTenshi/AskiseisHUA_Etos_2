package clock;

public class Main {

    public static void main(String[] args) {
     Clock test1  = new Clock();
     Clock test2 = new Clock(22, 58);
     Clock test3 = new Clock(22, 58, 7, 30);
     
     test1.howManyClocks();
    }

}
