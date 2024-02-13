import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //membuat ArrayList untuk menyimpan objek DPR
        List<DPR> llist = new ArrayList<>();

        //membuat objek Scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);
        int pilih;

        //melakukan loop menu
        do {
            //menampilkan menu
            DPR.tampilkanMenu();
            
            pilih = scanner.nextInt();
            scanner.nextLine(); 

            //pake switch case buat bikin menuS
            switch (pilih) {
                case 1:
                    //menambahkan anggota DPR baru
                    DPR.tambahDPR(llist);
                    break;
                case 2:
                    //mengubah data anggota DPR
                    DPR.ubahDPR(llist);
                    break;
                case 3:
                    //menghapus anggota DPR
                    DPR.hapusDPR(llist);
                    break;
                case 4:
                    //nampilin daftar anggota DPR
                    System.out.println("Daftar Anggota DPR:");

                    //mencari lebar maksimum untuk setiap kolom
                    int lebarId = 3;
                    int lebarNama = 4;
                    int lebarBidang = 6;
                    int lebarPartai = 6;
                    for (DPR anggota : llist) {
                        if (anggota.getId().length() > lebarId) {
                            lebarId = anggota.getId().length();
                        }
                        if (anggota.getName().length() > lebarNama) {
                            lebarNama = anggota.getName().length();
                        }
                        if (anggota.getBidang().length() > lebarBidang) {
                            lebarBidang = anggota.getBidang().length();
                        }
                        if (anggota.getPartai().length() > lebarPartai) {
                            lebarPartai = anggota.getPartai().length();
                        }
                    }

                    //membuat baris pembatas
                    String pembatas = "+" + "-".repeat(lebarId + 2) + "+" + "-".repeat(lebarNama + 2) +
                                      "+" + "-".repeat(lebarBidang + 2) + "+" + "-".repeat(lebarPartai + 2) + "+";
                    System.out.println(pembatas);

                    //nampilin header tabel
                    System.out.println("| " + DPR.tabel("ID", lebarId) + " | " +
                                       DPR.tabel("Nama", lebarNama) + " | " +
                                       DPR.tabel("Bidang", lebarBidang) + " | " +
                                       DPR.tabel("Partai", lebarPartai) + " |");
                    System.out.println(pembatas);

                    //nampilin data anggota DPR
                    for (DPR anggota : llist) {
                        System.out.println("| " + DPR.tabel(anggota.getId(), lebarId) + " | " +
                                           DPR.tabel(anggota.getName(), lebarNama) + " | " +
                                           DPR.tabel(anggota.getBidang(), lebarBidang) + " | " +
                                           DPR.tabel(anggota.getPartai(), lebarPartai) + " |");
                    }
                    System.out.println(pembatas);
                    break;
                case 0:
                    //keluar dari program
                    System.out.println("Program selesai.");
                    break;
                default:
                    //pilihan kalo ga valid
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0); //ulang terus selama pilihan bukan 0 
    }
}
