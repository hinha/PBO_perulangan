
package pbo_perulangan;

import java.util.Scanner;

/**
 *
 * @author hinha
 */
public class Pbo_Perulangan {

    public static void main(String[] args) {
        int pil;
        Scanner in = new Scanner(System.in);
        
        for (pil = 1; pil <= 3; pil++) {
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pil = in.nextInt();
            
        }
    }
    
}
