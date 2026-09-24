# Sistem Pengelolaan Tagihan Air Perumahan Warga

## Deskripsi Program

Program Sistem Pengelolaan Tagihan Air Perumahan Warga merupakan
aplikasi berbasis Java yang digunakan untuk mengelola data warga,
tagihan penggunaan air, pembayaran tagihan, serta data petugas pada
suatu lingkungan perumahan.

Pada projek kali ini, program dikembangkan dengan menerapkan konsep
Pemrograman Berorientasi Objek (PBO) serta struktur pemrograman yang
lebih terorganisasi menggunakan konsep Model View Controller (MVC).

Konsep PBO yang diterapkan: - Encapsulation - Inheritance -
Polymorphism - Constructor - ArrayList - CRUD - Validasi input

Data program disimpan sementara menggunakan ArrayList selama aplikasi
berjalan.

------------------------------------------------------------------------

# Fitur Program

Program memiliki fitur:

1.  Menambahkan data warga.
2.  Menampilkan data warga.
3.  Mengubah data warga.
4.  Menghapus data warga.
5.  Menambahkan tagihan air.
6.  Menampilkan data tagihan air.
7.  Mengubah data tagihan air.
8.  Menghapus data tagihan air.
9.  Menambahkan pembayaran.
10. Menampilkan data pembayaran.
11. Menampilkan data petugas.

<img width="236" height="308" alt="Screenshot 2026-09-24 221052" src="https://github.com/user-attachments/assets/aed8d7ae-78a4-4e33-9a8b-2347e8f6f3ea" />

------------------------------------------------------------------------

# Struktur Project

    Minpro2PBO
    │   └── Main.java
    │
    ├── controller
    │   └── MenuController.java
    │
    ├── model
    │   ├── Pembayaran.java
    │   ├── Petugas.java
    │   ├── TagihanAir.java
    │   ├── User.java
    │   └── Warga.java
    │
    ├── service
    │   └── PengelolaanService.java
    │
    ├── view
        └── MenuView.java
   

<img width="208" height="218" alt="Screenshot 2026-09-24 213715" src="https://github.com/user-attachments/assets/86e5f74d-5e9c-4d7f-8495-6d889a39a738" />


------------------------------------------------------------------------

# Implementasi MVC

## 1. Model

Package model berisi class yang merepresentasikan objek dalam sistem.

Class yang digunakan:

### User.java

Class User merupakan superclass yang menyimpan atribut umum pengguna.

Atribut: - idUser - nama

### Warga.java

Class Warga merupakan turunan dari User yang digunakan untuk menyimpan
data warga.

Atribut tambahan: - alamat - nomorRumah

### Petugas.java

Class Petugas merupakan turunan dari User yang digunakan untuk menyimpan
data petugas.

Atribut tambahan: - jabatan

### TagihanAir.java

Digunakan untuk menyimpan data tagihan air.

Atribut: - idTagihan - warga - pemakaian - totalTagihan - status

### Pembayaran.java

Digunakan untuk menyimpan data transaksi pembayaran.

Atribut: - idPembayaran - tagihan - tanggalBayar - jumlahBayar


<img width="185" height="80" alt="Screenshot 2026-09-24 222156" src="https://github.com/user-attachments/assets/21ae6caf-9516-4737-87cb-fc9d55eb819d" />


------------------------------------------------------------------------

## 2. View

Package view digunakan untuk mengatur tampilan program.

File:

MenuView.java

Fungsi: - Menampilkan judul program. - Menampilkan daftar menu. -
Mengatur tampilan pilihan pengguna.


<img width="524" height="419" alt="Screenshot 2026-09-24 222351" src="https://github.com/user-attachments/assets/3c588b13-72da-4b2a-bd79-f0482aaf8322" />


------------------------------------------------------------------------

## 3. Controller

Package controller mengatur alur program.

File:

MenuController.java

Fungsi: - Menerima input pengguna. - Menjalankan menu berdasarkan
pilihan. - Melakukan validasi input. - Menghubungkan View dengan
Service. - Menjalankan proses CRUD.


