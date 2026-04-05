import java.util.ArrayList;
import java.util.Scanner;

// Parent Class
class Produk {
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampil() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Harga: " + harga);
    }
}

// Child Class 1
class UC extends Produk {
    private int jumlahUC;

    public UC(String id, String nama, int jumlahUC, int harga) {
        super(id, nama, harga);
        this.jumlahUC = jumlahUC;
    }

    public int getJumlahUC() {
        return jumlahUC;
    }

    public void setJumlahUC(int jumlahUC) {
        this.jumlahUC = jumlahUC;
    }

    @Override
    public void tampil() {
        System.out.println(
                "ID: " + id +
                        " | Nama: " + nama +
                        " | UC: " + jumlahUC +
                        " | Harga: " + harga
        );
    }
}

// Child Class 2
class Voucher extends Produk {
    private String game;

    public Voucher(String id, String nama, String game, int harga) {
        super(id, nama, harga);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public void tampil() {
        System.out.println(
                "ID: " + id +
                        " | Nama: " + nama +
                        " | Game: " + game +
                        " | Harga: " + harga
        );
    }
}

public class Main {

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
            p.tampil(); // polymorphism kepake di sini
        }
    }

    static void hapusData() {
        System.out.print("Masukkan ID: ");
        String id = input.nextLine();

        for (int i = 0; i < dataProduk.size(); i++) {
            if (dataProduk.get(i).getId().equals(id)) {
                dataProduk.remove(i);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    static void menu() {
        while (true) {
            System.out.println("\n=== Sistem Penjualan ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
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
                    hapusData();
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