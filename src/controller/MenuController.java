/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
/**
 *
 * @author MSI MODERN
 */

import java.util.Scanner;
import model.Warga;
import model.TagihanAir;
import model.Pembayaran;
import model.Petugas;
import service.PengelolaanService;
import view.MenuView;

public class MenuController {
    private PengelolaanService service;
    private MenuView view;
    private Scanner input;

    public MenuController() {
        service = new PengelolaanService();
        view = new MenuView();
        input = new Scanner(System.in);
    }

    public void jalankanProgram() {
        int pilihan;
        do {
            view.tampilkanJudul();
            view.tampilkanMenu();
            pilihan = inputInteger("Pilih menu : ");
            
            switch (pilihan) {

                case 1:
                    tambahWarga();
                    break;

                case 2:
                    tampilWarga();
                    break;

                case 3:
                    ubahWarga();
                    break;

                case 4:
                    hapusWarga();
                    break;

                case 5:
                    tambahTagihan();
                    break;

                case 6:
                    tampilTagihan();
                    break;

                case 7:
                    ubahTagihan();
                    break;

                case 8:
                    hapusTagihan();
                    break;

                case 9:
                    tambahPembayaran();
                    break;

                case 10:
                    tampilPembayaran();
                    break;

                case 11:
                    tampilPetugas();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
                    tekanEnter();
            }
        } while (pilihan != 0);
    }

    private void tambahWarga() {
        String id = inputTidakKosong("ID Warga : ");

        if (service.cariWarga(id) != null) {
            System.out.println("ID warga sudah digunakan");
            tekanEnter();
            return;
        }

        String nama = inputTidakKosong("Nama Warga : ");
        String alamat = inputTidakKosong("Alamat : ");
        String nomorRumah = inputTidakKosong("Nomor Rumah : ");

        Warga warga = new Warga(
                id,
                nama,
                alamat,
                nomorRumah
        );

        if (service.tambahWarga(warga)) {
            System.out.println("Data warga berhasil ditambahkan");
        } else {
            System.out.println("Data warga gagal ditambahkan");
        }
        tekanEnter();
    }

    private void tampilWarga() {
        System.out.println();
        System.out.println("===== DATA WARGA =====");
        for (Warga warga : service.getDaftarWarga()) {
            warga.tampilkanInfo();
            System.out.println();
        }
        tekanEnter();
    }

    private void ubahWarga() {
        String id = inputTidakKosong("Masukkan ID Warga : ");
        Warga warga = service.cariWarga(id);
        if (warga == null) {
            System.out.println("Data warga tidak ditemukan");
            tekanEnter();
            return;
        }
        String nama = inputTidakKosong("Nama Baru : ");
        String alamat = inputTidakKosong("Alamat Baru : ");
        String nomorRumah = inputTidakKosong("Nomor Rumah Baru : ");
        warga.setNama(nama);
        warga.setAlamat(alamat);
        warga.setNomorRumah(nomorRumah);
        System.out.println("Data warga berhasil diubah");
        tekanEnter();
    }

    private void hapusWarga() {
        String id = inputTidakKosong("Masukkan ID Warga : ");
        if (service.hapusWarga(id)) {
            System.out.println("Data warga berhasil dihapus");
        } else {
            System.out.println("Data warga tidak ditemukan");
        }
        tekanEnter();
    }
    private void tambahTagihan() {
        String idTagihan = inputTidakKosong("ID Tagihan : ");
        if (service.cariTagihan(idTagihan) != null) {
            System.out.println("ID tagihan sudah digunakan");
            tekanEnter();
            return;
        }
        String idWarga = inputTidakKosong("ID Warga : ");
        Warga warga = service.cariWarga(idWarga);

        if (warga == null) {
            System.out.println("Data warga tidak ditemukan");
            tekanEnter();
            return;
        }
        int pemakaian = inputTidakNegatif("Pemakaian air (m3) : ");
        TagihanAir tagihan = new TagihanAir(
                idTagihan,
                warga,
                pemakaian
        );
        if (service.tambahTagihan(tagihan)) {
            System.out.println("Tagihan berhasil dibuat");
        } else {
            System.out.println("Tagihan gagal dibuat");
        }
        tekanEnter();
    }

