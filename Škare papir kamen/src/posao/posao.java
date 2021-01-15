/**
 *
 * @author Antonio Jozinoviæ
 */
package posao;
import java.util.Scanner;
import java.util.Random;
public class posao {

    public static void main(String args[]) {
        Scanner rundeScan = new Scanner(System.in);
        Scanner imeScan = new Scanner(System.in);
        Scanner odabirScan = new Scanner(System.in);
        Random nasumicno = new Random();
        int racunalo = 0;
        int igrac = 0;
        int brojac = 0;
        
        System.out.println("Unesite željeni broj rundi:");
        int runde = rundeScan.nextInt();

        System.out.println("Unesite željeno ime:");
        String ime = imeScan.nextLine();
        
        while(brojac == 0){
            int racunaloO = 1 + nasumicno.nextInt(3);
            System.out.println("--------------------------------------------------------------");
            System.out.println("Zdravo " + ime + " Odaberite: \n 1) škare \n 2) papir \n 3) kamen");
            int igracO = odabirScan.nextInt();
            System.out.println("");
            
            if(igracO == racunaloO){
                System.out.println("Izjednaèeno! Nitko ne dobiva poene");
            }
            else if(igracO == 1){
                if(racunaloO == 3){
                	System.out.println("Izabrali ste: škare!");
                    System.out.println("Raèunalo je izabralo: kamen!");
                    System.out.println("");
                    System.out.println("Žao nam je, izgubili ste ovu rundu!");
                    System.out.println("");
                    racunalo++;
                    System.out.println("Raèunalo: " + racunalo);
                    System.out.println(ime + ": " + igrac);
                }else if(racunaloO == 2){
                	System.out.println("Izabrali ste: škare");
                    System.out.println("Raèunalo je izabralo: papir!");
                    System.out.println("");
                    System.out.println("Èestitamo " + ime + " pobijedili ste ovu rundu!");
                    System.out.println("");
                    igrac++;
                    System.out.println("Raèunalo: " + racunalo);
                    System.out.println(ime + ": " + igrac);
                }
            }
            else if(igracO == 2){
                if(racunaloO == 1){
                	System.out.println("Izabrali ste: papir!");
                    System.out.println("Raèunalo je izabralo: škare!");
                    System.out.println("");
                    System.out.println("Žao nam je, izgubili ste ovu rundu!");
                    System.out.println("");
                    racunalo++;
                    System.out.println("Raèunalo: " + racunalo);
                    System.out.println(ime + ": " + igrac);
                }else if(racunaloO == 3){
                	System.out.println("Izabrali ste: škare!");
                    System.out.println("Raèunalo je izabralo: kamen!");
                    System.out.println("");
                    System.out.println("Èestitamo " + ime + " pobijedili ste ovu rundu!");
                    System.out.println("");
                    igrac++;
                    System.out.println("Raèunalo: " + racunalo);
                    System.out.println(ime + ": " + igrac);
                }
            }
            else if(igracO == 3){
                if(racunaloO == 2){
                	System.out.println("Izabrali ste: kamen!");
                    System.out.println("Raèunalo je izabralo: papir!");
                    System.out.println("");
                    System.out.println("Žao nam je, izgubili ste ovu rundu!");
                    System.out.println("");
                    racunalo++;
                    System.out.println("Raèunalo: " + racunalo);
                    System.out.println(ime + ": " + igrac);
                }else if(racunaloO == 1){
                	System.out.println("Izabrali ste: kamen!");
                    System.out.println("Raèunalo je izabralo: škare!");
                    System.out.println("");
                    System.out.println("Èestitamo " + ime + " pobijedili ste ovu rundu!");
                    System.out.println("");
                    igrac++;
                    System.out.println("Raèunalo: " + racunalo);
                    System.out.println(ime + ": " + igrac);
                }
            }
            if(igrac == runde){
            	System.out.println("--------------------------------------------------------------");
                System.out.println("ÈESTITAMO. POBJEDILI STE IGRU");
                System.out.println("--------------------------------------------------------------");
                brojac++;
            }
            if(racunalo == runde){
            	System.out.println("--------------------------------------------------------------");
                System.out.println("Izgubili ste. Pokušajte ponovno!");
                System.out.println("--------------------------------------------------------------");
                brojac++;
            }
        }
    }
}
