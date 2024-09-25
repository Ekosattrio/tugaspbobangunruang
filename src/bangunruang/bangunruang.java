/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang; 
public class bangunruang { 
    
    
    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
    public double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

    


