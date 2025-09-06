package Behavioral_Patterns.Strategy;


/* 학습 목표
    - 인터페이스 개념 이해
    - 델리게이트 개념 이해
    - 전략 패턴 개념 이해


    (인터페이스는 내가 알고 있는 인터페이스와 똑같다)
    (델리게이트는 spring boot를 사용할때 객체에서 다른 객체를 받아오는 경우가 있는데 이걸 사용한다 코드로 보여준다)
    (델리게이트: 어떤 객체가 해야 할 일을 직접 하지 않고, 다른 객체에게 대신 위임시켜 동작하는 방식)
    (전략패턴 : 어떤 행동을 할때 객체를 바꿔 끼울 수 있게 하는 패턴이다)

    간단하게 - 델리게이트: 책임을 다른 객체에게 위임, 전략패턴: 객체를 교체 가능하게 설계
 */

public class Strategy_Pattern {

    Strategy_Pattern_I tree_A= new tree_A(1);
    Strategy_Pattern_I tree_B=new tree_B(2);


    park Park1= new park(tree_A);
    park Park2= new park(tree_B);

    public static void main(String[] args) {

        //park_start();
        park_chain_system(false);

    }

    public static void park_start()
    {
        Strategy_Pattern_I tree_A= new tree_A(1);
        Strategy_Pattern_I tree_B=new tree_B(2);


        park Park1= new park(tree_A);
        park Park2= new park(tree_B);

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
        park Park;
        if(i)
        {
            Park =new park( new tree_A(132));
        }else{
            Park =new park( new tree_B(112));
        }

        Park.park_tree_print();


        /*
        *  i가 user에 입력이라고 생각하고 true 혹은 false에 따라 전략패턴을 사용하는 코드를 작성했다
        * */
    }





}
