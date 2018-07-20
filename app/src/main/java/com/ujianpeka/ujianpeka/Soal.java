package com.ujianpeka.ujianpeka;

/**
 * UjianPeka
 * Code By Aryy404 on 11/07/2018
 * Mail : aryy.newbie@gmail.com
 * CopyRight (c) 2018
 */
public class Soal {

    public String pertanyaan[] = {
            "Apa Yang Kamu Lakukan Saat Pasangan Mu Bilang \"Kok Lapar Yak..\" ?",
            "Apa Yang Akan Kamu Lakukan pas Lagi jalan di Mall dan Doi Nunjuk Barang dan ilang \"Bagus Banget Yaa,,\"",
            "Ketika Doi Marah, Apa yg Bakalan Lu Lakuin ?",
            "Ketika Doi Sibuk Dengan Tugas Kampus, Gimana Sikap Lu Ngehadepinnya ?",
            "Apa Yang Bakalan Lu Lakuin Ketika Doi PMS ?",
            "Sayang... aku gemukan enggak?",
            "Sikap yang benar untuk menaggapi jika pacar kamu kentut",
            "Saat pasanganmu melirik cowok lain saat sedang jalan bareng, apa yang akan kamu lakukan?",
            "Gimana Sikap Lu Saat Cewek Lu Ngechat Ketika Lu Main Game ?",
            "Apa Tindakan Lu Ketika Cewek Lu Minta Di Anterin Pas Lu Lagi Sibuk ?",
    };

    private String pilihanJawaban[][] = {
            {"Pura Pura Bego","Saranin Makan","Ajakin Makan","Suruh Masak"},
            {"Buta Mendadak","Dompet Ketinggalan","Ikutan Bilang Bagus","Beliin"},
            {"Cuekin Aja","Marah Balik","Minta Maaf","Buang Ke Laut"},
            {"Di Diemin Aja","Semangatin","Bodoamat Aja","Di Marahin"},
            {"Mati","Ikutan PMS","Kabur","Merantau"},
            {"Eeee.... ???","Iya, kamu agak gemuk sekarang","Aku nggak tau yang..","Enggak, kamu kurus"},
            {"Pura - pura cuek","Bertahan sekuat tenaga","Ngalihin pembicaraan","Tutup hidung"},
            {"Marah - marah","Diam - diam dendam","Seleding kepalanya","Sindir halus"},
            {"Berhenti Main, Lalu Chatingan","Cuekin Aja","Bales Singkat","Cari Alesan"},
            {"Anterin","Suruh Nunggu","Suruh Pulang Sendir","Minta Temen Wakilin"},
    };

    private String jawabanBenar[] = {
            "Suruh Masak",
            "Ikutan Bilang Bagus",
            "Minta Maaf",
            "Semangatin",
            "Mati",
            "Eeee.... ???",
            "Bertahan sekuat tenaga",
            "Seleding kepalanya",
            "Bales Singkat",
            "Suruh Nunggu",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}