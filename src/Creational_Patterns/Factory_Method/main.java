package Creational_Patterns.Factory_Method;

public class main {
    public static void main(String[] args) {


        Factory factory=new Item_Factory();
        factory.Prosess("Car");
        factory.Prosess("Car");
        factory.Prosess("Car");

        factory.Prosess("App");
        factory.Prosess("App");
        factory.Prosess("App");
        factory.Prosess("App");
        factory.Prosess("App");
        factory.Prosess("App");
        factory.Prosess("App");

    }
}
