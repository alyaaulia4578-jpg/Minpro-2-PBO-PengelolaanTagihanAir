/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */
public class User {
    private String idUser;
    private String nama;

    public User(String idUser, String nama) {
        if (idUser == null || idUser.trim().isEmpty()) {
            this.idUser = "TIDAK ADA";
        } else {
            this.idUser = idUser;
        }

        if (nama == null || nama.trim().isEmpty()) {
            this.nama = "Tidak diketahui";
        } else {
            this.nama = nama;
        }
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        if (idUser != null && !idUser.trim().isEmpty()) {
            this.idUser = idUser;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID User : " + idUser);
        System.out.println("Nama    : " + nama);
    }
}