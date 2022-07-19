package com.example.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namakotaList = listOf<makanan>(
            makanan(
                R.drawable.aymgprk,
                namemakanan = "Ayam Geprek",
                descmakanan = "Ayam geprek adalah makanan ayam goreng tepung khas Indonesia yang diulek atau dilumatkan bersama sambal bajak.",
                desc2makanan = "Sebagian besar sumber menyebut bahwa ayam geprek berasal dari Kota Yogyakarta. Kini, ayam geprek telah menjadi hidangan populer yang dapat ditemukan di hampir semua kota besar di Indonesia."
            ),
            makanan(
                R.drawable.aymgrng,
                namemakanan = "Ayam Goreng",
                descmakanan = "Ayam goreng (bahasa Inggris: fried chicken), atau ayam goreng tepung adalah hidangan yang dibuat dari potongan daging ayam yang telah dilapisi dengan tepung atau adonan encer yang dibumbui dan digoreng, digoreng rendam, digoreng dengan penggorengan bertekanan, atau digoreng udara.",
                desc2makanan = "Hidangan pertama yang diketahui telah digoreng adalah gorengan dari Abad Pertengahan Eropa. Namun, orang Skotlandia adalah orang Eropa pertama yang diketahui menggoreng ayam dengan lemak (meskipun tanpa bumbu). Sementara itu, banyak masyarakat Afrika Barat memiliki tradisi ayam goreng yang dibumbui (daging ayam dibungkus adonan dan dimasak dengan minyak kelapa sawit). "
            ),
            makanan(
                R.drawable.bks,
                namemakanan = "Bakso",
                descmakanan = "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. ",
                desc2makanan = "Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau."
            ),
            makanan(
                R.drawable.miach,
                namemakanan = "Mie Aceh",
                descmakanan = "Mi aceh adalah masakan mi pedas khas Aceh di Indonesia.",
                desc2makanan = "Mie kuning tebal dengan irisan daging sapi, daging kambing atau makanan laut disajikan dalam sup sejenis kari yang gurih dan pedas. Mi aceh biasanya ditaburi dengan bawang goreng dan disajikan bersama emping, potongan bawang merah, mentimun, dan jeruk nipis."
            ),
            makanan(
                R.drawable.miaym,
                namemakanan = "Mie Ayam",
                descmakanan = "Mi ayam adalah hidangan khas Indonesia yang terbuat dari mi gandum kuning yang dibumbui dengan daging ayam yang biasanya dipotong dadu.",
                desc2makanan = "Di Indonesia, mi ayam merupakan hidangan Tionghoa-Indonesia yang sangat populer. Mi ayam sering dijual sebagai hidangan jalanan oleh pedagang kaki lima dengan gerobak keliling sederhana, yang biasanya berkeliling di jalan-jalan sekitar perumahan warga. Mi ayam juga merupakan hidangan populer yang disajikan di warung makan kecil pinggir jalan, hingga rumah makan besar."
            ),
            makanan(
                R.drawable.migrng,
                namemakanan = "Mie Goreng",
                descmakanan = "Mi goreng berarti \"mi yang digoreng\" adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia. Mi goreng juga populer dan juga digemari di Malaysia, dan Singapura.",
                desc2makanan = "Mi goreng terbuat dari mi kuning yang digoreng dengan sedikit minyak goreng, dan ditambahkan bawang putih, bawang merah, udang serta daging ayam atau daging sapi, irisan bakso, cabai, sayuran, tomat, telur ayam, dan acar."
            ),
            makanan(
                R.drawable.nasgor,
                namemakanan = "Nasi Goreng",
                descmakanan = "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega.",
                desc2makanan = "Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk."
            ),
            makanan(
                R.drawable.nsiduk,
                namemakanan = "Nasi Uduk",
                descmakanan = "Nasi uduk adalah hidangan yang dibuat dari nasi putih yang diaron dan dikukus dengan santan, serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica.",
                desc2makanan = "Hidangan ini mulai dibuat penduduk pulau Jawa sekitar tahun 1910-1924 dan dipopulerkan oleh Hindia Belanda setelahnya."
            ),
            makanan(
                R.drawable.pangsit,
                namemakanan = "Pangsit",
                descmakanan = "Pangsit adalah makanan berupa daging cincang yang dibungkus lembaran tepung terigu.",
                desc2makanan = "Setelah direbus sebentar, pangsit umumnya dihidangkan di dalam sup. Selain direbus, pangsit juga bisa digoreng dengan minyak goreng yang banyak hingga seperti kerupuk. Pangsit termasuk salah satu jenis dimsum."
            ),
            makanan(
                R.drawable.sto,
                namemakanan = "Soto",
                descmakanan = "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan daging ayam, tetapi ada pula yang menggunakan daging babi atau daging kambing.",
                desc2makanan = "Untuk menambah kenikmatan soto, biasanya juga disertai berbagai macam lauk, misalnya kerupuk, perkedel, emping, sambal, dan sambal kacang. Ada pula yang menambahkan telur puyuh, sate kerang, jeruk limau, berbagai macam gorengan (tempe, tahu, bakwan), bawang goreng, seledri, tauco, dan koya."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = makananadapter(this, namakotaList) {
            val intent = Intent(this, detail_makanan::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}




