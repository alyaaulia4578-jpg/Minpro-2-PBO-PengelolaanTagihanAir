# Sistem Pengelolaan Tagihan Air Perumahan Warga

## Deskripsi Program

Program Sistem Pengelolaan Tagihan Air Perumahan Warga merupakan
aplikasi berbasis Java yang digunakan untuk mengelola data warga,
tagihan penggunaan air, pembayaran tagihan, serta data petugas pada
suatu lingkungan perumahan.

Pada Mini Project 2, program dikembangkan dengan menerapkan konsep
Pemrograman Berorientasi Objek (PBO) serta struktur pemrograman yang
lebih terorganisasi menggunakan konsep Model View Controller (MVC).

Konsep PBO yang diterapkan: - Encapsulation - Inheritance -
Polymorphism - Constructor - ArrayList - CRUD - Validasi input

Data program disimpan sementara menggunakan ArrayList selama aplikasi
berjalan.

\[TEMPAT SCREENSHOT\] Masukkan screenshot tampilan awal program.

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

\[TEMPAT SCREENSHOT\] Masukkan screenshot menu utama program.

------------------------------------------------------------------------

# Struktur Project

    Minpro2PBO

    ├── controller
    │   └── MenuController.java
    │
    ├── model
    │   ├── User.java
    │   ├── Warga.java
    │   ├── Petugas.java
    │   ├── TagihanAir.java
    │   └── Pembayaran.java
    │
    ├── service
    │   └── PengelolaanService.java
    │
    ├── view
    │   └── MenuView.java
    │
    └── Main.java

\[TEMPAT SCREENSHOT\] Masukkan screenshot struktur package pada
NetBeans.

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

\[TEMPAT SCREENSHOT\] Masukkan screenshot package model.

------------------------------------------------------------------------

## 2. View

Package view digunakan untuk mengatur tampilan program.

File:

MenuView.java

Fungsi: - Menampilkan judul program. - Menampilkan daftar menu. -
Mengatur tampilan pilihan pengguna.

\[TEMPAT SCREENSHOT\] Masukkan screenshot MenuView.java.

------------------------------------------------------------------------

## 3. Controller

Package controller mengatur alur program.

File:

MenuController.java

Fungsi: - Menerima input pengguna. - Menjalankan menu berdasarkan
pilihan. - Melakukan validasi input. - Menghubungkan View dengan
Service. - Menjalankan proses CRUD.

\[TEMPAT SCREENSHOT\] Masukkan screenshot MenuController.java.

------------------------------------------------------------------------

## 4. Service

Package service bertugas mengelola data.

File:

PengelolaanService.java

Fungsi: - Menyimpan data warga. - Menyimpan data tagihan. - Menyimpan
data pembayaran. - Menyimpan data petugas. - Menjalankan proses tambah,
cari, dan hapus data.

\[TEMPAT SCREENSHOT\] Masukkan screenshot PengelolaanService.java.

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

\[TEMPAT SCREENSHOT\] Masukkan screenshot: - Atribut private. -
Getter. - Setter.

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

\[TEMPAT SCREENSHOT\] Masukkan screenshot User.java, Warga.java, dan
Petugas.java.

------------------------------------------------------------------------

# Penerapan Polymorphism

Polymorphism diterapkan menggunakan method overriding.

Method:

    tampilkanInfo()

Method tersebut dibuat pada class induk kemudian dioverride pada class
turunan.

Implementasi: - Warga memiliki tampilan informasi warga. - Petugas
memiliki tampilan informasi petugas.

\[TEMPAT SCREENSHOT\] Masukkan screenshot method overriding.

------------------------------------------------------------------------

# Implementasi CRUD

## Create

Create digunakan untuk menambahkan data baru.

Implementasi: - Tambah warga. - Tambah tagihan air. - Tambah pembayaran.

\[TEMPAT SCREENSHOT\] Masukkan screenshot proses tambah data.

------------------------------------------------------------------------

## Read

Read digunakan untuk menampilkan data.

Implementasi: - Lihat data warga. - Lihat tagihan air. - Lihat
pembayaran. - Lihat petugas.

\[TEMPAT SCREENSHOT\] Masukkan screenshot proses tampil data.

------------------------------------------------------------------------

## Update

Update digunakan untuk mengubah data yang sudah tersimpan.

Implementasi: - Mengubah data warga. - Mengubah pemakaian tagihan air.

\[TEMPAT SCREENSHOT\] Masukkan screenshot proses ubah data.

------------------------------------------------------------------------

## Delete

Delete digunakan untuk menghapus data.

Implementasi: - Menghapus warga. - Menghapus tagihan air.

\[TEMPAT SCREENSHOT\] Masukkan screenshot proses hapus data.

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

Program melakukan pengecekan: - ID warga tidak boleh sama. - ID tagihan
tidak boleh sama. - ID pembayaran tidak boleh sama.

\[TEMPAT SCREENSHOT\] Masukkan screenshot hasil validasi input.

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

\[TEMPAT SCREENSHOT\] Masukkan screenshot hasil perhitungan tagihan.

------------------------------------------------------------------------

# Proses Pembayaran

Pembayaran dilakukan berdasarkan ID tagihan.

Data yang dimasukkan: - ID pembayaran. - ID tagihan. - Tanggal
pembayaran. - Jumlah pembayaran.

Setelah pembayaran berhasil: - Data pembayaran disimpan. - Status
tagihan berubah menjadi Lunas.

\[TEMPAT SCREENSHOT\] Masukkan screenshot proses pembayaran.

------------------------------------------------------------------------

# Pengujian Program

Pengujian dilakukan pada setiap fitur:

## Tambah Data

\[TEMPAT SCREENSHOT\]

## Tampil Data

\[TEMPAT SCREENSHOT\]

## Ubah Data

\[TEMPAT SCREENSHOT\]

## Hapus Data

\[TEMPAT SCREENSHOT\]

## Validasi Input

\[TEMPAT SCREENSHOT\]

------------------------------------------------------------------------

# Teknologi yang Digunakan

-   Java
-   Apache NetBeans
-   Git
-   GitHub

------------------------------------------------------------------------

# Kesimpulan

Program Sistem Pengelolaan Tagihan Air Perumahan Warga telah
dikembangkan dengan menerapkan konsep Pemrograman Berorientasi Objek
menggunakan Java.

Program telah memenuhi ketentuan Mini Project 2 dengan menerapkan: -
Minimal class utama di luar entry point. - Constructor. - ArrayList. -
CRUD. - Encapsulation. - Inheritance. - Polymorphism. - Validasi
input. - Struktur MVC.

Dengan struktur tersebut, program menjadi lebih terorganisasi dan mudah
dikembangkan.
