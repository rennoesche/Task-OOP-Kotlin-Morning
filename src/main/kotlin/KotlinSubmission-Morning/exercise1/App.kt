package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Rafi Nur"
    val namaBelakang = "Latif"
    val umur = 22
    val statusku = true // aku setting true jika single, false jika tidak

    println("Nama: $namaDepan $namaBelakang")
    println("Umur: $umur")
    println("Status: ${if(statusku) "Single" else "Tidak single"}")


}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Anggota: $groupMember")
    println("Sesi: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = listOf("Faisal","Wahyu","Pangeran","Rafi","Shofi","Deri","Serly","Lestari","Nauval","Shofiyyah")
    val aku = groupMember[3]
    return listOf(aku)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Syarif", "Megy")
    val countOfGroup = arrayOf("Faisal","Wahyu","Pangeran","Rafi","Shofi","Deri","Serly","Lestari","Nauval","Shofiyyah")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("UMI", listOf("Faisal","Wahyu","Pangeran","Rafi","Shofi","Deri","Serly","Lestari","Nauval","Shofiyyah"), "Morning")

}