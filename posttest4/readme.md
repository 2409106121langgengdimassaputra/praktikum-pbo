
Penjelasan Program Sistem Penjualan Produk Digital

Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk mengelola data produk digital seperti paket UC dan voucher game. Program dibuat menggunakan konsep Object-Oriented Programming (OOP) dengan penerapan inheritance dan polymorphism.

Struktur Program

Program terdiri dari beberapa class utama yaitu Produk sebagai parent class, serta UC dan Voucher sebagai child class.

Class Produk
Class ini merupakan class induk yang menyimpan atribut umum seperti id, nama, dan harga. Class ini juga memiliki method untuk menampilkan data produk serta method overloading.

Class UC
Class ini merupakan turunan dari Produk yang memiliki atribut tambahan yaitu jumlah UC. Class ini melakukan override terhadap method tampil() untuk menampilkan informasi yang lebih spesifik.

Class Voucher
Class ini juga merupakan turunan dari Produk dengan atribut tambahan berupa nama game. Class ini juga melakukan override pada method tampil().

Konsep OOP yang Digunakan

Inheritance
Class UC dan Voucher mewarisi atribut dan method dari class Produk, sehingga tidak perlu menulis ulang kode yang sama.

Polymorphism

1. Method Overriding
   Method tampil() pada class UC dan Voucher menggantikan method tampil() milik class Produk. Hal ini memungkinkan objek yang berbeda menampilkan informasi sesuai jenisnya masing-masing.

2. Method Overloading
   Pada class Produk terdapat dua method dengan nama yang sama yaitu tampil(), tetapi memiliki parameter yang berbeda.
   tampil() tanpa parameter digunakan untuk menampilkan data biasa, sedangkan tampil(String prefix) digunakan untuk menambahkan teks di depan output.

Fitur Program

Program memiliki beberapa fitur utama yaitu:

* Menambahkan data produk (UC atau Voucher)
* Menampilkan data produk
* Menghapus data produk berdasarkan ID
* Menu interaktif berbasis input user

Alur Program

Saat program dijalankan, user akan melihat menu utama yang berisi beberapa pilihan. User dapat memilih untuk menambah data, melihat data, menghapus data, atau keluar dari program. Data disimpan dalam ArrayList sehingga dapat bertambah secara dinamis.

Kesimpulan

Program ini berhasil menerapkan konsep dasar OOP khususnya inheritance dan polymorphism. Dengan adanya overriding dan overloading, program menjadi lebih fleksibel dan mudah dikembangkan. Struktur class yang digunakan juga membantu dalam pengorganisasian kode agar lebih rapi dan terstruktur.

