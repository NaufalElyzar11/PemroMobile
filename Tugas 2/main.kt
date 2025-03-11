data class Pasien(
    val id: Int,
    var nama: String,
    var tanggal: String,
    var keluhan: String,
    var diagnosa: String?
)

class CatatanMedis {
    private val daftarPasien = mutableListOf<Pasien>()
    private var idCounter = 1

    fun tambah(nama: String, tanggal: String, keluhan: String, diagnosa: String?) {
        val pasien = Pasien(idCounter++, nama, tanggal, keluhan, diagnosa)
        daftarPasien.add(pasien)
        println("Data sudah ditambah:D\n")
    }

    fun list() {
        if (daftarPasien.isEmpty()) {
            println("Data masih kosong:)\n")
        } else {
            daftarPasien.forEach { println(it) }
        }
    }

    fun edit(id: Int, nama: String?, tanggal: String?, keluhan: String?, diagnosa: String?) {
        val pasien = daftarPasien.find { it.id == id }
        pasien?.let {
            nama?.let { it1 -> it.nama = it1 }
            tanggal?.let { it1 -> it.tanggal = it1 }
            keluhan?.let { it1 -> it.keluhan = it1 }
            diagnosa?.let { it1 -> it.diagnosa = it1 }
            println("Data selesai di update\n")
        } ?: println("Pasien dengan ID $id tidak ada.\n")
    }

    fun hapus(id: Int) {
        val removed = daftarPasien.removeIf { it.id == id }
        if (removed) println("Data sudah dihapus") else println("Data tidak dtemukan")
    }

    fun show(id: Int) {
        daftarPasien.find { it.id == id }?.let {
            println("Detail Pasien: $it\n")
        } ?: println("Pasien tidak ada\n")
    }
}

fun main() {
    val catatanMedis = CatatanMedis()
    while (true) {
        println("1. Tambah data Pasien")
        println("2. List data")
        println("3. Edit data Pasien")
        println("4. Hapus data")
        println("5. Show data")
        println("6. Keluar")
        print("Pilih menu: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Nama: ")
                val nama = readLine() ?: ""
                print("Tanggal Kunjungan: ")
                val tanggal = readLine() ?: ""
                print("Keluhan: ")
                val keluhan = readLine() ?: ""
                print("Diagnosa : ")
                val diagnosa = readLine()
                catatanMedis.tambah(nama, tanggal, keluhan, diagnosa)
            }
            2 -> catatanMedis.list()
            3 -> {
                print("ID Pasien: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    print("Note: kosongkan jika datanya tidak ingin diubah")
                    print("Nama : ")
                    val nama = readLine()?.takeIf { it.isNotEmpty() }
                    print("Tanggal Kunjungan : ")
                    val tanggal = readLine()?.takeIf { it.isNotEmpty() }
                    print("Keluhan : ")
                    val keluhan = readLine()?.takeIf { it.isNotEmpty() }
                    print("Diagnosa : ")
                    val diagnosa = readLine()?.takeIf { it.isNotEmpty() }
                    catatanMedis.edit(id, nama, tanggal, keluhan, diagnosa)
                } else {
                    println("ID tidak ada")
                }
            }
            4 -> {
                print("ID Pasien yang akan dihapus: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) catatanMedis.hapus(id) else println("ID tidak ada")
            }
            5 -> {
                print("ID Pasien: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) catatanMedis.show(id) else println("ID tidak ada")
            }
            6 -> return
            else -> println("Pilihan salah")
        }
    }
}
