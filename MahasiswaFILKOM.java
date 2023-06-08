package Prak5;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;
    
    public MahasiswaFILKOM(String nim ,double ipk ,String nama, String nik,
    boolean jenisKelamin, boolean menikah) {
    super(nama , nik, jenisKelamin, menikah);
    this.nim = nim;
    this.ipk = ipk;
    }
    
    public String getNim() {
    return nim;
    }
    
    public double getIpk() {
    return ipk;
}
public String getStatus(){
String angkatan = nim.substring(0,2);
String prodi = "";
switch (nim.charAt(6)) {
case '2':
prodi = "Teknik Informatika";
break;
case '3':
prodi = "Teknik Komputer";
break;
case '4':
prodi = "Sistem Informasi";
break;
case '6':
prodi = "Pendidikan Teknologi Informasi";
break;
case '7':
prodi = "Teknologi Informasi";
break;
}
return prodi + ", 20" + angkatan;
}

public double getBeasiswa(){
if(ipk>=3 && ipk<=3.5) return 50;
else if(ipk>3.5) return 75;
else return 0;
}

public double getPendapatan(){
return super.getPendapatan()+getBeasiswa();
}

public String toString(){
String status = super.toString() + "\nNIM : " + nim + "\nIPK : " + ipk +
"\nStatus : " + getStatus();
return status;
}
}