import java.util.Scanner;

class Bus_Reservation{
     static boolean[]seats=new boolean[10];
     static int seatno;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Book Seat");
            System.out.println("2.Cancel reservation");
            System.out.println("3.View Available Seats");
            System.out.println("4.Exit");
            int no=sc.nextInt();
            switch (no) {
                case 1:
                    Book.book();
                    break;
                case 2:
                  Cancel.cancel();
                  break;    
                case 3:
                   View.view();
                   break;
                case 4:
                   Exit.ex();
                   System.exit(no);   
                default:
                    break;
            }
        }
    }
}

//Ticket Booking Class
import java.util.Scanner;

class Book extends Bus_Reservation{

    public static void book(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Seat No");
        int no=sc.nextInt();
        if(no>10){
            System.out.println("Please Enter Valid Seat No");
            return;
        }
        if(seats[no-1]){
            System.out.println("Already Booked");
            return;
        }
        seats[no-1]=true;
        System.out.println("Ticket Booking Confirmed");
    }
}

//Cancellation Class
import java.util.Scanner;

class Cancel extends Bus_Reservation{

    public static void cancel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Ticket No");
        int no=sc.nextInt();
        if(no<1 || no>10){
            System.out.println("Please Enter Valid No!");
            return;
        }
        if(!seats[no-1]){
            System.out.println("Ticket Not Reserved");
            return;
        }
        seats[no-1]=false;
        System.out.println("Ticket Cancelled");
    }
}

//View Available Tickets Class
 class  View extends Bus_Reservation{
    public static void view(){
        System.out.println("Available Tickets");
        for(int i=0;i<seats.length;i++){
            if(!seats[i]){
                System.out.print(i+1 + " " );
            }
        }
        System.out.println();
    }
}

//Exit Class
class Exit{
    public static void ex(){
        System.out.println("Last Booking Cancelled");
        return;
    }
}
