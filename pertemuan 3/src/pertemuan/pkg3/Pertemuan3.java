/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     int naw = 0; 
     naw = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Awal"));
      int awal = naw;
      int akhir = 10;  
     naw = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Akhir"));
    
   
    System.out.println("perulangan while");
    while(awal<akhir){
         System.out.println("perulangan ke-"+awal); 
         awal++;
    }
      
    System.out.println("perulanganDo..While");
    awal = naw;
    do{
        System.out.println("perulangan ke-"+awal); 
        awal++;        
    }while(awal<akhir);
    
      System.out.println("Pelanggan dengan For");
      for(awal=naw; awal<akhir; awal++){
        System.out.println("Perulangan ke-"+awal);   
      }
    }
    
}
