package com.sekar.wisatakarawang

object TouristSitesData {
    private val touristSitesNames = arrayOf(
        "Bendungan Walahar",
        "Candi Jiwa",
        "Curug Cigentis",
        "Danau Cipule",
        "Green Canyon",
        "Gunung Sanggabuana",
        "Hutan Kertas",
        "Kampung Budaya",
        "Monumen Rawagede",
        "Monumen Kebulatan Tekad",
        "Pantai Samudera Baru",
        "Pantai Tanjung Pakis",
        "Vihara Sian Djin Ku Poh",
        "Wonderland Adventure Waterpark"
    )

    private val touristSitesDetails = arrayOf(
        "Bendungan Walahar adalah sebuah bendungan kuno yang didirikan sejak tahun 1925 dan sangat terkenal di Karawang. Tempat ini sering digunakan masyarakat untuk berwisata bersama keluarga maupun memancing. Bendungan ini tepatnya terletak di Kutapohaci, Ciampel, Karawang. Dikarenakan bendungan ini sebenarnya adalah tempat umum, jadi Anda tidak perlu mengeluarkan biaya sepeserpun untuk mendatanginya. Hanya perlu menyiapkan kamera guna mengambil pemandangan yang sangat indah.",
        "Cadi Jiwa adalah satu dari beberapa situs purbakala yang ada di kabupaten Karawang yakni situs Batujaya. Diperkirakan luas dari situs kurang lebih 5 kilometer persegi dan berada di tengah area sawah di daerah pesisir utara Karawang. Selain itu, umat Budha juga masih sering melakukan ritual di area situs ini. Sedangkan untuk Candi Jawa ini merupakan sebuah gundukan tanah yang mempunyai bentuk oval dengan ukuran 19×19 meter dan ketinggian 4 meter. Permukaannya berupa susunan batu bata berdiamater 6 meter dan diduga merupakan susunan stupa. Itulah keunikan candi ini dibanding dengan candi lainnya. Biasanya candi terdiri dari tumpukan batu hitam, Candi Jiwa ini terdiri dari tumpukan batu bata.",
        "Curug Cigentis merupakan sebuah air terjun indah setinggi kurang lebih 25 meter yang berada di kawasan pariwisata Gunung Sanggabuana. Salah satu kawasan wisata di Karawang ini memang sudah lama dan sering digunakan untuk tempat hiking, tracking, dan juga bersepeda oleh para penggemar olah raga alam. Selain pemandangan cantik yang dihasilkan oleh air terjun, area wisata ini juga menyediakan panorama pepohonan hijau dan pemandangan alami khas pegunungan Pasundan yang tidak kalah menarik.",
        "Danau Cipule adalah sebuah danau yang mempunyai ukuran luas sekitar 90 hektar dan terbentuk akibat kegiatan pada area tepi sungai Citarum. Meskipun kedalaman dari danau ini cukup dangkal yakni sekitar 2 meter, namun keindahan panorama dan pemandangan alam di sekitarnya sangatlah menakjubkan. Keindahan dari Danau Cipule ini tidak hanya sampai disitu saja. Namun, di bagian tengah dari danau ini juga terdapat pulau yang memiliki luas sekitar 2 km persegi dan disebut dengan Pulau Cinta. Ketika Anda menyebrang ke pulau ini, disana sudah terdapat berbagai fasilitas yang mendukung untuk menikmati keindahan dari Danau Cipule.",
        "Wisata air ini sering juga disebut dengan istilah Leuwi Liyet yang merupakan sebuah ngarai yang awalnya terbentuk akibat erosi air sungai dengan pemandangan stalaknit, diapit oleh perbukitan berupa bebatuan dan dikelilingi oleh pepohonan hijau yang rimbun. Green Canyon berada di Kampung Tonjong Roke di ujung selatan Kabupaten Karawang. Luas ngarai yakni 100 meter dengan hiasan tebing-tebing hijau dengan ketinggian sekitar 10 meter. Anda hanya membutuhkan waktu tempuh perjalanan selama kurang lebih 2 jam dari pusat Kota Karawang dengan menggunakan kendaraan pribadi. Disebut ‘Green Canyon’ karena air sungainya berwarna hijau dan jernih.",
        "Gunung Sanggabuana merupakan satu-satunya gunung di Karawang dengan ketinggiannya mencapai 1291 mdpl. Gunung ini menjadi pembatas antara 5 daerah yaitu Karawang, Bogor, Cianjur, Bekasi, dan Purwakarta. Meskipun terkenal dengan jalur yang menanjak dalam waktu 2 jam, banyak para pendaki gunung yang melakukan hiking disini. Fasilitas yang tersedia cukup lengkap antara lain warung, mushola, toilet hingga gazebo untuk tempat menginap para tamu.",
        "Tempat ini dinamakan ‘Hutan Kertas’ karena kawasan tersebut ditanami pohon Eukaliptus, bahan baku untuk produksi kertas. Kawasan hutan kertas itu sendiri dimiliki oleh PT Pindo Deli. Pada 2017, sekelompok pemuda setempat berinisiatif untuk mengubah kawasan tersebut menjadi tempat wisata. Tangan-tangan kreatif mereka berhasil ‘menyulap’ hutan Eukaliptus menjadi lokasi yang makin asri, rapi, bersih, dan Instagramable. Terdapat berbagai macam fasilitas, mulai dari tempat swafoto, rumah pohon, hammock, bahkan cafe dan panggung mini. Lokasi ini sering dijadikan tempat foto prawedding hingga pembuatan cinematic video.",
        "Kampung Budaya Karawang merupakan tempat wisata unik yang dibangun oleh pemerintah Karawang pada tahun 2015. Tempat ini dibangun dengan tujuan untuk melestarikan kebudayaan dan kesenian yang dibuat oleh seniman dari Karawang. Maka dari itu, kampung tidak pernah sepi dari para pengunjung. Banyak barang menarik dan unik yang dipajang dan dijual di kampung budaya ini. Ketika Anda mulai memasuki kawasan Kampung Budaya Karawang ini, maka akan langsung disuguhi dengan pemandangan pesawahan serta bangunan khas Sunda. Tidak hanya itu saja, di area ini juga terdapat dua sanggar tari yang massif aktif hingga sekarang yaitu sanggar tari pedalangan dan jaipong.",
        "Monumen Rawa Gede adalah sebuah Objek Wisata di Karawang yang dibangun dengan tujuan untuk mengenang korban sipil dari pembunuhan oleh tentara Belanda di masa penjajah. Dapat dikatakan bahwa monumen ini merupakan sebuah taman makan pahlawan serta korban ketika perlawanan menghadapi Belanda. Objek wisata sejarah ini terletak di jalan Monumen Rawagede, Mekarjaya, Rawamerta, Karawang.",
        "Selain Monumen Rawa Gede, di kabupaten Karawang juga terdapat sebuah monumen nasional lainnya yang bernama Monumen Kebulatan Tekad Rengasdengklok. Monumen ini dibuat dengan tujuan mengenang perjuangan dan sejarah awal dari proklamasi kemerdekaan Indonesia oleh para pahlawan. Meskipun area yang digunakan dalam mendirikan monumen ini hanya seluas 1500 m persegi, namun segala hal didalamnya sangat menarik untuk diketahui. Monumen ini terletak di jalan raya Rengasdengklok. Untuk mengunjungi monumen perjuangan tersebut, Anda juga bisa menggunakan angkutan umum.",
        "Pantai Samudera Baru tepatnya berlokasi di jalan raya Sungai Buntu. Anda akan menemui suasana yang hampir sama indahnya dengan Pantai Tanjung Pakis. Hal ini karena letaknya yang cukup dekat dengan muara sehingga air di pantai ini juga berwarna agak kecokelatan. Jalur yang harus dilalui untuk mencapai Pantai Samudera Baru ini masih kurang bagus, sehingga Anda perlu untuk berhati-hati dan waspada terutama ketika musim hujan tiba. Namun perjuangan dalam perjalanan tentunya akan terbayarkan dengan keindahan pantai yang sangat memukau.",
        "Apabila Anda ingin menikmati keindahan dan suasana pantai di Karawang tidak perlu khawatir, di kabupaten yang terletak di Jawa Barat ini, juga menyediakan objek wisata pantai dengan pasir hitam yang sangat menarik. Pantai yang indah ini bernama Pantai Tanjung Pakis dan terletak di Desa Tanjung Pakis. Dapat dikatakan bahwa pantai satu ini merupakan pantai yang cukup unik. Hal ini dikarenakan setiap pengunjung perlu menaiki rakit terlebih dahulu agar dapat menyebrang Muara Gembong hingga pada akhirnya sampai ke Pantai Tanjung Pakis.",
        "Lokasi dari Vihara ini berada sekitar 4 kilometer dari pusat kota, tepatnya di jl. Rangga Gede no. 1 Tanjung Pura. Vihara ini berdiri sejak tahun 1770 silam dan dibuka untuk umum. Walaupun Vihara Sian Djin Ku Poh masih digunakan sebagai tempat beribadah, namun tempat ini selalu ramai di setiap harinya oleh wisatawan lokal maupun mancanegara. Tidak hanya itu, namun setiap menjelang hari-hari besar, di Vihara ini selalu mengadakan berbagai acara yang tentunya sangat menarik.",
        "Wonderland Adventure Waterpark atau WAW Karawang ini adalah sebuah wisata petualangan air terbesar yang ada di kabupaten Karawang. Dengan luas wilayah sebesar 3,4 hektar, tempat ini dipenuhi oleh berbagai wahana permainan menarik dan juga menantang sehingga tidak pernah sepi oleh pengunjung. Tempat ini sangat cocok untuk Anda yang menyukai wisata dan permainan air. Selain permainan air, tempat ini menyediakan berbagai fasilitas lain seperti fitness center, lapangan futsal, flying fox. Serta berbagai wahana outbond."
    )

