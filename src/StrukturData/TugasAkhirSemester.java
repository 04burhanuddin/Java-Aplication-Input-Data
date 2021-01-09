package StrukturData;

import java.util.Scanner;

class DataPerusahaan {

    String nama_Perusahaan, alamat, jenis_usaha;
    int jumlah_karyawan;
}

public class TugasAkhirSemester {

    /**
     *
     */
    public static Scanner masukan = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static int N = 100;

    //-----------------------------------------------------------------
    //--------        PROGRAM ENTRI DATA KEDALAM LARIK         --------
    //-----------------------------------------------------------------
    public static void ngentriData(DataPerusahaan ProfilPerusahaan[]) {
        for (int i = 0; i <= N - 1; i++) {
            System.out.println("");
            //bagian entri data kedalam struktur larik
            System.out.print("Silakan masukkan nama Perusahaan perusahaan : ");
            ProfilPerusahaan[i].nama_Perusahaan = masukan.next();
            System.out.print("Silakan masukkan alamat perusahaan : ");
            ProfilPerusahaan[i].alamat = masukan.next();
            System.out.print("Silakan masukkan jenis usaha : ");
            ProfilPerusahaan[i].jenis_usaha = masukan.next();
            System.out.print("Silakan masukkan jumlah karyawan : ");
            ProfilPerusahaan[i].jumlah_karyawan = masukan.nextInt();
            System.out.println("Successfull memasukkan data.....");
            System.out.println("");
        }
    }

