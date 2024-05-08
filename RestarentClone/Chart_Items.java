import java.util.*;
class Chart_Items extends Food{
      int c;
      int vegsandprice=50;
      int cheesesandprice=70;
      int samosaprice=10;
      int panipooriprice=50;
      int breadomletprice=70;
      int eggpuffsprice=15;
      int vegpuffsprice=12;
      public Chart_Items(){
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
                     c+=count*vegsandprice;      
                     break;
                  case 2:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*cheesesandprice;      
                     break;
                  case 3:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*samosaprice;      
                     break;    
                     case 4:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*panipooriprice;      
                     break;   
                     case 5:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*breadomletprice;      
                     break;   
                     case 6:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*eggpuffsprice;      
                     break; 
                     case 7:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*vegpuffsprice;      
                     break;     
                       
              
                  default:
                        break;
              }
              if(ch!=8){
              System.out.println("Do You Want Any Other Dishes");
              System.out.println("1.Yes");
              System.out.println("2.No");
              int q=sc.nextInt();
              if(q==2){
                  break;
              }else{
                 dis();
                
              }
            }
           }while(ch!=8);

      }

      @Override
      public void dis() {
            System.out.println("1.Sandwich(Veg) - $50");
            System.out.println("2.Sandwich(Cheese) - $70");
            System.out.println("3.Samosa - $10");
            System.out.println("4.PaaniPoori - $50");
            System.out.println("5.BreadOmblate - $70");
            System.out.println("6.Egg Puffs - $15");
            System.out.println("6.Veg Puffs - $12");
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