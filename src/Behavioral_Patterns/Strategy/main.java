package Behavioral_Patterns.Strategy;

public class main {
    static tree_A tree_A;
    static tree_B tree_B;
    static Strategy_Pattern Strategy;




    public static void main(String[] args) {

        tree_A = new tree_A(1);
        tree_B = new tree_B(2);

        Strategy= new Strategy_Pattern(tree_A);
        Strategy.park_tree_print();
        //park_chain_system(false);

    }







    public static void park_start()
    {
        tree tree_A= new tree_A(1);
        tree tree_B=new tree_B(2);


        Strategy_Pattern Park1= new Strategy_Pattern(tree_A);
        Strategy_Pattern Park2= new Strategy_Pattern(tree_B);

        Park1.park_tree_print();
        Park2.park_tree_print();
        /* 전략패턴 설명
         * tree_A, tree_B는 꽃의 종류를 담은 것이다. 또한 어떤 나무인지 알려주는 출력함수도 가지고 있다.
         * park는 어떠한 나무객체를 하나 받고, 그 객체에게 자신의 수행해야 하는 기능을 전달받고 그걸 다른 객체에게 위임 하는 수준이다.
         * 이렇게 된다면 특수한 어떤 나무 객체가 생겨도 손쉽게 추가하며 상황에 맞게 교체해서 사용할 수 있다.
         * */
    }

    public static void park_chain_system(boolean i)
    {
        Strategy_Pattern Park;
        if(i)
        {
            Park =new Strategy_Pattern( new tree_A(132));
        }else{
            Park =new Strategy_Pattern( new tree_B(112));
        }

        Park.park_tree_print();


        /*
         *  i가 user에 입력이라고 생각하고 true 혹은 false에 따라 전략패턴을 사용하는 코드를 작성했다
         * */
    }
}
