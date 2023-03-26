import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class TabelMahasiwa {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

        System.out.print("Berapa Data Mahasiswa yang Akan Diinput : ");
        int jumlahInput = input.nextInt();

        for(int i=1; i<=jumlahInput; i++) {
            System.out.println("Isi Data Mahasiswa ke-" + i + " :");
            System.out.print("Nama Mahasiswa : ");
            String nama = input.nextLine();
            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("Jurusan : ");
            String jurusan = input.nextLine();
            System.out.print("Tahun Lahir : ");
            String tahun_lahir = input.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenis_kelamin = input.nextLine();

            String umur = umurCalculate(Integer.parseInt(tahun_lahir));
            mhs.add(new Mahasiswa(nama, nim, jurusan, umur, jenis_kelamin));
        }

        System.out.println("=================================================================================");
        System.out.println("No\tNama\tNIM\t\tJurusan\t\t\tUmur\tJenis Kelamin");
        System.out.println("=================================================================================");
        int i = 1;
        int jumlah_lakilaki = 0;
        int jumlah_perempuan = 0;
        for(Mahasiswa m:mhs) {
            System.out.println(i+"\t"+m.nama+"\t"+m.nim+"\t"+m.jurusan+"\t"+m.umur+"\t"+m.jenis_kelamin);
            if(m.jenis_kelamin.toLowerCase().equals("laki-laki")) {
                jumlah_lakilaki++;
            }else if(m.jenis_kelamin.toLowerCase().equals("perempuan")) {
                jumlah_perempuan++;
            }
            i++;
        }

        System.out.println("Jumlah Mahasiswa : " + mhs.size());
        System.out.println("Jumlah Laki-Laki : " + jumlah_lakilaki);
        System.out.println("Jumlah Perempuan : " + jumlah_perempuan);
    }

    public static String umurCalculate(int umur) {
        Calendar kalender = Calendar.getInstance();
        int tahun_sekarang = kalender.get(Calendar.YEAR);
        String sUmur = String.valueOf(umur = tahun_sekarang - umur);
        return sUmur;
    }
}

class Mahasiswa {
    public String nama, nim, jurusan, umur, jenis_kelamin;

    public Mahasiswa(String nama, String nim, String jurusan, String umur, String jenis_kelamin) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.jenis_kelamin = jenis_kelamin;
    }
}

class Umur {
}