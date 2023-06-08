package Prak5;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    
    public Manusia(String nama,String nik, boolean jenisKelamin, boolean
    menikah) {
        this.nama = nama;
this.jenisKelamin = jenisKelamin;
this.nik = nik;
this.menikah = menikah;
}
public String getNama() {
return nama;
}
public void setNama(String nama) {
this.nama = nama;
}
public String getJenisKelamin() {
String jk = "";
if (jenisKelamin == true) {
jk = "Laki-laki";
}
else {
jk = "Perempuan";
}
return jk;
}
public String getNIK(){
return nik;
}
public String getMarried() {
String marry = "";
if (menikah == true) {
marry = "Menikah";
} else {
marry = "Belum Menikah";
}
return marry;
}

public double getTunjangan(){
if(menikah==true){
if(jenisKelamin==true) return 25;
else return 20 ;
}
else return 15;
}

public double getPendapatan(){
return getTunjangan();
}

public String toString(){
return "Nama : " + nama + "\nNIK : " + nik + "\nJenis Kelamin : " +
getJenisKelamin() + "\nJumlah Pendapatan : " + getPendapatan();
}
}