/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1pbo;

/**
 *
 * @author USER
 */
public class Asset {
    private int IdAsset;
    private int Kuantitas;
    private int Harga;
    private String NamaAsset;
    private String Divisi;
    
    
    public Asset() {}
    
    public Asset(String NamaAsset, String Ket, int IdAsset, int Kuantitas1, int Harga1) {
           this.IdAsset = IdAsset;
           this.NamaAsset = NamaAsset;
           this.Harga = Harga;
           this.Kuantitas = Kuantitas;
           this.Divisi = Divisi;
    }

    public int getIdAsset() {
        return IdAsset;
    }

    public void setIdAsset(int IdAsset) {
        this.IdAsset = IdAsset;
    }

    public int getKuantitas() {
        return Kuantitas;
    }

    public void setKuantitas(int Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getNamaAsset() {
        return NamaAsset;
    }

    public void setNamaAsset(String NamaAsset) {
        this.NamaAsset = NamaAsset;
    }

    public String getDivisi() {
        return Divisi;
    }

    public void setDivisi(String Divisi) {
        this.Divisi = Divisi;
    }
    
    
    

}
