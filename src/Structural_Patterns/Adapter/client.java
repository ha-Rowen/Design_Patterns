package Structural_Patterns.Adapter;

public class client {
    int number = 2391;
    Adapter_Interface Ap;
    public client(Adapter_Interface Ap, int number)
    {
        this.Ap=Ap;
        this.number=number;

        System.out.println(number+": 정수 입력준비 완료");

    }

    public void input()
    {
        Ap.Adaptee_input(number);
    }
    public void print()
    {
        Ap.Adaptee_print();
    }

    public int setter()
    {
        return number;
    }
}
