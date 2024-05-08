
import java.util.*;;
class BreakFast extends Food{
            int pongalPrice=100;
            int idlyPrice=20;
            int pooriPrice=25;
            int dosaPrice=35;
            int c;
            public BreakFast() {
                     this.c=super.totalAmount;
                     
             }
         
               @Override
               public void dis() {
                     // TODO Auto-generated method stub
                     System.out.println("PONGAL - $100");
                     System.out.println("IDLY - $20");
                     System.out.println("POORI - $25");
                     System.out.println("DOSA - $35");
                    
               }
         
               @Override
               public void confirm() {
                     // TODO Auto-generated method stub
                    
                     Scanner sc=new Scanner(System.in);
                   int ch=0;
                   
                    do{
                        
                        System.out.println("Choose The Dish");
                        ch=sc.nextInt();
                    switch (ch) {
                     case 1:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*pongalPrice;      
                     break;
                     case 2:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*pongalPrice;      
                     break;
                     case 3:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*pongalPrice;      
                     break;
                     case 4:
                     System.out.println("HowMuch Needed");
                     count=sc.nextInt();
                     c+=count*pongalPrice;      
                     break;
                    
                     default:
                     System.out.println("Choose Correct Option");
                     dis();
                     break;
                    }
                    if(ch!=5){
                    System.out.println("Do you want Another Dishes");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int q=sc.nextInt();
                    if(q==1){
                    dis();
                   
                   
                    }

                    else
                    break; 
                  }
               }while(ch!=5);
                    
               }
         
               @Override
               public void bill() {
                     // TODO Auto-generated method stub
                     //return totalAmount;
                     System.out.println("TOTAL: "+c);
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
}
         

