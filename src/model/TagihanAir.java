/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */

public class TagihanAir {
    private String idTagihan;
    private Warga warga;
    private int pemakaian;
    private int totalTagihan;
    private String status;
    private final int TARIF_AIR = 3000;

    public TagihanAir(String idTagihan, Warga warga, int pemakaian) {
        if (idTagihan == null || idTagihan.trim().isEmpty()) {
            this.idTagihan = "TIDAK ADA";
        } else {
            this.idTagihan = idTagihan;
        }
        this.warga = warga;
        if (pemakaian < 0) {
            this.pemakaian = 0;
        } else {
            this.pemakaian = pemakaian;
        }
        this.totalTagihan = this.pemakaian * TARIF_AIR;
        this.status = "Belum Lunas";
    }

    public void hitungTagihan() {
        totalTagihan = pemakaian * TARIF_AIR;
    }
    
    public String getIdTagihan() {
        return idTagihan;
    }

    public void setIdTagihan(String idTagihan) {
        if (idTagihan != null && !idTagihan.trim().isEmpty()) {
            this.idTagihan = idTagihan;
        }
    }

    public Warga getWarga() {
        return warga;
    }

    public void setWarga(Warga warga) {
        this.warga = warga;
    }

    public int getPemakaian() {
        return pemakaian;
    }

    public void setPemakaian(int pemakaian) {
        if (pemakaian >= 0) {
            this.pemakaian = pemakaian;
            hitungTagihan();
        }
    }

    public int getTotalTagihan() {
        return totalTagihan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID Tagihan   : " + idTagihan);
        System.out.println("Nama Warga   : " + warga.getNama());
        System.out.println("Pemakaian    : " + pemakaian + " m3");
        System.out.println("Total Bayar  : Rp" + totalTagihan);
        System.out.println("Status       : " + status);
    }
}