    //-----------------------------------------------------------------
    //--------         PROGRAM UTAMA MENAMPILKAN DATA          --------
    //-----------------------------------------------------------------
    public static void menampilkanData(DataPerusahaan ProfilPerusahaan[]) {
        System.out.print("");
        //bagian menampilkan isi larik
        System.out.println("\t\tDATA DITAMPILKAN");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|NAMA_PERUSAHAAN|\t|ALAMAT|\t|JENIS_USAHA|\t|JUMLAH_KARYAWAN|");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(i + ". ");
            System.out.print(ProfilPerusahaan[i].nama_Perusahaan + "\t\t ");
            System.out.print(ProfilPerusahaan[i].alamat + "\t ");
            System.out.print(ProfilPerusahaan[i].jenis_usaha + "\t ");
            System.out.println(ProfilPerusahaan[i].jumlah_karyawan);
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    //-----------------------------------------------------------------
    //--------         FUNGSI MENAMBAH DATA DI DEPAN           --------
    //-----------------------------------------------------------------
    public static void menambahDataDidepan(DataPerusahaan biodataMahasiswa[]) {
        //bagian membuat record sementara untuk menampung data baru
        DataPerusahaan ProfilPerusahaanBaru = new DataPerusahaan();
        System.out.println("");
        //bagian entri data baru
        System.out.print("Silakan masukkan nama perusahaan : ");
        ProfilPerusahaanBaru.nama_Perusahaan = masukan.next();
        System.out.print("Silakan masukkan alamat perusahaan : ");
        ProfilPerusahaanBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan jenis usaha : ");
        ProfilPerusahaanBaru.jenis_usaha = masukan.next();
        System.out.print("Silakan masukkan jumlah karyawan : ");
        ProfilPerusahaanBaru.jumlah_karyawan = masukan.nextInt();
        //bagian menggeser isi larik mulai dari belakang s/d selangkah ke bawah
        for (int i = N - 1; i >= 0; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        //bagian memindahkan data baru ke larik ke-0
        biodataMahasiswa[0] = ProfilPerusahaanBaru;
        //memperbaharui banyaknya data (N), banyaknya data bertambah satu
        N++;
    }

    //-----------------------------------------------------------------
    //--------         FUNGSI MENAMBAH DATA DI TENGAH          --------
    //-----------------------------------------------------------------
    public static void menambahDataDitengah(DataPerusahaan ProfilPerusahaan[]) {
        //bagian membuat record sementara untuk menampung data baru
        DataPerusahaan ProfilPerusahaanBaru = new DataPerusahaan();
        System.out.println("");
        //bagian mengentri data baru
        System.out.print("Silakan masukkan nama perusahaan : ");
        ProfilPerusahaanBaru.nama_Perusahaan = masukan.next();
        System.out.print("Silakan masukkan alamat perusahaan : ");
        ProfilPerusahaanBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan jenis usaha : ");
        ProfilPerusahaanBaru.jenis_usaha = masukan.next();
        System.out.print("Silakan masukkan jumlah karyawan : ");
        ProfilPerusahaanBaru.jumlah_karyawan = masukan.nextInt();
        //bagian menantukan posisi target t
        int T;
        System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
        T = masukan.nextInt();
        //bagian menggesser isi larik mulai dari belakang s/d T selangkah kebelakang
        for (int i = N - 1; i >= T; i--) {
            ProfilPerusahaan[i + 1] = ProfilPerusahaan[i];
        }
        ProfilPerusahaan[T] = ProfilPerusahaanBaru;
        //memperbaharui banyaknya data (N), banyaknya data bertambah satu
        N++;
    }

    //-----------------------------------------------------------------
    //--------        FUNGSI MENAMBAH DATA DI BELAKANG         --------
    //-----------------------------------------------------------------
    public static void menambahDataDibelakng(DataPerusahaan ProfilPerusahaan[]) {
        //bagian membuat record sementara untuk menampung data baru
        DataPerusahaan ProfilPerusahaanBaru = new DataPerusahaan();
        System.out.println("");
        //bagian entri data baru
        System.out.print("Silakan masukkan nama perusahaan : ");
        ProfilPerusahaanBaru.nama_Perusahaan = masukan.next();
        System.out.print("Silakan masukkan alamat perusahaan : ");
        ProfilPerusahaanBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan jenis usaha : ");
        ProfilPerusahaanBaru.jenis_usaha = masukan.next();
        System.out.print("Silakan masukkan jumlah karyawan : ");
        ProfilPerusahaanBaru.jumlah_karyawan = masukan.nextInt();
        //bagian memindahkan data baru ke larik ke -N
        ProfilPerusahaan[N] = ProfilPerusahaanBaru;
        //memperbaharui banyaknya data (N), banyaknya data bertambah satu
        N++;
    }

    //-----------------------------------------------------------------
    //--------          FUNGSI HAPUS DATA DIDEPAN              --------
    //-----------------------------------------------------------------
    public static void hapusDataDiDepan(DataPerusahaan ProfilPerusahaan[]) {
        //bagian menggeser isi mulai dari 0 - belakang selangkah kedepan
        for (int i = 0; i <= N - 2; i++) {
            ProfilPerusahaan[i] = ProfilPerusahaan[i + 1];
        }
        System.out.println("Proses menghapus data ke-0 selesai.");
        //memperbaharui banyaknya data (N), banyaknya data bertambah satu
        N--;
    }

    //-----------------------------------------------------------------
    //--------          FUNGSI HAPUS DATA DITENGAH              --------
    //-----------------------------------------------------------------
    public static void hapusDataDiTengah(DataPerusahaan ProfilPerusahaan[]) {
        //bagian menentukan posisi target T
        int T;
        System.out.print("Tuliskan posisi data yang akan dibapus : ");
        T = masukan.nextInt();
        //bagian menggeser isi larik mulai dari T - Belakang selangkah ke depan
        for (int i = T; i <= N - 2; i++) {
            ProfilPerusahaan[i] = ProfilPerusahaan[i + 1];
        }
        System.out.println("Proses menghapus data ke-" + T + " selesai.");
        //memperbaharui banyaknya data (N), banyaknya data bertambah satu
        N--;
    }

    //-----------------------------------------------------------------
    //--------          FUNGSI HAPUS DATA DIBELAKANG              --------
    //-----------------------------------------------------------------
    public static void hapusDataDiBelakang(DataPerusahaan ProfilPerusahaan[]) {
        System.out.println("Successfull hapus data belakang.....");
        //memperbaharui banyaknya data (N), banyaknya data berkurang satu
        N--;
    }

    //-----------------------------------------------------------------
    //----    FUNGSI MENCARI DATA SECALAR LINEAR LOOP : WHILE    -----
    //-----------------------------------------------------------------
    public static void mencariDataSecaraLinearWhile(DataPerusahaan ProfilPerusahaan[]) {
        //bagian memasukkan kata kunci pencarian
        System.out.print("Masukkan data yang dicari : ");
        String kunci = sc.next();
        boolean statusKetemu = false;
        int lokasiKetemu = -1;
        //bagian mencari data satu persatu urut dari larik terdepan
        int i = 0;
        while ((i <= N - 1) && (statusKetemu == false)) {
            if (kunci.equals(ProfilPerusahaan[i].nama_Perusahaan)) {
                statusKetemu = true;
                lokasiKetemu = i;
            }
            i++;
        }
        System.out.println("Status Ketemu : " + statusKetemu + " di posisi ke : " + lokasiKetemu);
        menampilkanData(ProfilPerusahaan);
    }

    //-----------------------------------------------------------------
    //----    FUNGSI MENCARI DATA SECALAR LINEAR LOOP : FOR    -----
    //-----------------------------------------------------------------
    public static void mencariDataSecaraLinearFor(DataPerusahaan ProfilPerusahaan[]) {
        String kataKunci;
        int lok = -1;
        boolean statusKetemu = false;
        //bagian memasukkan kata kunci pencarian data
        System.out.print("Masukkan data yang dicari : ");
        kataKunci = sc.next();
        //bagian mencari data satu persatu urut dari larik terdepan
        for (int i = 0; i < N - 1; i++) {
            //mencocokkan DataPerusahaan[i].nama_perusahaan == kata kunci
            if (ProfilPerusahaan[i].nama_Perusahaan.equals(kataKunci)) {
                statusKetemu = true;
                lok = i;
                break;
            }
        }
        if (statusKetemu == true) {
            System.out.println("Data yang dicari di larik ke : " + lok);
            menampilkanData(ProfilPerusahaan);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }

    //-----------------------------------------------------------------
    //----          FUNGSI MENCARI DATA SECALARA BINARY           -----
    //-----------------------------------------------------------------
    public static void mencariDataSecaraBiner(DataPerusahaan ProfilPerusahaan[]) {
        String key;
        int lok = -1;
        boolean statusKetemu = false;
        //bagian memasukkan kata kunci
        System.out.println("Masukkan data yang ingin dicari : ");
        key = sc.next();
        //bagian mencari data satupersatu urut dari larik terdepan
        int atas = 0, bawah = N - 1, tengah = (atas + bawah);
        while ((statusKetemu == false) && (bawah - atas != 1)) {
            System.out.println(ProfilPerusahaan[tengah].nama_Perusahaan + "<--->" + key);
            //jika key < DataPerusahaan[tengah].nama_perusahaan)
            if (key.compareTo(ProfilPerusahaan[tengah].nama_Perusahaan) < 0) {
                bawah = tengah;
                tengah = (atas + bawah) / 2;
                //jika key > DataPerusahaan[tengah].nama_perusahaan)
            } else if (key.compareTo(ProfilPerusahaan[tengah].nama_Perusahaan) > 0) {
                atas = tengah;
                tengah = (atas + bawah);
            } else {
                statusKetemu = true;
                lok = tengah;
            }
        }
        if (statusKetemu == true) {
            System.out.println("Data ketemu di larik ke : " + lok);
            menampilkanData(ProfilPerusahaan);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    //-----------------------------------------------------------------
    //----      FUNGSI MENGURUTKAN DATA SECALARA BUBBLESORT       -----
    //-----------------------------------------------------------------
    public static void bubbleSort(DataPerusahaan ProfilPerusahaan[]) {
        DataPerusahaan dataSementara = new DataPerusahaan();
        int indeksTerakhir = N - 1;
        for (int j = 0; j <= indeksTerakhir - 1; j++) {
            for (int i = 0; i <= indeksTerakhir - 1 - j; i++) {
                // perintah dibawah ini identik dengan if (nama_Perusahaan[i]>nama_Perusahaan[i+1])
                if (ProfilPerusahaan[i].nama_Perusahaan.compareTo(ProfilPerusahaan[i + 1].nama_Perusahaan) > 0) {
                    dataSementara = ProfilPerusahaan[i];
                    ProfilPerusahaan[i] = ProfilPerusahaan[i + 1];
                    ProfilPerusahaan[i + 1] = dataSementara;
                }
            }
        }
    }

    //-----------------------------------------------------------------
    //----     FUNGSI MENGURUTKAN DATA SECALARA SELECTION SORT    -----
    //-----------------------------------------------------------------
    public static void selectionSort(DataPerusahaan ProfilPerusahaan[]) {
        DataPerusahaan dataSementara = new DataPerusahaan();
        String teksTerkecil = "";
        int lokasi = 0;

        //bagian mengurutkan dengan teknik selection
        for (int i = 0; i <= N - 2; i++) {
            //data pertama yang dibaca dianggap data terkecil
            teksTerkecil = "zzzzzzz";

            //menentukan bilangan terkecil mulai larik ke i+1 sampai N-1
            for (int S = i + 1; S <= N - 1; S++) {
                if (ProfilPerusahaan[S].nama_Perusahaan.compareTo(teksTerkecil) < 0) {
                    //jika data[S] adlh bilangan terkecil, simpan diteksTerkecil
                    teksTerkecil = ProfilPerusahaan[S].nama_Perusahaan;
                    //mencatat posisi dimana data terkecil ada
                    lokasi = S;
                }
            }
            //membandingkan data[lokasi] yang adalah data terkecil,
            // versus data[i] yang adalah ‘diagonal ke-i'
            if (ProfilPerusahaan[i].nama_Perusahaan.compareTo(ProfilPerusahaan[lokasi].nama_Perusahaan) > 0) {
                //tukar posisi
                {
                    dataSementara = ProfilPerusahaan[i];
                    ProfilPerusahaan[i] = ProfilPerusahaan[lokasi];
                    ProfilPerusahaan[lokasi] = dataSementara;
                }
            }
        }
    }

    //-----------------------------------------------------------------
    //----     FUNGSI MENGURUTKAN DATA SECALARA INSERTION SORT    -----
    //-----------------------------------------------------------------
    public static void insertionSort(DataPerusahaan ProfilPerusahaan[]) {
        DataPerusahaan dataSementara = new DataPerusahaan();
        //untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
        int awal;
        //untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
        int cari;
        awal = 1;
        while (awal <= N - 1) {
            dataSementara = ProfilPerusahaan[awal];
            cari = awal - 1;
            //cari akan bergerak dari kanan (awal-1) ke kiri
            while (cari >= 0) {
                //( ProfilPerusahaan[cari].nama_Perusahaan > dataSementara.nama_Perusahaan )
                if (ProfilPerusahaan[cari].nama_Perusahaan.compareTo(dataSementara.nama_Perusahaan) > 0) {
                    ProfilPerusahaan[cari + 1] = ProfilPerusahaan[cari];
                    ProfilPerusahaan[cari] = dataSementara;
                    cari--; //cari digeser kekiri 1 langkah
                } else {
                    ProfilPerusahaan[cari + 1] = dataSementara;
                    // perintah ini untuk keluar dari loop while
                    cari = -1;
                }
            }
            awal++;
        }
    }

    //-----------------------------------------------------------------
    //----      FUNGSI UNTUK MENGEDIT DATA YANG SUDAH DI ENTRI    -----
    //-----------------------------------------------------------------
    public static void mengeditData(DataPerusahaan ProfilPerusahaan[]) {
        //bagian membuat record sementara untuk menampung data baru
        DataPerusahaan ProfilPerusahaanBaru = new DataPerusahaan();
        int inputan;
        System.out.println("");
        System.out.print("Pada posisi mana data yang akan di edit ? : ");
        inputan = masukan.nextInt();
        //bagian entri data kedalam larik
        System.out.print("Silakan masukkan nama Perusahaan perusahaan : ");
        ProfilPerusahaanBaru.nama_Perusahaan = masukan.next();
        System.out.print("Silakan masukkan alamat perusahaan : ");
        ProfilPerusahaanBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan jenis usaha : ");
        ProfilPerusahaanBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan jumlah karyawan : ");
        ProfilPerusahaanBaru.jumlah_karyawan = masukan.nextInt();
        System.out.println("Successfull memasukkan data.....");
        System.out.println("");
        ProfilPerusahaan[inputan] = ProfilPerusahaanBaru;
    }

    //-----------------------------------------------------------------
    //----      FUNGSI UNTUK MENCARI DATA BERDASARKAN ALAMAT      -----
    //-----------------------------------------------------------------
    public static void pencarianBerdasarkanAlamat(DataPerusahaan ProfilPerusahaan[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;
        //bagian memasukkan kata kunci
        System.out.println("");
        System.out.print("Masukkan alamat yang ingin dicari : ");
        kataKunci = masukan.next();
        //bagian mencari data satu persatu urut dari larik terdepan
        for (int i = 0; i <= N - 1; i++) {
            //mencocokkan biodataMahasiswa[i].nama == kataKunci
            if (ProfilPerusahaan[i].alamat.equals(kataKunci)) {
                statusKetemu = true;
                lokasi = i;
                break;
            }
        }

        if (statusKetemu == true) {
            System.out.println("Alamat yang anda cari KETEMU di larik ke :" + lokasi);
            menampilkanData(ProfilPerusahaan);
            System.out.println("");
        } else {
            System.out.println("Maaf, alamat yang anda cari tidak ditemukan");
            System.out.println("");
        }
    }

    //-----------------------------------------------------------------
    //----    FUNGSI UNTUK MENCARI DATA BERDASARKAN JENIS USAHA   -----
    //-----------------------------------------------------------------
    public static void pencarianBerdasarkanJenis(DataPerusahaan ProfilPerusahaan[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;
        //bagian memasukkan kata kunci
        System.out.println("");
        System.out.print("Masukkan jenis usah yang dicari : ");
        kataKunci = masukan.next();
        //bagian mencari data satu persatu urut dari larik terdepan
        for (int i = 0; i <= N - 1; i++) {
            //mencocokkan biodataMahasiswa[i].nama == kataKunci
            if (ProfilPerusahaan[i].jenis_usaha.equals(kataKunci)) {
                statusKetemu = true;
                lokasi = i;
                break;
            }
        }
        if (statusKetemu == true) {
            System.out.println("Jenis usaha yang anda cari KETEMU pada larik :" + lokasi);
            menampilkanData(ProfilPerusahaan);
            System.out.println("");
        } else {
            System.out.println("maaf, jenis usaha yang anda cari tidak ditemukan");
            System.out.println("");
        }
    }

    //-----------------------------------------------------------------
    //--------             PROGRAM UTAMA BAGIAN MENU           --------
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        //bagian untuk menampilkan isi dari menu
        DataPerusahaan ProfilPerusahaan[] = new DataPerusahaan[N + 1];
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("****SELAMAT DATANG DI PROGRAM GUE****");
            System.out.println("");
            System.out.println("PILIHAN MENU :");
            System.out.println("1. Masukkan data");
            System.out.println("2. Menampilkan data");
            System.out.println("3. Menambahkan data");
            System.out.println("4. Mencari data");
            System.out.println("5. Mengedit data");
            System.out.println("6. Menghapus data");
            System.out.println("7. Mengurutkan data");
            System.out.println("8. Exit");
            System.out.println("-----------------------------------------------");
            System.out.println("");
            System.out.print("Pilihan anda (1-8): ");
            int pilihan = sc.nextInt();

            //menu pilihan 1 pada menu program utama
            if (pilihan == 1) {
                System.out.println("");
                System.out.print("Masukkan jumlah entrian data : ");
                N = sc.nextInt();
                for (int i = 0; i < N + 1; i++) {
                    ProfilPerusahaan[i] = new DataPerusahaan();
                }
                ngentriData(ProfilPerusahaan);
                //menu pilihan 2 pada menu program utama

            } else if (pilihan == 2) {
                menampilkanData(ProfilPerusahaan);
                //menu pilihan pada bagian sub menu program utama
                System.out.println("");
                System.out.println("Ini Sub Menu 2. Menampilkan data");
                System.out.println("-----------------------------------------------");
                System.out.println("Silahkan dipilih : ");
                System.out.print("");
                System.out.println("1. Menampilkan semua data");
                System.out.println("2. Menampilkan data berdasarkan alamat");
                System.out.println("3. Menampilkan data jenis usaha tertentu ");
                System.out.println("4. Kembali ke menu utama");
                System.out.println("-----------------------------------------------");
                System.out.println("");
                System.out.print("Pilihan Anda (1-4) : ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    menampilkanData(ProfilPerusahaan);
                } else if (pilihan == 2) {
                    pencarianBerdasarkanAlamat(ProfilPerusahaan);
                } else if (pilihan == 3) {
                    pencarianBerdasarkanJenis(ProfilPerusahaan);
                } else if (pilihan == 4) {
                    for (int i = 0; i < N + 1; i++) {
                        ProfilPerusahaan[i] = new DataPerusahaan();
                    }
                }

                //menu pilihan 3 pada menu program utama
            } else if (pilihan == 3) {
                System.out.println("Pilih Posisi data akan disimpan : ");
                System.out.println("");
                System.out.println("1. Menambah didepan");
                System.out.println("2. Menambah dibelakang");
                System.out.println("3. Menambah Belakang");
                System.out.println("");
                System.out.print("Pilihan anda (1-3): ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    menambahDataDidepan(ProfilPerusahaan);
                } else if (pilihan == 2) {
                    menambahDataDitengah(ProfilPerusahaan);
                } else if (pilihan == 3) {
                    menambahDataDibelakng(ProfilPerusahaan);
                }
                //menu pilihan 4 pada menu program utama

            } else if (pilihan == 4) {
                System.out.println("Silahkan pilih metode pencarian : ");
                System.out.println("");
                System.out.println("1. Pencarian Linear loop : While");
                System.out.println("2. Pencarian Linear loop : For");
                System.out.println("3. Pencarian Biner");
                System.out.println("");
                System.out.print("Pilihan anda (1-3): ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    mencariDataSecaraLinearWhile(ProfilPerusahaan);
                } else if (pilihan == 2) {
                    mencariDataSecaraLinearFor(ProfilPerusahaan);
                } else if (pilihan == 3) {
                    mencariDataSecaraBiner(ProfilPerusahaan);
                }

                //menu pilihan 5 pada menu program utama
            } else if (pilihan == 5) {
                mengeditData(ProfilPerusahaan);

                //menu pilihan 6 pada menu program utama
            } else if (pilihan == 6) {
                System.out.println("Pilih pada bagian mana data akan dihapus : ");
                System.out.println("");
                System.out.println("1. Menghapus bagian depan");
                System.out.println("2. Mneghapus bagian tengah");
                System.out.println("3. Menghapus bagian belakang");
                System.out.println("");
                System.out.print("Pilihan anda (1-3) : ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    hapusDataDiDepan(ProfilPerusahaan);
                } else if (pilihan == 2) {
                    hapusDataDiTengah(ProfilPerusahaan);
                } else if (pilihan == 3) {
                    hapusDataDiBelakang(ProfilPerusahaan);
                }

                //menu pilihan 7 pada menu program utama
            } else if (pilihan == 7) {
                System.out.println("Silahkan pilih metode pengurutan data : ");
                System.out.println("");
                System.out.println("1. Bubble Sort");
                System.out.println("2. Selectiom Sort");
                System.out.println("3. Insertion Sort");
                System.out.println("");
                System.out.print("Pilihan anda (1-3) : ");
                pilihan = sc.nextInt();
                if (pilihan == 1) {
                    bubbleSort(ProfilPerusahaan);
                } else if (pilihan == 2) {
                    selectionSort(ProfilPerusahaan);
                } else if (pilihan == 3) {
                    insertionSort(ProfilPerusahaan);
                }

                //menu pilihan 8 pada menu program utama
            } else if (pilihan == 8) {
                //keluar dari program
                System.out.println("Successfull keluar dari program GUE.....");
                System.out.println("");
                break;
            }
        } while (true);
    }
}
