import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class TabelBuku {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        ArrayList<Buku> buku = new ArrayList<Buku>();

        System.out.print("Masukan Jumlah Buku yang Akan Diinput : ");
        int jumlahInput = input.nextInt();

        for(int i=1; i<=jumlahInput; i++) {
            System.out.println(i + ")");
            System.out.print("Judul Buku : ");
            String judul = input.nextLine();
            System.out.print("Pengarang : ");
            String pengarang = input.nextLine();
            System.out.print("Penerbit : ");
            String penerbit = input.nextLine();
            System.out.print("Kategori : ");
            String kategori = input.nextLine();
            System.out.print("Tahun : ");
            String tahun = input.nextLine();

            String kat = kategoriBuku(kategori);
            buku.add(new Buku(judul, pengarang, penerbit, kat, tahun));
        }

        System.out.println("=================================================================================");
        System.out.println("No\tJudul\tPengarang\tPenerbit\tTahun\t\tKategori");
        System.out.println("=================================================================================");
        int i = 1;
        int jumlah_teknik = 0;
        int jumlah_manajemen = 0;
        int jumlah_fiksi = 0;
        int jumlah_lainnya = 0;
        int jumlah_lawas = 0;
        int jumlah_baru = 0;
        for(Buku b:buku) {
            System.out.println(i+"\t"+b.judul+"\t"+b.pengarang+"\t\t"+b.penerbit+"\t\t"+b.tahun+"\t\t"+b.kategori);
            if(b.kategori.toLowerCase().equals("teknik")) {
                jumlah_teknik++;
            }else if(b.kategori.toLowerCase().equals("manajemen")) {
                jumlah_manajemen++;
            }else if(b.kategori.toLowerCase().equals("fiksi")) {
                jumlah_fiksi++;
            }else if(b.kategori.toLowerCase().equals("lainnya")) {
                jumlah_lainnya++;
            }

            if(Integer.parseInt(b.tahun) <= 2010) {
                jumlah_lawas++;
            }else{
                jumlah_baru++;
            }
            i++;
        }

        System.out.println("Jumlah Buku yang Tersedia : " + buku.size());
        System.out.println("Buku Teknik : " + jumlah_teknik);
        System.out.println("Buku Manajemen : " + jumlah_manajemen);
        System.out.println("Buku Fiksi : " + jumlah_fiksi);
        System.out.println("Buku Lainnya : " + jumlah_lainnya);
        System.out.println("Buku Lawas : " + jumlah_lawas);
        System.out.println("Buku Baru : " + jumlah_baru);
    }

    public static String kategoriBuku(String kategori) {
        if(kategori.equals("1")) {
            kategori = "Teknik";
        } else if(kategori.equals("2")) {
            kategori = "Manajemen";
        } else if(kategori.equals("3")) {
            kategori = "Fiksi";
        } else if(kategori.equals("4")) {
            kategori = "Lainnya";
        } 
        return kategori;
    }
}

class Buku {
    public String judul, pengarang, penerbit, kategori, tahun;

    public Buku(String judul, String pengarang, String penerbit, String kategori, String tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun = tahun;
    }
}