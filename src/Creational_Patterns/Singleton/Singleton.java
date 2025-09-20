package Creational_Patterns.Singleton;

public class Singleton {

    private static Singleton sing;

    private int value;

    private Singleton()
    {
        this.value = 5;
    }

    public static Singleton Instanceget()
    {
        if(sing==null)
            sing=new Singleton();

        return sing;
    }

    public int ValueSet(int value)
    {
        this.value=value;
        return this.value;
    }



}
