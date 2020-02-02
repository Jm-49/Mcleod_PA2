import java.util.Scanner;
public class Problem1 {
	  public static void main(String[] args) {
	       System.out.print("Enter four digit integer:");
	       Scanner scan = new Scanner(System.in);
	       String num = scan.nextLine();
	       //Make sure to only enter 4 digits
	       if(num.length() != 4) {
	           // if else statement 
	           System.out.println("Incorrect amount of digits.\n Please enter 4 digit number");
	           return;
}
	       
	       Encrypter encryption = new Encrypter();
	       // Call to encrypter 
	       String encrypt = encryption.encrypt(num);
	       
	       System.out.println("Encrypted value:"+encrypt);
	       
	       Decrypter decrypt = new Decrypter();
	       //Call to decrypter
	       String decrpt = decrypt.decrypt(encrypt);
	       
	     System.out.println("Decrypted value:"+decrpt);     
}
}