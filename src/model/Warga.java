/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */
public class Warga extends User {
    private String alamat;
    private String nomorRumah;

    public Warga(String idUser, String nama, String alamat, String nomorRumah) {
        super(idUser, nama);
        if (alamat == null || alamat.trim().isEmpty()) {
            this.alamat = "Tidak diketahui";
        } else {
            this.alamat = alamat;
        }

        if (nomorRumah == null || nomorRumah.trim().isEmpty()) {
            this.nomorRumah = "Tidak diketahui";
        } else {
            this.nomorRumah = nomorRumah;
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        if (alamat != null && !alamat.trim().isEmpty()) {
            this.alamat = alamat;
        }
    }

    public String getNomorRumah() {
        return nomorRumah;
    }

    public void setNomorRumah(String nomorRumah) {
        if (nomorRumah != null && !nomorRumah.trim().isEmpty()) {
            this.nomorRumah = nomorRumah;
        }
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Warga     : " + getIdUser());
        System.out.println("Nama         : " + getNama());
        System.out.println("Alamat       : " + alamat);
        System.out.println("Nomor Rumah  : " + nomorRumah);
    }
}