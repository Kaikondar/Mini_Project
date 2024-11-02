import java.util.*;
class Rock_Paper_ScissorsGame{
      
      
    public static void main(String[] args) {
      
      Game game=new Game();
      game.start();
    }
    
}
class Game{
      String name="";
      String[]choice={"Paper","Scissor","Stone"};
      static int userScore=0,computerScore=0;
      public Game(){

      }
      public void start(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Name");
            String n=sc.next();
            this.name=n;
            int ch=0;
            boolean f=true;
            while(true){
                  System.out.println("Are You Continue? ");
                  System.out.println("1.YES");
                  System.out.println("2.NO");
                  ch=sc.nextInt();
                  switch (ch) {
                        case 1:
                              play();
                              break;
                        case 2:
                        System.out.println(name + "Score" + userScore);
                        System.out.println("Computer Score " + computerScore);
                        f=false;
                        break; 
                        default:
                             System.out.println("Choose Correct One");
                              break;
                  }
                  if(!f){
                        break;
                  }
            }
      }
      public void play(){
            Scanner sc=new Scanner(System.in);
            Random ran=new Random();
            System.out.println("Choose One Option");
            System.out.println("1.Paper");
            System.out.println("2.Scissor");
            System.out.println("3.Stone");
            int in=sc.nextInt();
            String user=choice[in-1];
            int computerIndex=ran.nextInt(3);
            String computerChoose=choice[computerIndex];
            if(computerChoose.equals(user)){
                  System.out.println("Tie");
            }else if((user.equals("Paper") && computerChoose.equals("Stone")) || (user.equals("Scissor") && computerChoose.equals("Paper")) || (user.equals("Stone") && computerChoose.equals("Scissor"))){
                  userScore+=10;
                  System.out.println(name + " Won");
            } else{
                  computerScore+=10;
                  System.out.println(name + " Lost");
            }
            System.out.println(name + "Choose " +user);
            System.out.println("Computer Choose " + computerChoose);

      }
}
