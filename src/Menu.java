import java.util.*;

public class Menu {

    Scanner scan = new Scanner(System.in);
    Methods object = new Methods();

    // show the choice to the terminal
    public void showChoice () {
        System.out.println("************************************************************");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        System.out.println("3. Exit");
        System.out.println("Press the option to perform task");
        System.out.println("************************************************************");
    }

    public void encrypt () {
        System.out.println("Enter your Message:: ");
        String message = scan.nextLine();
        System.out.println("Enter Your Cipher Shift Value:: ");
        int shiftValue = scan.nextInt();
        int[] cipherText = object.encryption(message,shiftValue);
        System.out.println("Encrypted Message :: ");
        for (int i = 0; i < cipherText.length; i++) {
            System.out.print(cipherText[i] + " ");
        }
        System.out.println();
    }

    public void decrypt () {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter Cipher Shift Value:: ");
        int cipherValue = scan.nextInt();
        System.out.println("Enter the Encrypted Message:: ");
        int j = 0;
        do {
            list.add(scan.nextInt());
            j++;
        } while ((list.get(j-1) > 0));

        int[] cipherArray = new int[list.size() - 1];
        for (int i = 0; i < list.size() - 1; i++) {
            cipherArray[i] = list.get(i);
        }
        StringBuffer message = object.decryption(cipherArray,cipherValue);
        System.out.println("Here is your message ::");
        System.out.println(message);
    }

    public void exit () {
        System.out.println("Exiting.........");
    }
}
