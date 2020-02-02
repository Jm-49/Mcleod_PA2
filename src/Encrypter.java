
public class Encrypter {
	
	   // method to encrypt number 
	   public String encrypt(String num) {
	       String crypnum = "";
	       //create a loop for the numbers 
	       for(int i = 0 ; i < num.length() ; i++ ) {
	           //Add 7 to each number then divide by 10
	           int n = ((Integer.parseInt(num.charAt(i)+"") )+ 7) % 10;
	          
	           crypnum = crypnum + n;
	       }
	       // swap the first with third and second digit with fourth digit
	       String encrypedmessage = crypnum.charAt(2)+ "" + crypnum.charAt(3)+"" + crypnum.charAt(0)+""+crypnum.charAt(1)+"";
	       //return encrypted message
	       return encrypedmessage;
	      
	   }

	}

