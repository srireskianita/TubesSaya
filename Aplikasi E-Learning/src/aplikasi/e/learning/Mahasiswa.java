/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.e.learning;

/**
 *
 * @author Widodo
 */
public class Mahasiswa {
    private String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public void display(){
        System.out.println("nama :"+nama);
    }
    
}