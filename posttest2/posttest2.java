import java.util.ArrayList;
import java.util.Scanner;

class UC {
    private String id;
    private String namaPaket;
    private int jumlahUC;
    private int harga;

    public UC(String id, String namaPaket, int jumlahUC, int harga) {
        this.id = id;
        this.namaPaket = namaPaket;
        this.jumlahUC = jumlahUC;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public int getJumlahUC() {
        return jumlahUC;
    }

    public int getHarga() {
        return harga;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public void setJumlahUC(int jumlahUC) {
        this.jumlahUC = jumlahUC;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

public class Main {

    static ArrayList<UC> dataUC = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static void tambahData() {
        System.out.println("\nTambah Paket UC");

        System.out.print("ID Paket: ");
        String id = input.nextLine();

        System.out.print("Nama Paket: ");
        String nama = input.nextLine();

        System.out.print("Jumlah UC: ");
        int jumlah = input.nextInt();

        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine(); // buang newline

        UC paket = new UC(id, nama, jumlah, harga);
        dataUC.add(paket);

        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {
        System.out.println("\nDaftar Paket UC");

        if (dataUC.isEmpty()) {
            System.out.println("Data masih kosong");
            return;
        }

        for (UC uc : dataUC) {
            System.out.println(
                "ID: " + uc.getId() +
                " | Nama: " + uc.getNamaPaket() +
                " | UC: " + uc.getJumlahUC() +
                " | Harga: " + uc.getHarga()
            );
        }
    }

    static void updateData() {
        System.out.print("Masukkan ID paket yang ingin diupdate: ");
        String id = input.nextLine();

        for (UC uc : dataUC) {
            if (uc.getId().equals(id)) {

                System.out.print("Nama paket baru: ");
                String nama = input.nextLine();

                System.out.print("Jumlah UC baru: ");
                int jumlah = input.nextInt();

                System.out.print("Harga baru: ");
                int harga = input.nextInt();
                input.nextLine();

                uc.setNamaPaket(nama);
                uc.setJumlahUC(jumlah);
                uc.setHarga(harga);

                System.out.println("Data berhasil diupdate");
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    static void hapusData() {
        System.out.print("Masukkan ID paket yang ingin dihapus: ");
        String id = input.nextLine();

        for (int i = 0; i < dataUC.size(); i++) {
            if (dataUC.get(i).getId().equals(id)) {
                dataUC.remove(i);
                System.out.println("Data berhasil dihapus");
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
    }

    static void menu() {
        while (true) {
            System.out.println("\nSistem Penjualan UC PUBG Mobile");
            System.out.println("1. Tambah Paket UC");
            System.out.println("2. Lihat Paket UC");
            System.out.println("3. Update Paket UC");
            System.out.println("4. Hapus Paket UC");
            System.out.println("5. Exit");

            System.out.print("Pilih menu: ");
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
                    updateData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
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
