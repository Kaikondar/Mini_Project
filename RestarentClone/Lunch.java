
import java.util.*;
import java.util.Scanner;

class Lunch extends Food{
      int briyaniPrice=200;
      int mealsPrice=150;
      int chickenRicePrice=150;
      int c;
      public Lunch(){
            this.c=super.totalAmount;
      }
     
     

     

      @Override
      public void confirm() {
            Scanner sc=new Scanner(System.in);
          
          int ch=0;
           do{
            ch=sc.nextInt();
              switch (ch) {
                  case 1:
                  System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*briyaniPrice;      
                     break;
                  case 2:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*mealsPrice;      
                     break;
                     case 3:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*chickenRicePrice;      
                     break;      
                       
              
                  default:
                  System.out.println("Choose Correct Option");
                        break;
              }
              if(ch!=4){
              System.out.println("Do You Want Any Other Dishes");
              System.out.println("1.Yes");
              System.out.println("2.No");
              int q=sc.nextInt();
              if(q==2){
                  System.out.println("ThankYou");
                  break;
              }else{
                 dis();
                
              }
            }
           }while(ch!=4);

      }

      @Override
      public void dis() {
            System.out.println("1.Briyani - $200");
            System.out.println("2.Meals - $150");
            System.out.println("3.ChickenRice - $150");
            System.out.println("Select The Dishes You Want");
      }

      @Override
      public void payment() {
           
      }
      public void bill() {
            System.out.println("TOTAL: "+c);
             
        }
      
}
