const readline = require("readline-sync")

class UC {

    #id
    #namaPaket
    #jumlahUC
    #harga

    constructor(id, namaPaket, jumlahUC, harga) {
        this.#id = id
        this.#namaPaket = namaPaket
        this.#jumlahUC = jumlahUC
        this.#harga = harga
    }

    getId() {
        return this.#id
    }

    getNamaPaket() {
        return this.#namaPaket
    }

    getJumlahUC() {
        return this.#jumlahUC
    }

    getHarga() {
        return this.#harga
    }

    setNamaPaket(nama) {
        this.#namaPaket = nama
    }

    setJumlahUC(jumlah) {
        this.#jumlahUC = jumlah
    }

    setHarga(harga) {
        this.#harga = harga
    }
}

let dataUC = []

function tambahData() {

    console.log("\nTambah Paket UC")

    let id = readline.question("ID Paket: ")
    let nama = readline.question("Nama Paket: ")
    let jumlah = readline.questionInt("Jumlah UC: ")
    let harga = readline.questionInt("Harga: ")

    let paket = new UC(id, nama, jumlah, harga)

    dataUC.push(paket)

    console.log("Data berhasil ditambahkan")
}

function lihatData() {

    console.log("\nDaftar Paket UC")

    if (dataUC.length === 0) {
        console.log("Data masih kosong")
        return
    }

    for (let i = 0; i < dataUC.length; i++) {

        console.log(
            "ID:", dataUC[i].getId(),
            "| Nama:", dataUC[i].getNamaPaket(),
            "| UC:", dataUC[i].getJumlahUC(),
            "| Harga:", dataUC[i].getHarga()
        )
    }
}

function updateData() {

    let id = readline.question("Masukkan ID paket yang ingin diupdate: ")

    for (let i = 0; i < dataUC.length; i++) {

        if (dataUC[i].getId() === id) {

            let nama = readline.question("Nama paket baru: ")
            let jumlah = readline.questionInt("Jumlah UC baru: ")
            let harga = readline.questionInt("Harga baru: ")

            dataUC[i].setNamaPaket(nama)
            dataUC[i].setJumlahUC(jumlah)
            dataUC[i].setHarga(harga)

            console.log("Data berhasil diupdate")
            return
        }
    }

    console.log("Data tidak ditemukan")
}

function hapusData() {

    let id = readline.question("Masukkan ID paket yang ingin dihapus: ")

    for (let i = 0; i < dataUC.length; i++) {

        if (dataUC[i].getId() === id) {

            dataUC.splice(i, 1)

            console.log("Data berhasil dihapus")
            return
        }
    }

    console.log("Data tidak ditemukan")
}

function menu() {

    while (true) {

        console.log("\nSistem Penjualan UC PUBG Mobile")
        console.log("1. Tambah Paket UC")
        console.log("2. Lihat Paket UC")
        console.log("3. Update Paket UC")
        console.log("4. Hapus Paket UC")
        console.log("5. Exit")

        let pilih = readline.questionInt("Pilih menu: ")

        switch (pilih) {

            case 1:
                tambahData()
                break

            case 2:
                lihatData()
                break

            case 3:
                updateData()
                break

            case 4:
                hapusData()
                break

            case 5:
                console.log("Program selesai")
                return

            default:
                console.log("Menu tidak tersedia")
        }
    }
}

menu()
