package Prak5;

public class Manager extends Pekerja {
    private String departemen;
    
    public Manager(String departemen, double gaji, int tahun, int bulan, int tgl, int
    jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah)
    {
    super(gaji, tahun, bulan, tgl, jumlahAnak, nama, nik, jenisKelamin,
    menikah);
    this.departemen = departemen;
}
public double getTunjangan(){
return super.getTunjangan()+(super.getGaji()*10/100);
}

public double getPendapatan(){
return super.getPendapatan()+getTunjangan();
}

public String toString(){
return super.toString() +"\nDepartemen : " +departemen;
}
}
