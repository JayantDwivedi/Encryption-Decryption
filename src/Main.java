import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       boolean flag = true;
       Menu object = new Menu();
       Scanner scan = new Scanner(System.in);

       while (flag) {
           object.showChoice();
           int choice = scan.nextInt();

           switch (choice) {
               case 1:
                   object.encrypt();
                   break;

               case 2:
                   System.out.println("****ENTER A EXTRA ZERO AFTER ENCRYPTED MESSAGE****");
                   System.out.println();
                   object.decrypt();
                   break;
               case 3:
                   object.exit();
                   flag = false;
                   break;
           }
       }
    }
}
//84 113 120 120 1232
