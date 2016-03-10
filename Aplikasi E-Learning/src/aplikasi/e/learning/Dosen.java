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
public class Dosen {
    private String nama;
    private Kelas[] kelas = new Kelas[10];
private int i=0;
    
    public Dosen(String nama) {
        this.nama = nama;
    }
    
    public Kelas getKelas(int index){
        return kelas[index];
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void createKelas(String namaKelas){
        Kelas K = new Kelas(namaKelas);
        this.kelas[i++] = K;
    }
}
