/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kt2_ccptpm;

import java.util.Scanner;

/**
 *
 * @author IT Supporter
 */
public class KT2_CCPTPM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner;
        scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào chuỗi bất kỳ: ");
	chuoi = scanner.nextLine();
        
        System.out.println("Chuỗi đã nhập là: " + chuoi);
    }
    
}
