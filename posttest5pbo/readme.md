Program ini merupakan pengembangan dari posttest sebelumnya dengan menambahkan konsep abstract class dan interface.

Abstract Class
Class Produk diubah menjadi abstract class sehingga tidak dapat dibuat objek secara langsung. Di dalamnya terdapat abstract method yaitu tampil() yang wajib diimplementasikan oleh subclass.

Abstract Method
Method tampil() tidak memiliki isi di class Produk, tetapi diimplementasikan pada class UC dan Voucher sesuai kebutuhan masing-masing.

Interface
Interface Aksi dibuat dengan dua method yaitu beli() dan tampilInfo(). Interface ini digunakan untuk mendefinisikan perilaku tambahan yang harus dimiliki oleh class.

Implementasi Interface
Class UC dan Voucher mengimplementasikan interface Aksi, sehingga wajib mengisi method beli() dan tampilInfo().

Polymorphism
Polymorphism tetap digunakan melalui:

Overriding pada method tampil()
Overloading pada method tampil(String prefix)

Kesimpulan
Program ini telah memenuhi semua ketentuan yaitu penggunaan abstract class, abstract method, interface, serta polymorphism. Struktur program tetap mengikuti project sebelumnya namun dengan penambahan konsep OOP yang lebih lanjut.
