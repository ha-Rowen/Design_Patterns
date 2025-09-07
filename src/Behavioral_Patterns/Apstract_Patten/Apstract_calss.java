package Behavioral_Patterns.Apstract_Patten;

abstract public class Apstract_calss {
    public void user_chak(User user){
        if(from(user.From)){
         User_information_print(user);
         save();
        }else
        {
            System.out.println("No service in your county");
        }
    }
    abstract boolean from(String name);
    abstract void save();


   private void User_information_print(User user){
        System.out.println(user.name);
        System.out.println(user.From);
    }


}

