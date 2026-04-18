import java.util.ArrayList;
import java.util.Scanner;

// INTERFACE
interface Aksi {
    void beli();
    void tampilInfo();
}

// ABSTRACT CLASS
abstract class Produk {
    protected String id;
    protected String nama;
    protected int harga;

    public Produk(String id, String nama, int harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // ABSTRACT METHOD
    abstract void tampil();

    // OVERLOADING
    public void tampil(String prefix) {
        System.out.println(prefix + "ID: " + id + " | Nama: " + nama + " | Harga: " + harga);
    }
}

// CHILD CLASS 1
class UC extends Produk implements Aksi {
    private int jumlahUC;

    public UC(String id, String nama, int jumlahUC, int harga) {
        super(id, nama, harga);
        this.jumlahUC = jumlahUC;
    }

    // OVERRIDE dari abstract
    @Override
    void tampil() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | UC: " + jumlahUC + " | Harga: " + harga);
    }

    // IMPLEMENT INTERFACE
    @Override
    public void beli() {
        System.out.println("Pembelian UC berhasil");
    }

    @Override
    public void tampilInfo() {
        System.out.println("Produk UC: " + nama);
    }
}

// CHILD CLASS 2
class Voucher extends Produk implements Aksi {
    private String game;

    public Voucher(String id, String nama, String game, int harga) {
        super(id, nama, harga);
        this.game = game;
    }

    // OVERRIDE dari abstract
    @Override
    void tampil() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Game: " + game + " | Harga: " + harga);
    }

    // IMPLEMENT INTERFACE
    @Override
    public void beli() {
        System.out.println("Pembelian Voucher berhasil");
    }

    @Override
    public void tampilInfo() {
        System.out.println("Voucher Game: " + game);
    }
}

public class posttest5pbo {

    static ArrayList<Produk> dataProduk = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void tambahData() {
        System.out.println("\nTambah Data");
        System.out.println("1. Paket UC");
        System.out.println("2. Voucher Game");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();
        input.nextLine();

        System.out.print("ID: ");
        String id = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            System.out.print("Jumlah UC: ");
            int jumlah = input.nextInt();
            input.nextLine();
            dataProduk.add(new UC(id, nama, jumlah, harga));

        } else if (pilih == 2) {
            System.out.print("Nama Game: ");
            String game = input.nextLine();
            dataProduk.add(new Voucher(id, nama, game, harga));
        }

        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {
        System.out.println("\nDaftar Produk");

        if (dataProduk.isEmpty()) {
            System.out.println("Data kosong");
            return;
        }

        for (Produk p : dataProduk) {
            p.tampil(); // polymorphism

            // akses interface
            if (p instanceof Aksi) {
                ((Aksi) p).tampilInfo();
            }

            System.out.println("-------------------");
        }
    }

    static void beliProduk() {
        System.out.print("Masukkan ID produk yang ingin dibeli: ");
        String id = input.nextLine();

        for (Produk p : dataProduk) {
            if (p.getId().equals(id)) {
                if (p instanceof Aksi) {
                    ((Aksi) p).beli();
                }
                return;
            }
        }

        System.out.println("Produk tidak ditemukan");
    }

    static void menu() {
        while (true) {
            System.out.println("\n=== Sistem Penjualan ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Beli Produk");
            System.out.println("4. Exit");

            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    beliProduk();
                    break;
                case 4:
                    System.out.println("Program selesai");
                    return;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}