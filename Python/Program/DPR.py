class DPR:
    def __init__(self, id, name, bidang, partai):
        self.id = id  #private atribut untuk id anggota dpr
        self.name = name  #private atribut untuk nama anggota dpr
        self.bidang = bidang  #private atribut untuk nama bidang anggota dpr
        self.partai = partai  #private atribut untuk nama partai anggota dpr

    #bikin get set
    def getId(self):
        return self.id

    def getName(self):
        return self.name

    def getBidang(self):
        return self.bidang

    def getPartai(self):
        return self.partai

    #bikin method buat tambah anggota
    def tambahDPR(llist):
        print("Masukkan data anggota DPR:")
        id = input("ID: ")
        name = input("Nama: ")
        bidang = input("Bidang: ")
        partai = input("Partai: ")

        temp = DPR(id, name, bidang, partai)
        llist.append(temp)
        print("Anggota DPR berhasil ditambahkan.\n")

    #bikin method buat ubah anggota
    def ubahDPR(llist):
        id = input("Masukkan ID anggota DPR yang ingin diubah: ")

        for anggota in llist:
            if anggota.getId() == id:
                print("Masukkan data baru untuk anggota DPR:")
                name = input("Nama: ")
                bidang = input("Bidang: ")
                partai = input("Partai: ")

                anggota.name = name
                anggota.bidang = bidang
                anggota.partai = partai
                print("Anggota DPR berhasil diubah.\n")
                return

        print("ID anggota DPR tidak ditemukan.\n")

    #bikin method buat hapus anggota
    def hapusDPR(llist):
        id = input("Masukkan ID anggota DPR yang ingin dihapus: ")

        for i in range(len(llist)):
            if llist[i].getId() == id:
                llist.pop(i)
                print("Anggota DPR berhasil dihapus.\n")
                return

        print("ID anggota DPR tidak ditemukan.\n")

    #bikin method buat nampilin fitur
    def tampilkanMenu():
        print("Menu:")
        print("1. Tambah Anggota DPR")
        print("2. Ubah Anggota DPR")
        print("3. Hapus Anggota DPR")
        print("4. Tampilkan Daftar Anggota DPR")
        print("0. Keluar")
        print("Pilih menu (0-4): ", end="")

    #bikin method buat tabel
    def tabel(teks, lebarKolom):
        return teks.ljust(lebarKolom)