    private void tampilTagihan() {
        System.out.println();
        System.out.println("===== DATA TAGIHAN AIR =====");
        for (TagihanAir tagihan : service.getDaftarTagihan()) {
            tagihan.tampilkanInfo();
            System.out.println();
        }
        tekanEnter();
    }


    private void ubahTagihan() {
        String id = inputTidakKosong("Masukkan ID Tagihan : ");
        TagihanAir tagihan = service.cariTagihan(id);
        if (tagihan == null) {
            System.out.println("Data tagihan tidak ditemukan");
            tekanEnter();
            return;
        }
        int pemakaian = inputTidakNegatif("Pemakaian Baru : ");
        tagihan.setPemakaian(pemakaian);
        System.out.println("Data tagihan berhasil diubah");
        tekanEnter();
    }

    private void hapusTagihan() {
        String id = inputTidakKosong("Masukkan ID Tagihan : ");
        if (service.hapusTagihan(id)) {
            System.out.println("Tagihan berhasil dihapus");
        } else {
            System.out.println("Data tagihan tidak ditemukan");
        }
        tekanEnter();
    }

    private void tambahPembayaran() {
        String idPembayaran = inputTidakKosong("ID Pembayaran : ");
        for (Pembayaran data : service.getDaftarPembayaran()) {
            if (data.getIdPembayaran().equals(idPembayaran)) {
                System.out.println("ID pembayaran sudah digunakan");
                tekanEnter();
                return;
            }
        }
        String idTagihan = inputTidakKosong("ID Tagihan : ");
        TagihanAir tagihan = service.cariTagihan(idTagihan);

        if (tagihan == null) {
            System.out.println("Data tagihan tidak ditemukan");
            tekanEnter();
            return;
        }

        String tanggal = inputTidakKosong("Tanggal Bayar : ");
        int jumlahBayar = inputPositif("Jumlah Bayar : ");
        if (jumlahBayar < tagihan.getTotalTagihan()) {
            System.out.println("Jumlah pembayaran kurang dari total tagihan");
            tekanEnter();
            return;
        }
        Pembayaran pembayaran = new Pembayaran(
                idPembayaran,
                tagihan,
                tanggal,
                jumlahBayar
        );
        if (service.tambahPembayaran(pembayaran)) {
            System.out.println("Pembayaran berhasil");
        } else {
            System.out.println("Pembayaran gagal");
        }
        tekanEnter();
    }

    private void tampilPembayaran() {
        System.out.println();
        System.out.println("===== DATA PEMBAYARAN =====");
        for (Pembayaran pembayaran : service.getDaftarPembayaran()) {
            pembayaran.tampilkanInfo();
            System.out.println();
        }
        tekanEnter();
    }
    private void tampilPetugas() {
        System.out.println();
        System.out.println("===== DATA PETUGAS =====");
        for (Petugas petugas : service.getDaftarPetugas()) {
            petugas.tampilkanInfo();
            System.out.println();
        }
        tekanEnter();
    }

    private String inputTidakKosong(String pesan) {
        String data;
        do {
            System.out.print(pesan);
            data = input.nextLine().trim();
            if (data.isEmpty()) {
                System.out.println("Input tidak boleh kosong");
            }
        } while (data.isEmpty());
        return data;
    }

    private int inputInteger(String pesan) {
        int angka;
        while (true) {
            try {
                System.out.print(pesan);
                angka = Integer.parseInt(input.nextLine());
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka");
            }
        }
    }

    private int inputTidakNegatif(String pesan) {
        int angka;
        do {
            angka = inputInteger(pesan);
            if (angka < 0) {
                System.out.println("Nilai tidak boleh negatif");
            }
        } while (angka < 0);
        return angka;
    }

    private int inputPositif(String pesan) {
        int angka;
        do {
            angka = inputInteger(pesan);
            if (angka <= 0) {
                System.out.println("Nilai harus lebih dari 0");
            }
        } while (angka <= 0);
        return angka;
    }

    private void tekanEnter() {
        System.out.println();
        System.out.println("Tekan ENTER untuk kembali ke menu...");
        input.nextLine();
    }
}