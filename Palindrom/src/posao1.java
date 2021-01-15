/**
 *
 * @author Antonio Jozinoviæ
 */
import java.util.Scanner;

public class posao1 {
	 public static void main(String args[]) {
		 Scanner rijecScan = new Scanner(System.in);
		 
		 System.out.println("Unesite string:");
		 String rijec = rijecScan.nextLine();
		 String rijec2 = rijec.replaceAll("\\s+", "").toLowerCase();
		 
		 String obrnuto = new StringBuffer(rijec).reverse().toString();
		 System.out.println(obrnuto);
		 String obrnuto2 = obrnuto.replaceAll("\\s+", "").toLowerCase();
		 
		 if(rijec2.equals(obrnuto2)) {
			 System.out.println("");
			 System.out.println("Rijeè je polindrom");
		 }
		 else{
			 System.out.println("");
			 System.out.println("Rijeè nije polindrom");
		 }
		 
	 }
}