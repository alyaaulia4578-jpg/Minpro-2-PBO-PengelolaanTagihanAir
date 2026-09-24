/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */
public class Pembayaran {
    private String idPembayaran;
    private TagihanAir tagihan;
    private String tanggalBayar;
    private int jumlahBayar;

    public Pembayaran(String idPembayaran, TagihanAir tagihan, String tanggalBayar, int jumlahBayar) {
        this.idPembayaran = idPembayaran;
        this.tagihan = tagihan;
        if (tanggalBayar == null || tanggalBayar.trim().isEmpty()) {
            this.tanggalBayar = "-";
        } else {
            this.tanggalBayar = tanggalBayar;
        }
        if (jumlahBayar <= 0) {
            this.jumlahBayar = 0;
        } else {
            this.jumlahBayar = jumlahBayar;
        }

        if (tagihan != null) {
            tagihan.setStatus("Lunas");
        }
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public TagihanAir getTagihan() {
        return tagihan;
    }

    public void setTagihan(TagihanAir tagihan) {
        this.tagihan = tagihan;
    }


    public String getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(String tanggalBayar) {
        if (tanggalBayar != null && !tanggalBayar.trim().isEmpty()) {
            this.tanggalBayar = tanggalBayar;
        }
    }

    public int getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(int jumlahBayar) {
        if (jumlahBayar > 0) {
            this.jumlahBayar = jumlahBayar;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID Pembayaran : " + idPembayaran);
        System.out.println("Nama Warga    : " + tagihan.getWarga().getNama());
        System.out.println("Tanggal Bayar : " + tanggalBayar);
        System.out.println("Jumlah Bayar  : Rp" + jumlahBayar);
    }
}