Program ini merupakan pengembangan dari project sebelumnya dengan menambahkan konsep inheritance dalam pemrograman berorientasi objek. Inheritance digunakan agar kode lebih terstruktur, tidak berulang, dan mudah dikembangkan.

Pada program ini dibuat satu class induk yaitu Produk. Class Produk memiliki atribut umum yang dimiliki semua jenis produk yaitu id, nama, dan harga. Selain itu class ini juga memiliki method getter, setter, dan method tampil untuk menampilkan data.

Kemudian dibuat dua class turunan yaitu UC dan Voucher. Kedua class ini mewarisi semua atribut dan method dari class Produk. Class UC digunakan untuk merepresentasikan paket UC PUBG Mobile dengan tambahan atribut jumlahUC. Sedangkan class Voucher digunakan untuk produk voucher game dengan tambahan atribut game.

Setiap class turunan melakukan override pada method tampil agar dapat menampilkan data sesuai dengan jenis produknya masing masing. Hal ini juga menunjukkan penerapan polymorphism karena method yang sama dapat memiliki perilaku yang berbeda tergantung objeknya.

Pada bagian penyimpanan data digunakan ArrayList bertipe Produk. Dengan cara ini satu list dapat menampung berbagai jenis objek baik UC maupun Voucher karena keduanya merupakan turunan dari Produk.

Tipe inheritance yang digunakan adalah single inheritance dimana satu class induk dapat memiliki beberapa class turunan. Penerapan ini logis karena semua data yang dikelola merupakan jenis produk yang memiliki kesamaan atribut dasar.

Dengan adanya inheritance program menjadi lebih rapi, mudah dipahami, dan mudah dikembangkan jika ingin menambahkan jenis produk baru di masa depan tanpa perlu mengubah struktur utama program.
