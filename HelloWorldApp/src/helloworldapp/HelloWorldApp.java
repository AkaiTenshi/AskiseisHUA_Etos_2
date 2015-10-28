package helloworldapp;

public class HelloWorldApp {

    public static void main(String[] args) {
        //1st way of doing it
        System.out.println("Hello, World!");
        //2nd way (pointless)
        System.out.println("Hello, " + "World!");
        //3rd way (The right way)
        String message = "Hello, World!";
        System.out.println(message);
        
        /*
         * Oi metavlites pou anaferontai se kapio class
         * onomazontai Objects. Gia na dimiourgisoume 
         * Objects xrisimopoioume ton operator new.
         * Prosoxi! Den xreazete na anaferoume kapou to 
         * Human.java pou ftiaksame. H glwssa einai arketa
         * eksupni wste na gnorizei pou einai (arkei na 
         * vriskontai sto idio paketo)
        */
        Human Chris = new Human();
        
        Chris.age = 19;
        Chris.name = "Chris";
        Chris.alive = true;
        
        System.out.println(Chris.age); //Edw perimenoume 19
        
        Chris.increaseAge();
        
        System.out.println(Chris.age); //Edw perimenoume 20
        
        /*
         *
         * Mexri edw htan to Lab 1
         *
         */
    }
    
}
