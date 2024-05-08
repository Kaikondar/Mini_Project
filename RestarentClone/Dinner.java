import java.util.*;
import java.util.Scanner;

class Dinner extends Food{
    int dosaprice=100;
    int idlyprice=10;
    int parrotaprice=20;
    int chickenriceprice=100;
    int eggricepricee=70;
    int mushroomprice=50;
    int c;
    public Dinner(){
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
                     c+=count*dosaprice;      
                     break;
                  case 2:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*idlyprice;      
                     break;
                  case 3:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*parrotaprice;      
                     break;    
                     case 4:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*chickenriceprice;      
                     break;   
                     case 5:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*eggricepricee;      
                     break;   
                     case 6:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*mushroomprice;      
                     break;     
                       
              
                  default:
                        break;
              }
              System.out.println("Do You Want Any Other Dishes");
              System.out.println("1.Yes");
              System.out.println("2.No");
              int q=sc.nextInt();
              if(q==2){
                  break;
              }else{
                 dis();
                 
                 continue;
              }
           }while(ch!=7);

      }

      @Override
      public void dis() {
            System.out.println("1.Dosa - $100");
            System.out.println("2.Idly - $10");
            System.out.println("3.ChickenRice - $150");
            System.out.println("4.Parrota - $20");
            System.out.println("5.Egg Rice - $70");
            System.out.println("6.Mushroom - $50");
            System.out.println("Select The Dishes You Want");
      }

      @Override
      public void payment() {
            Payment payy=new Payment(); 
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Choose PayMent Mode");
                   System.out.println("1.Nett Banking");
                   System.out.println("2.Cash On Delivery");
                   int pay=sc.nextInt();
                   if(pay==2){
                    payy.cashOn();
                   }else{
                      payy.nettBank(); 
                   }
      }
      public void bill() {
            System.out.println("TOTAL: "+c);
             
        }

}