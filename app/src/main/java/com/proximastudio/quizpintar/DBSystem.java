package com.proximastudio.quizpintar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBSystem extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dbsoal2.db";
    private static final int DATABASE_VERSION = 1;
    public DBSystem(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub



        String sql = "create table soal(id integer primary key,nomor integer null,soal text null, a text null,b text null,c text null,d text null,e text null,kunci varchar(1) null,kategori varchar(20) null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO soal (id,nomor,soal,a,b,c,d,e,kunci,kategori) VALUES " +
                "(1,1,'Siapakah nama preisden ke-7 Indonesia ?', 'Jokowi', 'SBY','Soeharto','Habibie','Megawati','a','umum')," +
                "(2,2,'Dimana Ibukota negara Tiongkok? ?', 'Shanghai','Beijing', 'Seoul','Wuhan','Toyo','b','umum')," +
                "(3,3,'Lumpia merupakan makanan khas kota ?', 'Makassar', 'Solo','Semarang','Jakarta','Bandung','c','umum')," +
                "(4,4,'Hewan terbesar di yang pernaah hidup di bumi adalah ?', 'Brachiosaurus', 'Paus biru','Hiu paus','T-Rex','Mamooth','b','umum')," +
                "(5,5,'Ilmu yang mempelajari tentang manusia disebut ?', 'Psikologi', 'Homologi','Sosiologi','Geologi','Anthropologi','e','umum')," +
                "(6,6,'Benua terbesar di dunia adalah ?', 'Afrika', 'Australia','Amerika','Asia','Antartika','d','umum')," +
                "(7,7,'Pada tahun berapa kapal titanic tenggelam ?', '1902', '1912','1905','1915','1820','b','umum')," +
                "(8,8,'Oracle merupakan perusahan yang bergerak pada bidang ?', 'Otomotif', 'Fashion','Teknologi','Militer','Industri','c','umum')," +
                "(9,9,'Warna kulit beruang kutub adalah ?', 'Cokelat', 'Putih','Hitam','Transparan','Pelangi','d','umum')," +
                "(10,10,'Candi Borobudur terletak di kota ?', 'Yogyakarta', 'Surakarta','Semarang','Bantul','Magelang','e','umum')," +
                "(11,11,'Penemu sistem opeasi android adalah ?', 'Andy Rubin', 'Lary Page','Mark Zuckerberg','Linus Torvalds','Bill Gates','a','umum')," +
                "(12,12,'Burj Khalifah merupakan bangunan tertinggi yang memiliki ketinggian ?', '621 meter', '828 meter','932 meter','1012 meter','901 meter','b','umum')," +
                "(13,13,' Primata tercerdas setelah manusia adalah', 'Simpanse', 'Orangutan','Kera','Monyet','Gorila','a','umum')," +
                "(14,14,'Provinsi terluas di Indonesia adalah ?', 'Kalimantan Barat', 'Kalomantan Timur','Sumatera Barat','Papua','Papua Barat','d','umum')," +
                "(15,15,'Gunung tertinggi di dunia adalah ?', 'Trivor', 'Makalu','Krakatau','Fuji','Everest','e','umum')," +
                "(16,16,'Selain di pulau komodo, hewan komodo juga dapat dijumpaai di ?', 'Pulau Rinca', 'Sumba','Pulau Seribu','Flores ','Maluku','a','umum')," +
                "(17,17,'Berikut yang bukan merupakan tahun kabisat adalah ?', '2000', '2002','2004','2016','2028','b','umum')," +
                "(18,18,'Papan catur memiliki kotak-kotak tempat bidak sebanyak ?', '16', '36','64','82','94','c','umum')," +
                "(19,19,'Anjing pitbull berasal dari negara?', 'Swedia', 'Jerman','Denmark','Inggris','Amerika','d','umum')," +
                "(20,20,'Jenis batuan terkeras adalah ?', 'Platinum', 'Emas','Berlian','Tembaga','Uranium','c','umum')," +
                "(21,1,'Kelelawar dapat bergerak di tempat gelap karena memiliki ?', 'Sayap', 'Sonar','Insting','Naluri','Mata','b','sains')," +
                "(22,2,'Benda terjatuh terjadi karena adanya gaya?', 'Gesek', 'Pegas','Gravitasi','Dorong','Tarik','c','sains')," +
                "(23,3,'Getaran yang merambat disebut dengan ?', 'Amplitudo', 'Frekuensi','Periode','Gelombang','Bunyi','d','sains')," +
                "(24,4,'Miopi merupakan nama lain dari ?', 'Rabun jauh', 'Rabun dekat','Rabun Senja','Kebutaan','Katarak','a','sains')," +
                "(25,5,'Percepatan benda berbanding lurus dengan gaya dan berbanding terbalik dengan massa , adalah bunyi hukum newton ke- ?', '1', '2','3','4','5','b','sains')," +
                "(26,6,'Nama unsur pertama dalam tabel periodik adalah ?', 'Li', 'Ca','H','He','Na','c','sains')," +
                "(27,7,'Pasang surut air laut disebabkan oleh adanya ?', 'Rotasi bumi', 'Gravitasi bulan','Revolusi bumi','Revolusi bulan','Rotasi bulan','b','sains')," +
                "(28,8,'Ilmu yang mempelajari tentang pengelompokkan makhluk hidup disebut ?', 'Biologi', 'Ekologi','Taksologi','Psikologi','Astronomi','c','sains')," +
                "(29,9,'Perubahan zat gas menjadi zat cair disebut ?', 'Mengembun', 'Menyublim','Menguap','Mencair','Mengkristal','a','sains')," +
                "(30,10,'Organ yang berfungsi menjaga keseimbangan tubuh adalah ?', 'Jantung', 'Telinga','Hati','Mata','Sumsum tulang belangan','b','sains')," +
                "(31,11,'Kacamata berlensa cekung digunakan untuk membantu penglihatan penderita ?','Rabun jauh', 'Rabun dekat','Hipermetropi','Presbiopi','Rabun senja','a','sains')," +
                "(32,12,'Titik terjauh pada getaran disebut ?', 'Frekuensi', 'Periode','Gelombang','Panjang gelombang','Amplitudo','e','sains')," +
                "(33,13,'Tempat terjadinya pertukaran oksigen dan karbondioksida adalah ?', 'Diafragma', 'Pleura','Alveolus','Trakrea','Ginjal','c','sains')," +
                "(34,14,'Hewan yang aktif pada malam hari disebut ?', 'Mamalia', 'Krepuskular','Diurnal','Abnormsl','Nokturnal','e','sains')," +
                "(35,15,'Bintang fajar merupakan julukan untuk planet ?', 'Merkurius', 'Venus','Mars','Uranus','Neptunus','b','sains')," +
                "(36,16,'Yang bukan merupakan jenis jamur adalah ?', 'Basidiomycota', 'Ascomycota','Zygomycota','Fungimycota','Deuteromycota','d','sains')," +
                "(37,17,'Unsur terbesar yang menyusun makhluk hidup adalah ?', 'Hidrogen', 'Oksigen','Nitrogen','Besi','Karbon','e','sains')," +
                "(38,18,'Karat pada besi terjadi karena adanya ?', 'Pelapukan', 'Nitrifikasi','Reduksi','Oksidasi','Respirasi','d','sains')," +
                "(39,19,'Yang merupakan besaran vektor adalah ?', 'Massa', 'Percepatan','Tekanan','Kuat arus','Volume','b','sains')," +
                "(40,20,'Yang bukan termasuk besaran pokok adalah ?', 'Intensitas cahaya', 'Jumlah zat','Panjang','Gaya','Massa','d','sains')," +
                "(41,1,'Perangkat dalam komputer yang berfungsi untuk menyimpan data sementara adalah ?', 'ROM', 'RAM','Floppy','CD','Hard Drive','b','tekno')," +
                "(42,2,'Teknologi Rontgen pada rumah sakit menggunakan bantuan ?', 'Sinar Gama','Sinar Alpha', 'Sinar X','Sinar Beta','Sinar UV','c','tekno')," +
                "(43,3,'Proses pencampuran bahan bakar dengan udara sebelum pembakaran pada mesin disebut ? ?', 'Injeksi', 'Tuning','Akselerasi','Deselerasi','Turbulensi','a','tekno')," +
                "(44,4,'Komponen pada mobil yang berfungsi untuk membangkitkan listrik pada mobil adalah ?', 'Aki', 'Radiator','Suspensi','PCM','Alternator','e','tekno')," +
                "(45,5,'Yang bukan merupakan perangkat penyimpanan dalam komputer adalah ?', 'VGA', 'RAM','ROM','Disket','SSD','a','tekno')," +
                "(46,6,'Berikut yang bukan merupakan komponen utama dalam sistem jaringan adalah ?', 'Router', 'Switch','Repeater','Mouse','UTP','d','tekno')," +
                "(47,7,'Satuan yang digunakan untuk mengukur kecepatan rotasi mesin adalah ?','MPH', 'RPM','Horse Power','KBps','Hz','b','tekno'),"+
                "(48,8,'Perangkat yang berfungsi sebagai otak dari sebuah komputer adalah ?', 'Memory', 'Proccesor','Mouse','Keyboard','Power Supply','b','tekno')," +
                "(49,9,'Komponen dalam mobil yang berfungsi mendinginkan mesin adalah ?', 'Radiator', 'Cooler','Alternator','Suspensi','Motor','a','tekno')," +
                "(50,10,'Bahan bakar yang biasa digunakan pada mesin diesel adalah ?', 'Bensin', 'Minyak Tanah','Solar','Aftur','Gas','c','tekno')," +
                "(51,11,'Yang merupakan perangkat masukkan pada komputer adalah ?', 'Keyboard', 'Speaker','Monitor','VGA','Harddisk','a','tekno')," +
                "(52,12,'Teknologi yang digunakan untuk menentukan lokasi dengan bantuan satelit adalah ?', '4G', '5G','GPS','Internet','kompas','c','tekno')," +
                "(53,13,'Yang bukan merupakan perusahaan di bidang otomotif adalah ?', 'Ford', 'Proton','Ferrari','Tesla','Cisco','e','tekno')," +
                "(54,14,'Yang merupakan perangkat penyimpanan pada komputer adalah ?', 'Keyboard', 'Speaker','Monitor','VGA','Harddisk','e','tekno')," +
                "(55,15,'Perangkat yang berfungsi mengubah sinyal analog menjadi digital dan sebaliknya adalah ?', 'VGA', 'Modem','Proccesor','ROM','RAM','b','tekno')," +
                "(56,16,'Perusahaan otomotif yang terkenal dengan teknologi mobil listriknya adalah  ?', 'Hyundai', 'Ferrari','Honda','Tesla','Mitsubishi','d','tekno')," +
                "(57,17,'IOT nerupakan kependekan dari ?', 'Integrated of Things', 'Integrated Online Things','Internet of Things','Internet Over Things','Integrated Over Things','c','tekno')," +
                "(58,18,'Pada komputer, monitor termasuk dalam perangkat ?', 'Keluaran', 'Masukan','Penyimpanan','Pemrosesan','Jaringan','a','tekno')," +
                "(59,19,'Bahasa mesin dikenal juga dengan istilah bahasa ?', 'Pascal', 'ASCII','Biner','C','Java','c','tekno')," +
                "(60,20,'Pada komputer, harddisk termasuk dalam perangkat ?', 'Keluaran', 'Masukan','Penyimpanan','Pemrosesan','Jaringan','c','tekno')," +
                "(61,1,'Film Jurassic Park disutradai oleh ?','James Wann','Todd Phillips','Steven Spielberg','James Cameron','Christoper Nolan','c','hiburan')," +
                "(62,2,'Kreator serial Naruto adalah ?', 'Akira Toriyama','Masashi Kishimoto', 'Eichiro Oda','Tite Kubo','Naoshi Arakawa','b','hiburan')," +
                "(63,3,'Justin Bieber adalah seorang penyanyi berkebangsaan ?', 'Kanada', 'Inggris','Amerika','Australia','Skotlandia','a','hiburan')," +
                "(64,4,'Queen adalah band legendaris asal inggris yang dibentuk pada tahun ?', '1972', '1970','1975','1973','1971','b','hiburan')," +
                "(65,5,'Berikut yang merupakan karya dari Akira Toriyama adalah ?', 'Bleach', 'Death Note','Dragon Ball','Naruto','One Piece','c','hiburan')," +
                "(66,6,'Aktor yang berperan sebagai Thor dalam film The Avenger adalah ?', 'Chriss Evans', 'Chriss Pratt','Chriss Hemsworth','Robert Downey','Tom Holland','c','hiburan')," +
                "(67,7,'Komik yang berasal dari Korea disebut ?', 'Manga', 'Manhwa','Manhua','Cartoon','Visual Novel','b','hiburan')," +
                "(68,8,'Ubisoft merupakan perusahaan video game yang membuat game ?', 'Resident Evil', 'Grand Theft Auto','FIFA','Pro Evolution Soccer','Far Cry','e','hiburan')," +
                "(69,9,'Berikut yang merupakan film karya sutradara Christoper Nolan adalah ?', 'Jurassic Park', 'Intersetellar','Spider-Man','Shawsank Redemption','Jaws','b','hiburan')," +
                "(70,10,'One Piece merupakan serial komik tekenal yang dibuat oleh ?', 'Eichiro Oda', 'Masashi Kishimoto','Akira Toriyama','Tite Kubo','Hideaki Sorachi','a','hiburan')," +
                "(71,11,'Pemeran Peter Parker dalam film Spider-Man karya Sam Raimi adalah ?', 'Andrew Garfield', 'Tom Holland','Tom Hardy','Chriss Evans','Tobey Maguire','e','hiburan')," +
                "(72,12,'Hogwarts School adalah salah satu tempat ikonik  yang terdapat dalam film ?', 'Game of Thrones', 'Harry Potter','Titanic','Jurassic Park','The Avenger','b','hiburan')," +
                "(73,13,'Robert Downey Jr dalam film Avenger berperan sebagai ?', 'Steve Roger', 'Tony Stark','Peter Parker','Bucky Barnes','Nick Fury','b','hiburan')," +
                "(74,14,'Berikut film yang bercerita tentang detektif adalah ?', 'Interstellar', 'The Shawsank Redemption','Harry Potter','Sherlock Holmes','Inception','d','hiburan')," +
                "(75,15,'Pemeran utama dalam serial manga Dragon Ball adalah ?', 'Gohan', 'Trunks','Goku','Vegeta','Bulma','c','hiburan')," +
                "(76,16,'Love me Like You Do merupakan lagu yang dipopulerkan oleh ?', 'Taylor Swift', 'Rihanna','Ellie Goulding','Bruno Mars','Justin Bieber','c','hiburan')," +
                "(77,17,'Studio yang memproduksi video game Grand Theft Auto adalah ?', 'Rockstar', 'EA Games','Ubisoft','Capcom','Nintendo','a','hiburan')," +
                "(78,18,'Berikut yang bukan merupakan perusahaan konsol video game adalah ?', 'Nintendo', 'Sony','Sega','Microsoft','EA Games','e','hiburan')," +
                "(79,19,'Umbrella merupakan lagu yang dipopulerkan oleh ?', 'Taylor Swift', 'Rihanna','Ellie Goulding','Bruno Mars','Justin Bieber','b','hiburan')," +
                "(80,20,'Komik yang berasal dari China disebut ?', 'Manga', 'Manhwa','Manhua','Cartoon','Visual Novel','c','hiburan')," +
                "(81,21,'Negara terkaya di dunia adalah ?', 'Amerika Serikat', 'Saudi Arabia','Qatar','China','Jerman','c','umum')," +
                "(82,22,'Mohammed salah adalah pesepakbola asal ?', 'Turki','Mesir', 'Iran','Maroko','Arab Qatar','b','umum')," +
                "(83,23,'Negeri Gajah putih merupakan julukan dari negara ?', 'Thailand', 'Vietnam','Malaysia','Sri Lanka','India','a','umum')," +
                "(84,24,'Ilmuwan yang menemukan teori relativitas adalah ?', 'Stephen Hawking', 'Darwin','Albert Einstein','Nikola Tesla','Thomas Alfa Edison','c','umum')," +
                "(85,25,'Pencipta lukisan monalisa adalah ?', 'Rembrandt', 'Masaccio','Vincent van Gogh','Pablo Picasso','Leonardo da Vinci','e','umum')," +
                "(86,26,'Ilmuwan yang menemukan lampu pijar adalah ?', 'Stephen Hawking', 'Darwin','Albert Einstein','Nikola Tesla','Thomas Alfa Edison','e','umum')," +
                "(87,27,'Coloseum di Italia terletak di kota ?', 'Milan', 'Turin','Roma','Venesia','Pisa','c','umum')," +
                "(88,28,'Sungai terpanjan di dunia adalah ?', 'Amazon', 'Mekong','Nil','Parana','Musi','c','umum')," +
                "(89,29,'Samudera terluas adalah ?', 'Pasifik', 'Atlantik','Hindia','Arktik','Antartika','a','umum')," +
                "(90,30,'Negara terkecil di dunia adalah ?', 'Singapura', 'Brunei Darussalam','Timor Leste','Vatikan','Kepulauan Faroe','d','umum')," +
                "(91,21,'Unsur kimia yang termasuk non logam adalah ?', 'Au', 'Zn','Cu','He','Fe','d','sains')," +
                "(92,22,'Platypus berkembang biak dengan cara ?', 'Membelah diri', 'Ovovivipar','Ovipar','Vivipar','Fragmentasi','b','sains')," +
                "(93,23,'Amoeba berkembang biak dengan cara ?', 'Membelah diri', 'Ovovivipar','Ovipar','Vivipar','Fragmentasi','a','sains')," +
                "(94,24,'Fase lepasnya sel telur dari ovum disebut dengan ?', 'Menstruasi', 'Fertilisasi','Ejakulasi','Ovulasi','Menopause','d','sains')," +
                "(95,25,'Fase peleburan sel telur dengan sperma disebut dengan ?', 'Menstruasi', 'Fertilisasi','Ejakulasi','Ovulasi','Menopause','b','sains')," +
                "(96,26,'Lapisan terluar dari kulit adalah ?', 'Epidermis', 'Endodermis','Hipodermis','Kelenjar Keringat ','Dermis','a','sains')," +
                "(97,27,'Bagian mata yang berfungsi untuk memfokuskan cahaya adalah ?', 'Retina', 'Lensa','Kornea','Iris','Pupil','b','sains')," +
                "(98,28,'Sendi pada leher termasuk sendi ?', 'Putar', 'Geser','Engsel','Pelana','Peluru','a','sains')," +
                "(99,29,'Yang termasuk tumbuhan monokotil adalah ?', 'Mangga', 'Jambu biji','Jagung','Singkong','Karet','c','sains')," +
                "(100,30,'Partikel yang membentuk cahaya disebut ?', 'Photon', 'Plasma','Proton','Radiasi','LED','a','sains')," +
                "(101,21,'Teknologi yang biasa digunakan pada uang elektronik adalah ?', 'NFC', 'Wifi','Bluetooth','GPS','Infrared','a','tekno')," +
                "(102,22,'Teknologi wireless yang biasa digunakan pada remote klasik adalah ?', 'NFC', 'Wifi','Bluetooth','GPS','Infrared','e','tekno')," +
                "(103,23,'Yang bukan merupakan teknologi wireless adalah ?', 'LAN', 'Wifi','NFC','Bluetooth','Infrared','a','tekno')," +
                "(104,24,'Teknologi yang menggabungkan dunia nyata dengan objek maya (virtual) adalah ?', 'Virtual Reality', 'Augmented Reality','3D','Hologram','AI','b','tekno')," +
                "(105,25,'Nama lain dari kecerdesan buatan adalah ?', 'AR', 'VR','AI','NFC','Hologram','c','tekno')," +
                "(106,26,'Bagian dari mobil yang berfungsi menerima tekanan dari pembakaran adalah ?', 'Radiator', 'Alternator','Akselerator','Piston','Motor','d','tekno')," +
                "(107,27,'Bagian pada handphone yang berfungsi untuk menangkap suara adalah ?', 'Mikrofon', 'Speaker','Headphone','Earphone','Bluetooth','a','tekno')," +
                "(108,28,'Pada saat terjadi komunikasi, data ditransmisikan dalam satuan ?', 'bit', 'BYTE','hz','KBps','ms','a','tekno')," +
                "(109,29,'Komponen pada listrik yang berfungsi memberi hambatan pada listrik adalah ?', 'Trafo', 'Resistor','Dioda','Kapasitor','Baterai','b','tekno')," +
                "(110,30,'Komponen pada listrik yang berfungsi merubah tegangan listrik adalah ?', 'Trafo', 'Resistor','Dioda','Kapasitor','Baterai','a','tekno')," +
                "(111,21,'Pemeran Jack dalam film Titanic adalah ?', 'Leonardo di Caprio', 'Tom Cruise','Bradd Pitt','Gary Oldman','Antonio Banderas','a','hiburan')," +
                "(112,22,'Thanos merupakan tokoh antagonis pada film ?', 'Spider Man', 'Avenger','Batman','Superman','Titanic','b','hiburan')," +
                "(113,23,'Joker merupakan tokoh antagonis pada film ?', 'Spider Man', 'Avenger','Batman','Superman','Titanic','c','hiburan')," +
                "(114,24,'Gotham merupakan kota fiktif yang terdapat pada film ?', 'Spider Man', 'Avenger','Batman','Superman','Titanic','c','hiburan')," +
                "(115,25,'Video game bertemakan Zombie buatan CAPCOM adalah ?', 'The Last of Us', 'Days Gone','The Walking Dead','DreadOut','Resident Evil','e','hiburan')," +
                "(116,26,'Video game bertemakan horror buatan studio asal Indonesia, Digital Happiness adalah ?', 'The Last of Us', 'Days Gone','The Walking Dead','DreadOut','Resident Evil','d','hiburan')," +
                "(117,27,'The Beatless merupakan band legendaris asal ?', 'Amerika Serikat', 'Inggris','Kanada','Australia','Irlandia','b','hiburan')," +
                "(118,28,'Westlife merupakan boyband legendaris yang berasal dari ?', 'Amerika Serikat', 'Inggris','Kanada','Australia','Irlandia','e','hiburan')," +
                "(119,29,'Film Parasite yang berhasil memenangi piala oscar berasal dari negara ?', 'Amerika Serikat', 'Inggris','Jepang','Korea Selatan','Kanada','d','hiburan')," +
                "(120,30,'Berikut yang bukan merupakan film dari marvel studio adalah ?', 'Spider Man', 'Iron Man','Superman','Captain America','Thor','c','hiburan');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }

}
