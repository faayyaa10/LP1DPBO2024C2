import java.util.List;
import java.util.Scanner;

public class DPR {
    private String id;  //private atribut untuk id anggota dpr
    private String name;    //private atribut untuk nama anggota dpr
    private String bidang;  //private atribut untuk nama bidang anggota dpr
    private String partai;  //private atribut untuk nama partai anggota dpr

    //contructors w/farameter
    public DPR(String id, String name, String bidang, String partai) {
        this.id = id;
        this.name = name;
        this.bidang = bidang;
        this.partai = partai;
    }

    //bikin get sama set
    //get id
    public String getId() {
        return id;
    }

    //set id
    public void setId(String id){
        this.id = id;
    }

    //get name
    public String getName() {
        return name;
    }

    //set name
    public void setName(String name){
        this.name = name;
    }

    //get bidang
    public String getBidang() {
        return bidang;
    }

    //set bidang
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    //get partai
    public String getPartai() {
        return partai;
    }

    //set partai
    public void setPartai(String partai){
        this.partai = partai;
    }

    //fungsi untuk menambah anggota DPR baru
    public static void tambahDPR(List<DPR> llist) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data anggota DPR:");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Bidang: ");
        String bidang = scanner.nextLine();
        System.out.print("Partai: ");
        String partai = scanner.nextLine();

        DPR temp = new DPR(id, name, bidang, partai);
        llist.add(temp);
        System.out.println("Anggota DPR berhasil ditambahkan.\n");
    }

    //fungsi untuk mengubah data anggota DPR
    public static void ubahDPR(List<DPR> llist) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID anggota DPR yang ingin diubah: ");
        String id = scanner.nextLine();

        for (DPR anggota : llist) {
            if (anggota.getId().equals(id)) {
                System.out.println("Masukkan data baru untuk anggota DPR:");
                System.out.print("Nama: ");
                String name = scanner.nextLine();
                System.out.print("Bidang: ");
                String bidang = scanner.nextLine();
                System.out.print("Partai: ");
                String partai = scanner.nextLine();

                anggota.name = name;
                anggota.bidang = bidang;
                anggota.partai = partai;
                System.out.println("Anggota DPR berhasil diubah.\n");
                return;
            }
        }

        System.out.println("ID anggota DPR tidak ditemukan.\n");
    }

    //fungsi untuk menghapus anggota DPR
    public static void hapusDPR(List<DPR> llist) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID anggota DPR yang ingin dihapus: ");
        String id = scanner.nextLine();

        for (int i = 0; i < llist.size(); i++) {
            if (llist.get(i).getId().equals(id)) {
                llist.remove(i);
                System.out.println("Anggota DPR berhasil dihapus.\n");
                return;
            }
        }

        System.out.println("ID anggota DPR tidak ditemukan.\n");
    }

    //fungsi untuk menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Anggota DPR");
        System.out.println("2. Ubah Anggota DPR");
        System.out.println("3. Hapus Anggota DPR");
        System.out.println("4. Tampilkan Daftar Anggota DPR");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu (0-4): ");
    }

    //fungsi untuk mengatur lebar kolom dalam tabel
    public static String tabel(String teks, int lebarKolom) {
        return String.format("%-" + lebarKolom + "s", teks);
    }
}
