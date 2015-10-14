package helloworldapp;

public class Human {
    int age;
    String name;
    boolean alive;
    public Human(int a, String b, boolean c){
        age = a;
        name = b;
        alive = c;
        
    }
    
    void increaseAge(){
        age++;
    }
}
