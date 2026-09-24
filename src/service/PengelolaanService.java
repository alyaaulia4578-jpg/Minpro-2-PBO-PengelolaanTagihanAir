/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author MSI MODERN
 */

import java.util.ArrayList;
import model.Warga;
import model.TagihanAir;
import model.Pembayaran;
import model.Petugas;

public class PengelolaanService {
    private ArrayList<Warga> daftarWarga;
    private ArrayList<TagihanAir> daftarTagihan;
    private ArrayList<Pembayaran> daftarPembayaran;
    private ArrayList<Petugas> daftarPetugas;

    public PengelolaanService() {
        daftarWarga = new ArrayList<>();
        daftarTagihan = new ArrayList<>();
        daftarPembayaran = new ArrayList<>();
        daftarPetugas = new ArrayList<>();

        Warga warga1 = new Warga(
                "W1",
                "Ahmad Fauzi",
                "Perumahan Blok A",
                "12"
        );
        daftarWarga.add(warga1);

        TagihanAir tagihan1 = new TagihanAir(
                "T1",
                warga1,
                15
        );
        daftarTagihan.add(tagihan1);

        Petugas petugas1 = new Petugas(
                "P1",
                "Budi Santoso",
                "Admin Perumahan"
        );
        daftarPetugas.add(petugas1);
    }

    public boolean tambahWarga(Warga warga) {
        for (Warga data : daftarWarga) {
            if (data.getIdUser().equals(warga.getIdUser())) {
                return false;
            }
        }
        daftarWarga.add(warga);
        return true;
    }

    public ArrayList<Warga> getDaftarWarga() {
        return daftarWarga;
    }

    public Warga cariWarga(String id) {
        for (Warga warga : daftarWarga) {
            if (warga.getIdUser().equals(id)) {
                return warga;
            }
        }
        return null;
    }

    public boolean tambahTagihan(TagihanAir tagihan) {
        for (TagihanAir data : daftarTagihan) {
            if (data.getIdTagihan().equals(tagihan.getIdTagihan())) {
                return false;
            }
        }
        daftarTagihan.add(tagihan);
        return true;
    }

    public ArrayList<TagihanAir> getDaftarTagihan() {
        return daftarTagihan;
    }

    public TagihanAir cariTagihan(String id) {
        for (TagihanAir tagihan : daftarTagihan) {
            if (tagihan.getIdTagihan().equals(id)) {
                return tagihan;
            }
        }
        return null;
    }

    public boolean tambahPembayaran(Pembayaran pembayaran) {
        for (Pembayaran data : daftarPembayaran) {
            if (data.getIdPembayaran().equals(pembayaran.getIdPembayaran())) {
                return false;
            }
        }

        daftarPembayaran.add(pembayaran);
        return true;
    }

    public ArrayList<Pembayaran> getDaftarPembayaran() {
        return daftarPembayaran;
    }

    public ArrayList<Petugas> getDaftarPetugas() {
        return daftarPetugas;
    }


    public boolean hapusWarga(String id) {
        for (int i = 0; i < daftarWarga.size(); i++) {
            if (daftarWarga.get(i).getIdUser().equals(id)) {
                daftarWarga.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean hapusTagihan(String id) {
        for (int i = 0; i < daftarTagihan.size(); i++) {
            if (daftarTagihan.get(i).getIdTagihan().equals(id)) {
                daftarTagihan.remove(i);
                return true;
            }
        }
        return false;
    }
}