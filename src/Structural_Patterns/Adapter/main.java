package Structural_Patterns.Adapter;

public class main {

    public static void main(String[] args) {

       client ce= new client(new Adapter_Pattern(new Adaptee()),12314);

       ce.input();
       ce.print();


    }
}
