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

   tree tree;
    public Strategy_Pattern(tree tree)
    {

        this.tree= tree;
    }

    public void park_tree_print()
    {
        tree.tree_print();
    }

}
