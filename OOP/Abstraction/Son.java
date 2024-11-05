package OOP.Abstraction;

public class Son extends Parent {

    //age is field in Parent abstract class
    public Son(int age){
      super(age);
   
    }

    @Override
    void career(){
        System.out.println( "I am a software Developer");
    }

    @Override

    void partner(){
        System.out.println("My partener is Chinese");
    }
    
}
