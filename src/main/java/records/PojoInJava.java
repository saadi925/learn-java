package records;

//  plain o java object

public class PojoInJava {
   public  record Account (
           Integer id,
           String name,
           double amount
   ){
      public void  printName() {
         System.out.println(this.name);
      }
   }

   public static void main(String[] args) {
      Account account = new Account(2,"Syed's Account", 200);
      System.out.println(account);
   }

}