    private val touristSitesTicket = arrayOf(
        "Gratis",
        "Rp 3000",
        "Rp 20.000",
        "Rp 5000",
        "Rp 50.000",
        "Rp 10.000",
        "Rp 20.000",
        "Gratis",
        "Rp 2000",
        "Rp 3000",
        "Rp 10.000",
        "Rp 10.000",
        "Gratis",
        "Rp 25.000"
    )

    private val touristSitesAddress = arrayOf(
        "Jl. Kampung Kutapuhaci, Kel. Walahar, Kec. Ciampel, Kab. Karawang, Jawa Barat.",
        "Jl. Desa Segaran, Kec. Batujaya, Kab.Karawang, Jawa Barat.",
        "Jl. Mekarbuana, Tegalwaru, Kab. Karawang, Jawa Barat.",
        "Jl. Demang, Mulyasari, Ciampel, Kab. Karawang, Jawa Barat.",
        "Jl. Medalsari, Kec. Pangkalan, Kab. Karawang, Jawa Barat.",
        "Jl. Desa Mekarbuana, Kec. Tegalwaru, Kab. Karawang, Jawa Barat.",
        "Kutamekar, Kec. Ciampel, Kabupaten Karawang, Jawa Barat 41363",
        "Jl. Wadas, Kec. Telukjambe Timur, Kab. Karawang, Jawa Barat.",
        "Jl. Mekarjaya, Rawamerta, Kab. Karawang, Jawa Barat.",
        "Jl. Raya R.Dengklok, R.Dengklok Selatan, Rengasdengklok, Kab. Karawang, Jawa Barat.",
        "Jl. Sungaibuntu, Pedes, Kab. Karawang, Jawa Barat.",
        "Jl. Tanjungpakis, Pakisjaya, Kab. Karawang, Jawa Barat.",
        "Jl. Muhamad Toha, Tanjungmekar, Kec. Karawang Barat, Kab. Karawang, Jawa Barat.",
        "Jl. Galuh Mas Raya No. 1, Sukaharja, Kec. Telukjambe Timur, Kab. Karawang, Jawa Barat."
    )

