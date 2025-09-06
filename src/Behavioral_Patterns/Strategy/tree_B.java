package Behavioral_Patterns.Strategy;

public class tree_B implements Strategy_Pattern_I {

    String tree="벚꽃 나무";
    int number= 0;
    public tree_B (int number)
    {
        this.number=number;
    }
    @Override
    public void tree_print() {
        System.out.println(number+"번 "+tree+" :나무");
    }
}
