package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    val bangDeri = "Abca1"

    try {
        val ubahDeri = bangDeri.toInt()
        println("Bang Deri $bangDeri sudah diubah ke Int menjadi $ubahDeri")
    }
    catch(e: NumberFormatException) {
        println("Terjadi kesalahan: bang deri tidak bisa diubah")
    }

}

