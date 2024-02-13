from DPR import DPR


def main():
    llist = []

    #perulangan while untuk menampilkan menu dan proses milih fitur
    while True:
        DPR.tampilkanMenu()  #nampilin menu
        pilih = int(input())  #ambil pilihan user

        #tambah anggota DPR
        if pilih == 1:
            DPR.tambahDPR(llist)

        #ubah data anggota DPR
        elif pilih == 2:
            DPR.ubahDPR(llist)

        #hapus anggota DPR
        elif pilih == 3:
            DPR.hapusDPR(llist)

        #tampilkan daftar anggota DPR
        elif pilih == 4:
            print("Daftar Anggota DPR:")
            lebar_id = 3
            lebar_nama = 4
            lebar_bidang = 6
            lebar_partai = 6

            #tentukan lebar kolom
            for anggota in llist:
                if len(anggota.getId()) > lebar_id:
                    lebar_id = len(anggota.getId())
                if len(anggota.getName()) > lebar_nama:
                    lebar_nama = len(anggota.getName())
                if len(anggota.getBidang()) > lebar_bidang:
                    lebar_bidang = len(anggota.getBidang())
                if len(anggota.getPartai()) > lebar_partai:
                    lebar_partai = len(anggota.getPartai())

            #nampilin pembatas tabel
            pembatas = "+" + "-" * (lebar_id + 2) + "+" + "-" * (lebar_nama + 2) + \
                       "+" + "-" * (lebar_bidang + 2) + "+" + "-" * (lebar_partai + 2) + "+"
            print(pembatas)

            #nampilin header tabel
            print("| " + DPR.tabel("ID", lebar_id) + " | " +
                  DPR.tabel("Nama", lebar_nama) + " | " +
                  DPR.tabel("Bidang", lebar_bidang) + " | " +
                  DPR.tabel("Partai", lebar_partai) + " |")
            print(pembatas)

            #nampilin data anggota DPR
            for anggota in llist:
                print("| " + DPR.tabel(anggota.getId(), lebar_id) + " | " +
                      DPR.tabel(anggota.getName(), lebar_nama) + " | " +
                      DPR.tabel(anggota.getBidang(), lebar_bidang) + " | " +
                      DPR.tabel(anggota.getPartai(), lebar_partai) + " |")
            print(pembatas)

        #keluar dari program
        elif pilih == 0:
            print("Program selesai.")
            break

        #kalo pilihan ga valid
        else:
            print("Pilihan tidak valid.")


if __name__ == "__main__":
    main()
