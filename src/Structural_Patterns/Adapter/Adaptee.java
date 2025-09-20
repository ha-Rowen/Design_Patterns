package Structural_Patterns.Adapter;

public class Adaptee{
    public String value;


    public void Target_input(String value) {
     if(value_Prosecutor(value))
        this.value=value;
        System.out.println("정수->문자열 입력완료!");


    }


    private boolean value_Prosecutor(String value) {

        if(value.matches("\\d+")){

            return true;
        }
        else
        {
            System.out.println("수자형 문자열이 입력되지 않았습니다.");
            return false;
        }


    }

    public String Setter()
    {
        return value;
    }
}
