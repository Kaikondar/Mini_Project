import java.util.*;
class Food {
      String dishName;
      int count;
      int totalAmount=0;
      public void choose(){
           Scanner sc=new Scanner(System.in);
           BreakFast b=new BreakFast();
           Lunch l=new Lunch();
           Dinner d=new Dinner();
           Chart_Items s=new Chart_Items();
           System.out.println("Which Menu Do you Want!");
           System.out.println("1.BreakFast Menu");
           System.out.println("2.Lunch Menu");
           System.out.println("3.Dinner Menu");
           System.out.println("4.Chart Items");
           System.out.println("5.CoolDrinks/Juice");
           System.out.println("5.Exit");
           System.out.println("Choose One Option");
           int ch=sc.nextInt();
           switch (ch) {
            case 1:
                  b.dis();
                  b.confirm();
                  b.bill();
                  b.payment();
                  greet();
                  break;
            case 2:
                l.dis();
                l.confirm();
                l.bill();
                l.payment();
                greet();
                break;
            case 3:
            d.dis();
            d.confirm();
            d.bill();
            d.payment();
            greet();
            break; 
            case 4:
                s.dis();
                s.confirm();
                s.bill();
                s.payment();
                greet();
                break;   


            default:
                  break;
           }
           
      }
      public void dis(){
            
      }
      public void confirm(){
            
      }
      public void bill(){
            //return 0;
      }
      public void payment(){

      }
      public static void greet(){
            System.out.println("ThankYou For Ordering Food");
            System.out.println("Have a great Day :)");
      }
}
