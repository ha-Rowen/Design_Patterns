package Creational_Patterns.Factory_Method;

abstract public class Factory {
    public Item Prosess(String name){

      if( isCreateble(name))
      {
        Item item= create(name);
        PostprosessItem(name);
        item.use();
        return item;
      }
      else {
          System.out.println("생성불가");
      }
      return null;
    }

   abstract public boolean isCreateble(String name);//아이템 추가가능 여부
    abstract public Item create(String name);
    abstract public void PostprosessItem(String name);

}
