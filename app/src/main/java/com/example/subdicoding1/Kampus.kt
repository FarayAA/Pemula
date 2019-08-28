package com.example.subdicoding1


data class Kampus(
    var nama: String = "",
    var dari: String = "",
    var foto: String = ""
)

object KampusData{
    var data = arrayOf(
        arrayOf(
            "Universitas Sebelas Maret",
            "Universitas Sebelas Maret biasa disingkat sebagai UNS (Universitas Sewelas Maret Surakarta) adalah salah satu universitas negeri di Indonesia yang berada di Kota Solo. Universitas yang giat membangun ini, menyediakan berbagai paket pendidikan diploma, sarjana, pascasarjana, dan doktoral.",
            "https://upload.wikimedia.org/wikipedia/id/b/b2/UNS_LOGO.png"
        ),
        arrayOf(
            "Universitas Diponegoro",
            "adalah sebuah Perguruan Tinggi Negeri di Indonesia yang berlokasi di Semarang, Jawa Tengah, Indonesia. Undip didirikan pada tahun 1956 sebagai Perguruan Tinggi Swasta dan baru mendapat status sebagai Perguruan Tinggi Negeri pada tahun 1961. Kata Diponegoro diambil dari nama pahlawan nasional, yaitu Pangeran Diponegoro yang merupakan seorang pangeran pengobar semangat kemerdekaan dari tindakan kolonialisme Belanda di awal abad ke-18. Semangat ini turut menginspirasi pendirian Undip.",
            "https://upload.wikimedia.org/wikipedia/id/2/2d/Undip.png"
        ),
        arrayOf(
            "Universitas Padjadjaran",
            "adalah sebuah perguruan tinggi negeri di Bandung, Jawa Barat, Indonesia.\n" +
                    "\n" +
                    "Pada 20 Oktober 2014, Universitas ini berubah status menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) dari Badan Layanan Umum (BLU). Peresmian itu ditandai dengan peraturan pemerintah (PP) yang ditandatangani mantan Presiden Susilo Bambang Yudhoyono. Penetapan itu didasarkan atas evaluasi kinerja yang dilakukan tim independen yang dibentuk Kementerian Pendidikan dan Kebudayan (Kemendikbud). Selain itu berdasarkan Keputusan Badan Akreditasi Nasional Perguruan Tinggi (BAN PT) yang ditetapkan pada 16 Januari 2014, Unpad mendapat peringkat A (sangat baik).",
            "https://upload.wikimedia.org/wikipedia/id/6/62/Logo_Unpad.JPG"
        ),
        arrayOf(
            "Universitas Negeri Jakarta",
            "Universitas Negeri Jakarta adalah perguruan tinggi negeri yang terdapat di kota Jakarta, Indonesia yang didirikan pada tahun 1964. Melalui Keputusan Presiden RI No. 1 tahun 1963 tanggal 3 Januari 1963, ditetapkan integrasi sistem kelembagaan pendidikan guru. Salah satu butir pernyataan Keppres tersebut adalah bahwa surat keputusan ini berlaku sejak 16 Mei 1964, yang kemudian dinyatakan sebagai hari lahirnya IKIP Jakarta, IKIP Jakarta sejak tanggal 4 Agustus 1999 berubah menjadi Universitas Negeri Jakarta (UNJ) berdasarkan Keppres 093/1999 tanggal 4 Agustus 1999.",
            "https://upload.wikimedia.org/wikipedia/id/6/6e/Logo-unj.png"
        ),
        arrayOf(
            "Institut Teknologi Bandung",
            "adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung. Nama ITB diresmikan pada tanggal 2 Maret 1959. Sejak tanggal 14 Oktober 2013 ITB menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) yang memiliki otonomi pengelolaan dalam akademik dan nonakademik.",
            "https://upload.wikimedia.org/wikipedia/id/9/95/Logo_Institut_Teknologi_Bandung.png"
        ),
        arrayOf(
            "Universitas Indonesia",
            "adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, dan kampus utama lainnya terdapat di daerah Salemba di Jakarta Pusat. Universitas Indonesia adalah kampus modern, komprehensif, terbuka, multibudaya, dan humanis yang mencakup disiplin ilmu yang luas. Telah menghasilkan lebih dari 400.000 alumni. Secara umum dianggap sebagai salah satu dari tiga perguruan tinggi papan atas di Indonesia bersama dengan Universitas Gadjah Mada dan Institut Teknologi Bandung.",
            "https://upload.wikimedia.org/wikipedia/id/9/95/Makara_UI.png"
        ),
        arrayOf(
            "Universitas Gadjah Mada",
            "merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949 berdasarkan Peraturan Pemerintah Nomor 23 Tahun 1949 tentang Peraturan Tentang Penggabungan Perguruan Tinggi Menjadi Universiteit tanggal 16 Desember 1949.[4] Kampus UGM yang terletak di Yogyakarta merupakan universitas pertama yang didirikan oleh Pemerintah Republik Indonesia setelah Indonesia merdeka.",
            "https://upload.wikimedia.org/wikipedia/id/2/29/Logo_Universitas_Gadjah_Mada.png"
        ),
        arrayOf(
            "Universitas Islam Negeri Sunan Kalijaga Yogyakarta",
            "Universitas Islam Negeri (UIN) Sunan Kalijaga (bahasa Inggris: Sunan Kalijaga State Islamic University), sering disingkat UIN Suka, adalah Perguruan Tinggi Agama Islam Negeri (PTAIN) pertama di Indonesia. Nama UIN Sunan Kalijaga diambil dari salah satu kelompok penyebar agama Islam di Jawa, Walisongo yaitu Sunan Kalijaga. Kampus UIN Sunan Kalijaga berlokasi di dekat perbatasan antara Kota Yogyakarta dengan Kabupaten Sleman, tepatnya di Jalan Marsda Adisucipto no. 1.",
            "https://upload.wikimedia.org/wikipedia/id/b/b4/UIN_SUNAN_KALIJAGA.jpg"
        ),
        arrayOf(
            "Universitas Negeri Yogyakarta",
            "merupakan pengembangan dari IKIP Yogyakarta yang telah berdiri 21 Mei 1964. Sejarah panjang UNY dalam dunia pendidikan Indonesia telah menghasilkan tenaga kependidikan dan nonkependidikan yang berkualitas unggul. Banyak tenaga pengajar berkualifikasi S2 dan S3, pegawai profesional, perpustakaan universitas dan fakultas yang lengkap, pusat komputer, jaringan internet 24 jam, sarana olahraga berstandar internasional, pusat bahasa, laboratorium penelitian modern, dan lingkungan yang asri membuat kampus yang dijuluki The Green Campus ini menjadi salah satu universitas terfavorit dan layak diperhitungkan. Untuk menjawab tantangan global, mulai tahun 2008, UNY telah siap menuju World Class University.",
            "http://images.semarangpos.com/2013/01/Logo-Universitas-Negeri-Yogyakarta.png"
        ),
        arrayOf(
            "Universitas Brawijaya",
            "adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB. Nama Brawijaya diberikan khusus oleh Presiden Soekarno dengan harapan mampu gemilang seperti Raden Wijaya (Brawijaya I) selaku pendiri Kerajaan Majapahit sekaligus menjadi kampus kebanggan bangsa Indonesia.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Logo_Universitas_Brawijaya.svg/1200px-Logo_Universitas_Brawijaya.svg.png"
        )


    )
    val listData: ArrayList<Kampus>
        get() {
            val list = ArrayList<Kampus>()
            for (aData in data) {
                val pondok = Kampus()
                pondok.nama = aData[0]
                pondok.dari = aData[1]
                pondok.foto = aData[2]
                list.add(pondok)
            }
            return list
        }
}