package Behavioral_Patterns.Apstract_Patten;

public class Korean_class extends Apstract_calss {

    String From="Korean";
    @Override
    protected  boolean from(String from) {
        if(From.equals(from))
            return true;
        else
            return false;
    }

    @Override
   protected void save() {
        System.out.println("saving to database korean Language");

    }
}
