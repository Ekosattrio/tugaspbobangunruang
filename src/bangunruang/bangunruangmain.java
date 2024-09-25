/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;

/**
 *
 * @author Advan
 */
public class bangunruangmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bangunruang br = new bangunruang();
        
        // Menghitung dan menampilkan hasil untuk Kubus
        double sisiKubus = 4;
        System.out.println("Volume Kubus: " + br.hitungVolume(sisiKubus));
        System.out.println("Luas Permukaan Kubus: " + br.hitungLuasPermukaan(sisiKubus));
        
        // Menghitung dan menampilkan hasil untuk Balok
        double panjangBalok = 5, lebarBalok = 3, tinggiBalok = 2;
        System.out.println("Volume Balok: " + br.hitungVolume(panjangBalok, lebarBalok, tinggiBalok));
        System.out.println("Luas Permukaan Balok: " + br.hitungLuasPermukaan(panjangBalok, lebarBalok, tinggiBalok));
    }
    
}