    private val touristSitesImages = intArrayOf(
        R.drawable.walahar,
        R.drawable.candi_jiwa,
        R.drawable.curug_cigentis,
        R.drawable.danau_cipule,
        R.drawable.green_canyon,
        R.drawable.gunung_sanggabuana,
        R.drawable.hutan_kertas,
        R.drawable.kampung_budaya,
        R.drawable.rawagede,
        R.drawable.monumen_tekad,
        R.drawable.samudera_baru,
        R.drawable.tanjung_pakis,
        R.drawable.vihara,
        R.drawable.wonderland
    )

    private val touristSitesUrlLocation = arrayOf(
        "https://maps.app.goo.gl/Z9BTbKcfzDTzqxqX6",
        "https://maps.app.goo.gl/oe7b3ZNcJL89bakZ8",
        "https://maps.app.goo.gl/2zG7m8aePSKFhYF16",
        "https://maps.app.goo.gl/Dc7tJF4cmn6CfHuJ8",
        "https://maps.app.goo.gl/W12MeNAphYH5LVQx6",
        "https://maps.app.goo.gl/B62XGZodvqfMu8Lo7",
        "https://maps.app.goo.gl/yHyvoExpmtoaJxqGA",
        "https://maps.app.goo.gl/meGDmP9P7s8xGy6r6",
        "https://maps.app.goo.gl/b6Jk2mHhSRW5LaHh9",
        "https://maps.app.goo.gl/vorcxmpfBtxLTUd48",
        "https://maps.app.goo.gl/wrGLPrNKzyHJtLgL7",
        "https://maps.app.goo.gl/69UR2gGBZsNQTN5L8",
        "https://maps.app.goo.gl/qT8NsLzpbP2deify5",
        "https://maps.app.goo.gl/uAbtbca4Meg1AwMt6"
    )

    val listData: ArrayList<TouristSite>
        get() {
            val list = arrayListOf<TouristSite>()
            for (position in touristSitesNames.indices) {
                val touristSite = TouristSite()
                touristSite.name = touristSitesNames[position]
                touristSite.detail = touristSitesDetails[position]
                touristSite.ticket = touristSitesTicket[position]
                touristSite.address = touristSitesAddress[position]
                touristSite.photo = touristSitesImages[position]
                touristSite.location = touristSitesUrlLocation[position]
                list.add(touristSite)
            }
            return list
        }
}