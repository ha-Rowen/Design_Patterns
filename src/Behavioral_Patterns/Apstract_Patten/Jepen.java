package Behavioral_Patterns.Apstract_Patten;

public class Jepen extends Apstract_calss{
    String From="Jepen";
    @Override
    protected boolean from(String from) {
        if(From.equals(from))
            return true;
        else
            return false;
    }

    @Override
    protected void save() {
        System.out.println("saving to database Jepen Language");

    }
}
