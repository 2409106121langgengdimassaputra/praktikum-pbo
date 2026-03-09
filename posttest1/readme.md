Nama : Langgeng Dimas Saputra
NIM : 2409106121

Deskripsi Program

Program ini merupakan aplikasi sederhana yang dibuat menggunakan bahasa pemrograman JavaScript. Program ini digunakan untuk mengelola data penjualan UC pada permainan PUBG Mobile. UC atau Unknown Cash merupakan mata uang virtual yang digunakan di dalam game PUBG Mobile untuk membeli berbagai item seperti skin, outfit, maupun royal pass.

Program ini dibuat dengan menerapkan konsep pemrograman berbasis objek menggunakan class. Data paket UC disimpan di dalam sebuah Array yang berfungsi seperti ArrayList untuk menampung banyak objek data. Program ini juga memiliki fitur pengelolaan data yaitu menambah data, melihat data, memperbarui data, serta menghapus data.

Aplikasi dijalankan melalui terminal dan memiliki menu interaktif yang dapat digunakan oleh pengguna. Program akan terus berjalan dan menampilkan menu utama hingga pengguna memilih menu keluar dari program.

Tujuan Program

Tujuan dari pembuatan program ini adalah untuk memahami dan menerapkan beberapa konsep dasar dalam pemrograman JavaScript. Konsep yang digunakan antara lain penggunaan class untuk membuat struktur data, penggunaan array sebagai tempat penyimpanan data, serta penerapan operasi CRUD yang terdiri dari create, read, update, dan delete. Selain itu program ini juga dibuat untuk melatih pembuatan menu program yang dapat berjalan secara berulang hingga pengguna memilih untuk keluar dari program.

Struktur Data

Data yang dikelola dalam program ini adalah data paket UC PUBG Mobile. Setiap paket UC memiliki beberapa informasi yaitu id paket, nama paket, jumlah UC yang tersedia, serta harga paket tersebut. Informasi ini disimpan dalam bentuk objek yang dibuat dari class UC.

Class yang Digunakan

Program menggunakan sebuah class bernama UC yang berfungsi sebagai cetakan atau template untuk membuat objek paket UC. Class ini memiliki beberapa atribut yaitu id, namaPaket, jumlahUC, dan harga. Setiap kali pengguna menambahkan paket UC baru maka program akan membuat objek baru berdasarkan class tersebut lalu menyimpannya ke dalam array.

Contoh class yang digunakan dalam program adalah sebagai berikut

class UC {
constructor(id, namaPaket, jumlahUC, harga) {
this.id = id
this.namaPaket = namaPaket
this.jumlahUC = jumlahUC
this.harga = harga
}
}

Class tersebut digunakan untuk membentuk struktur data dari setiap paket UC yang dimasukkan oleh pengguna.

Penyimpanan Data

Seluruh data paket UC disimpan di dalam sebuah array JavaScript. Array ini berfungsi sebagai tempat penyimpanan objek yang telah dibuat dari class UC. Setiap kali pengguna menambahkan data baru maka objek tersebut akan dimasukkan ke dalam array sehingga dapat ditampilkan, diperbarui, atau dihapus ketika diperlukan.

Contoh deklarasi array yang digunakan dalam program adalah sebagai berikut

let dataUC = []

Array tersebut akan menampung seluruh data paket UC yang dimasukkan selama program berjalan.

Fitur Program

Program ini memiliki beberapa fitur utama yang digunakan untuk mengelola data paket UC PUBG Mobile.

Fitur pertama adalah menambah data. Pada fitur ini pengguna dapat memasukkan data paket UC baru seperti id paket, nama paket, jumlah UC, dan harga. Data yang dimasukkan akan disimpan ke dalam array.

Fitur kedua adalah melihat data. Fitur ini digunakan untuk menampilkan seluruh data paket UC yang telah tersimpan dalam sistem sehingga pengguna dapat melihat daftar paket UC yang tersedia.

Fitur ketiga adalah memperbarui data. Pada fitur ini pengguna dapat mengubah informasi paket UC yang sudah ada dengan cara memasukkan id paket yang ingin diubah kemudian memasukkan data yang baru.

Fitur keempat adalah menghapus data. Pengguna dapat menghapus paket UC yang sudah tidak diperlukan dengan memasukkan id paket yang ingin dihapus dari sistem.

Fitur terakhir adalah keluar dari program. Jika pengguna memilih menu ini maka program akan berhenti dijalankan.

Alur Program

Saat program dijalankan, sistem akan menampilkan menu utama kepada pengguna. Pengguna kemudian memilih salah satu menu yang tersedia seperti menambah data, melihat data, memperbarui data, atau menghapus data. Program akan menjalankan fungsi sesuai dengan pilihan pengguna. Setelah proses selesai dilakukan maka program akan kembali menampilkan menu utama. Proses ini akan terus berulang sampai pengguna memilih menu keluar sehingga program akan berhenti dijalankan.

Contoh Tampilan Menu

Berikut contoh tampilan menu yang muncul ketika program dijalankan pada terminal

Sistem Penjualan UC PUBG Mobile

1 Tambah Paket UC
2 Lihat Paket UC
3 Update Paket UC
4 Hapus Paket UC
5 Exit

Pilih Menu :

Menu tersebut akan terus muncul setiap kali proses selesai dilakukan sampai pengguna memilih menu keluar dari program.

Kesimpulan

Program Sistem Penjualan UC PUBG Mobile ini berhasil dibuat menggunakan bahasa pemrograman JavaScript dengan menerapkan konsep class, array sebagai penyimpanan data, serta operasi CRUD untuk mengelola data. Program juga dilengkapi dengan menu interaktif yang berjalan secara berulang hingga pengguna memilih untuk keluar dari aplikasi. Dengan adanya program ini pengelolaan data paket UC dapat dilakukan dengan lebih terstruktur dan mudah melalui terminal.