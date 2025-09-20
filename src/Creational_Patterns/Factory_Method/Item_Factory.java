package Creational_Patterns.Factory_Method;

import java.util.HashMap;
import java.util.Objects;

public class Item_Factory extends Factory {

    static private HashMap<String, Byte> hm =new HashMap<>();
    static private final Byte Stop_number=1;
    public Item_Factory() {
        hm.put("Car", (byte)2);
        hm.put("App", (byte)5);
    }

    @Override
    public boolean isCreateble(String name)
    {
        if(hm.get(name)>=Stop_number)
        {
            return true;
        }
        return false;
    }

    @Override
    public Item create(String name) {

        if(name.equals("Car"))
            return new Item_Car();
        if(name.equals("App"))
           return new Item_App();

        return null;
    }

    @Override
    public void PostprosessItem(String name) {
       byte tem =hm.get(name);
       hm.put(name,--tem);


    }
}
