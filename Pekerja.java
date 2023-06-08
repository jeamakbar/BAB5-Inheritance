package Prak5;
import java.time.LocalDate;

public class Pekerja extends Manusia {
private double gaji;
private LocalDate tahunMasuk;
private int jumlahAnak;

public Pekerja(double gaji , int tahun, int bulan, int tgl ,int jumlahAnak ,String
nama, String nik, boolean jenisKelamin, boolean menikah){
super(nama, nik, jenisKelamin, menikah);
this.gaji = gaji;
this.jumlahAnak = jumlahAnak;
tahunMasuk = LocalDate.of(tahun, bulan, tgl);
}
public double getBonus(){
int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
double bonus = 0;

if (lamaKerja >= 0 && lamaKerja <= 5) { bonus = 0.05 * gaji; } 
else if (lamaKerja > 5 && lamaKerja <= 10) { bonus = 0.1 * gaji; } 
else if (lamaKerja > 10) { bonus = 0.15 * gaji; }
return bonus;
}
public double getTunjangan() {
return jumlahAnak * 20;
}
public double getGaji(){
return gaji;
}
public double getPendapatan(){
return super.getPendapatan() + getGaji() + getBonus() + getTunjangan();
}

@Override
public String toString(){
String status = super.toString() + "\ntahun masuk: " + tahunMasuk + "\njumlahanak: " + jumlahAnak + "\ngaji: " + getGaji();
return status;
}
}