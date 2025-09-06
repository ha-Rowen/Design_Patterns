package Behavioral_Patterns.Strategy;

public class tree_A implements Strategy_Pattern_I {


    String tree="등꽃 나무";
    int number= 0;
    public tree_A (int number)
    {
        this.number=number;
    }
    @Override
    public void tree_print() {
        System.out.println(number+"번 "+tree+" :나무");
    }
}
