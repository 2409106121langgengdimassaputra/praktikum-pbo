const readline = require("readline-sync")

// Class UC
class UC {
    constructor(id, namaPaket, jumlahUC, harga) {
        this.id = id
        this.namaPaket = namaPaket
        this.jumlahUC = jumlahUC
        this.harga = harga
    }
}

// ArrayList penyimpanan data
let dataUC = []

// CREATE
function tambahData() {
    console.log("\n=== Tambah Paket UC ===")

    let id = readline.question("Masukkan ID Paket : ")
    let nama = readline.question("Masukkan Nama Paket : ")
    let jumlah = readline.questionInt("Masukkan Jumlah UC : ")
    let harga = readline.questionInt("Masukkan Harga : ")

    let paketBaru = new UC(id, nama, jumlah, harga)
    dataUC.push(paketBaru)

    console.log("Data berhasil ditambahkan!")
}

// READ
function lihatData() {
    console.log("\n=== Data Paket UC ===")

    if (dataUC.length === 0) {
        console.log("Data masih kosong")
        return
    }

    console.log("ID\tNama Paket\tJumlah UC\tHarga")

    dataUC.forEach((item) => {
        console.log(
            item.id + "\t" +
            item.namaPaket + "\t\t" +
            item.jumlahUC + "\t\t" +
            item.harga
        )
    })
}

// UPDATE
function updateData() {
    console.log("\n=== Update Paket UC ===")

    let id = readline.question("Masukkan ID Paket yang ingin diupdate : ")

    let ditemukan = false

    for (let i = 0; i < dataUC.length; i++) {
        if (dataUC[i].id === id) {

            let nama = readline.question("Nama Paket Baru : ")
            let jumlah = readline.questionInt("Jumlah UC Baru : ")
            let harga = readline.questionInt("Harga Baru : ")

            dataUC[i].namaPaket = nama
            dataUC[i].jumlahUC = jumlah
            dataUC[i].harga = harga

            console.log("Data berhasil diupdate!")
            ditemukan = true
            break
        }
    }

    if (!ditemukan) {
        console.log("Data tidak ditemukan!")
    }
}

// DELETE
function hapusData() {
    console.log("\n=== Hapus Paket UC ===")

    let id = readline.question("Masukkan ID Paket yang ingin dihapus : ")

    let index = dataUC.findIndex(item => item.id === id)

    if (index !== -1) {
        dataUC.splice(index, 1)
        console.log("Data berhasil dihapus!")
    } else {
        console.log("Data tidak ditemukan!")
    }
}

// MENU
function menu() {

    while (true) {

        console.log("\n===== SISTEM PENJUALAN UC PUBG MOBILE =====")
        console.log("1. Tambah Paket UC")
        console.log("2. Lihat Paket UC")
        console.log("3. Update Paket UC")
        console.log("4. Hapus Paket UC")
        console.log("5. Exit")

        let pilih = readline.questionInt("Pilih menu : ")

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
                console.log("Program selesai.")
                return

            default:
                console.log("Menu tidak tersedia!")
        }
    }
}


menu()