------------------------------------------------------------------------

## 4. Service

Package service bertugas mengelola data.

File:

PengelolaanService.java

Fungsi: - Menyimpan data warga. - Menyimpan data tagihan. - Menyimpan
data pembayaran. - Menyimpan data petugas. - Menjalankan proses tambah,
cari, dan hapus data.


------------------------------------------------------------------------

# Penerapan Encapsulation

Encapsulation diterapkan dengan membuat atribut setiap class menggunakan
access modifier private.

Contoh:

    private String nama;
    private String alamat;
    private int pemakaian;

Akses terhadap data dilakukan melalui method getter dan setter.

Penerapan ini bertujuan: - Melindungi data agar tidak dapat diubah
secara langsung. - Mengontrol perubahan nilai atribut. - Membuat
struktur class lebih aman.

<img width="519" height="240" alt="Screenshot 2026-09-24 222719" src="https://github.com/user-attachments/assets/953b3c54-a63f-4245-a6f7-285897de2615" />


<img width="519" height="259" alt="Screenshot 2026-09-24 222901" src="https://github.com/user-attachments/assets/9780b7a1-5e54-4a16-8317-7ca3c4d69be8" />


------------------------------------------------------------------------

# Penerapan Inheritance

Inheritance diterapkan dengan membuat class User sebagai superclass.

Struktur hubungan class:

              User
                |
         ----------------
         |              |
       Warga        Petugas

Implementasi:

    public class Warga extends User

    public class Petugas extends User

Dengan inheritance, class Warga dan Petugas dapat menggunakan atribut
serta method yang berasal dari User.

<img width="269" height="54" alt="Screenshot 2026-09-24 223148" src="https://github.com/user-attachments/assets/e8cb1a91-db16-42d4-b6dd-2acf9e348fe6" />


<img width="275" height="44" alt="Screenshot 2026-09-24 223201" src="https://github.com/user-attachments/assets/2716d893-df1d-443d-b2de-1eccd6323afe" />


------------------------------------------------------------------------

# Penerapan Polymorphism

Polymorphism diterapkan menggunakan method overriding.

Method:

    tampilkanInfo()

Method tersebut dibuat pada class induk kemudian dioverride pada class
turunan.

<img width="275" height="44" alt="Screenshot 2026-09-24 223201" src="https://github.com/user-attachments/assets/1a1de254-3122-47d0-8b69-0a248b510878" />


Implementasi: - Warga memiliki tampilan informasi warga. - Petugas
memiliki tampilan informasi petugas.


<img width="440" height="118" alt="Screenshot 2026-09-24 223516" src="https://github.com/user-attachments/assets/3930181d-9fc2-4edb-be85-0ba69c856b7d" />



<img width="422" height="98" alt="Screenshot 2026-09-24 223554" src="https://github.com/user-attachments/assets/9444b60e-2633-405e-a7c1-d2871deb47d6" />


------------------------------------------------------------------------

# Implementasi CRUD

## Create

Create digunakan untuk menambahkan data baru.

Implementasi: - Tambah warga. 

<img width="269" height="392" alt="Screenshot 2026-09-24 223904" src="https://github.com/user-attachments/assets/2f5b0c91-f5f1-4841-8df7-0ae847725c15" />


------------------------------------------------------------------------

## Read

Read digunakan untuk menampilkan data.

Implementasi: - Lihat tagihan air.

<img width="271" height="401" alt="Screenshot 2026-09-24 224011" src="https://github.com/user-attachments/assets/d8df2004-4331-4e45-9bca-9b2e9a62c4bc" />


------------------------------------------------------------------------

## Update

Update digunakan untuk mengubah data yang sudah tersimpan.

Implementasi: - Mengubah data warga. 

<img width="251" height="367" alt="Screenshot 2026-09-24 224130" src="https://github.com/user-attachments/assets/d5b58956-89eb-4247-bdc4-186a51056e6a" />


------------------------------------------------------------------------

