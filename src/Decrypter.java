
public class Decrypter {

	   public String decrypt(String num) {
	       String crypnum = "";
	       //loop through the string
	       for(int i = 0 ; i < num.length() ; i++ ) {
	           // subtract each number by 7
	           int n = ((Integer.parseInt(num.charAt(i)+"")) -7) ;
	           // add 10 
	           if (n < 0)
	               n += 10;
	           
	           crypnum = crypnum + n;
	       }
	       // swap the first with third and second digit with fourth digit
	       String decrypt = crypnum.charAt(2) +""+ crypnum.charAt(3)+"" + crypnum.charAt(0)+""+crypnum.charAt(1)+"";
	       //return decrypted message
	       return decrypt;
	      
	   }


	}

