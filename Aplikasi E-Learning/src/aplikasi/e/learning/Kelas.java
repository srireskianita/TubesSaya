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
public class Kelas {
    private Mahasiswa[] list=new Mahasiswa[5];
    private int jmlMahasiswa = 0;
    private String namaKelas;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    public void addMahasiswa(Mahasiswa m){
        list[jmlMahasiswa++]=m;
    }
}