## Delete

Delete digunakan untuk menghapus data.

Implementasi: - Menghapus data warga.

<img width="251" height="329" alt="Screenshot 2026-09-24 224303" src="https://github.com/user-attachments/assets/700f8b02-45ae-4b15-9dcd-a5bd32395c96" />


------------------------------------------------------------------------

# Validasi Input

Program menerapkan validasi agar data yang masuk sesuai.

Validasi yang diterapkan:

## Input Tidak Boleh Kosong

Digunakan pada: - ID warga. - Nama warga. - Alamat. - ID tagihan. - Data
pembayaran.

## Validasi Angka

Digunakan pada: - Pemakaian air. - Jumlah pembayaran.

## Validasi Nilai Negatif

Program menolak: - Pemakaian air kurang dari 0. - Jumlah pembayaran
kurang dari 0.

## Validasi Data Duplikat

Program melakukan pengecekan:  ID warga tidak boleh sama.

<img width="250" height="338" alt="Screenshot 2026-09-24 224431" src="https://github.com/user-attachments/assets/13d4920e-aae0-4b99-b96c-44bb022e61a2" />


------------------------------------------------------------------------

# Perhitungan Tagihan Air

Program menggunakan tarif:

    Rp3.000 / m3

Rumus:

    Total Tagihan = Pemakaian Air × Tarif Air

Contoh:

    Pemakaian = 15 m3

    Total Tagihan =
    15 × 3000

    = Rp45.000

<img width="231" height="95" alt="Screenshot 2026-09-24 224722" src="https://github.com/user-attachments/assets/95890073-67ac-4e3d-aff1-0abeb4ccb6a3" />


------------------------------------------------------------------------

# Proses Pembayaran

Pembayaran dilakukan berdasarkan ID tagihan.

Data yang dimasukkan: - ID pembayaran. - ID tagihan. - Tanggal
pembayaran. - Jumlah pembayaran.

Setelah pembayaran berhasil: - Data pembayaran disimpan. - Status
tagihan berubah menjadi Lunas.

<img width="305" height="369" alt="Screenshot 2026-09-24 224848" src="https://github.com/user-attachments/assets/f7ec78f7-b252-4868-b51c-509b5f4bd7db" />


------------------------------------------------------------------------

# Hasil Pengujian Program

Pengujian dilakukan pada setiap fitur:

## Tambah Data

<img width="245" height="200" alt="Screenshot 2026-09-24 225149" src="https://github.com/user-attachments/assets/6ac19923-7ea0-4e66-b314-d884637fed74" />

Data yang telah ditambahkan bisa terlihat pada output

## Ubah Data

<img width="226" height="179" alt="Screenshot 2026-09-24 225507" src="https://github.com/user-attachments/assets/22d14229-1f15-4825-8c50-1fd5f4194888" />

Pengubahan data warga berhasil terlihat dari output

## Hapus Data

<img width="232" height="149" alt="Screenshot 2026-09-24 225638" src="https://github.com/user-attachments/assets/89ab13eb-7c6d-4275-a43d-8b7dfe650c6c" />


Data warga berhasil dihapus, terlihat hanya 1 data warga yang ada pada output


## Validasi Input

<img width="275" height="320" alt="Screenshot 2026-09-24 225731" src="https://github.com/user-attachments/assets/95713f16-05c0-437a-9a1d-e189ddcc0567" />

Output memperlihatkan validasi data bahwa id warga tidak boleh kosong

------------------------------------------------------------------------


# Kesimpulan

Program Sistem Pengelolaan Tagihan Air Perumahan Warga telah
dikembangkan dengan menerapkan konsep Pemrograman Berorientasi Objek
menggunakan Java.

Program telah menerapkan: -
Minimal class utama di luar entry point. - Constructor. - ArrayList. -
CRUD. - Encapsulation. - Inheritance. - Polymorphism. - Validasi
input. - Struktur MVC.

Dengan struktur tersebut, program menjadi lebih terorganisasi dan mudah
dikembangkan.
