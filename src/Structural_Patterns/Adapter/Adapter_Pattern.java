package Structural_Patterns.Adapter;

/* 학습목표
    - 어댑터 패턴이해

   (어댑터 패턴은 서로 호환되지 않는 인터페이스를 가진 클래스 중간에 존재하여 서로 호환될 수 있게 지원한다)

   설정
   - Target 클래스에서 String형 숫자만 입력 받아 저장 할 수 있다.
   - Input  클래스에서 오직 int형 값만 보낼 수 있고 Target 클래스에 값을 보낼 생각이다.(어댑터가 없으면 오류가 뜬다)
   - adapter_pattern: Input과 Target 클래스가 정장 동작 할 수 있도록 중간변환자 역할을 한다.

   추가
   - 실습해보는 어덥테 패턴은 객체 어댑터이고 추가적으로 클래스 어댑터 또한 존재한다
 */
public class Adapter_Pattern implements Adapter_Interface {

    static Adaptee adaptee;



    public Adapter_Pattern(Adaptee adaptee) {
        this.adaptee = adaptee;

    }

    @Override
    public void Adaptee_input(int number) {

        adaptee.Target_input(Integer.toString(number));

    }

    @Override
    public void Adaptee_print() {
        System.out.println(adaptee.Setter()+": Adaptee 저장된 값");

    }




}
