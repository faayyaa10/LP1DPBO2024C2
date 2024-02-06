#include <iostream>
#include <string>

//standard namespace
using namespace std;

class DPR{
    //private atribut
    private:
        string id;      //atribut untuk id anggota dpr
        string name;    //atribut nama anggota dpr
        string bidang;  //atribut nama bidang untuk anggota dpr
        string partai;  //atribut nama partai untuk anggota dpr

    //public method
    public:

        //contructors
        DPR(){
            //set id name bidang partai to default value
            this->id = "";
            this->name = "";
            this->bidang = "";
            this->partai = "";
        }

        DPR(string id, string name, string bidang, string partai){
            this->id = id;
            this->name = name;
            this->bidang = bidang;
            this->partai = partai;
        }
    
    //get id
    string get_id(){
        return this->id;
    }

    //set id
    void set_id(string id){
        this->id = id;
    }

    //get name
    string get_name(){
        return this->name;
    }

    //set name
    void set_name(string name){
        this->name = name;
    }

    //get bidang
    string get_bidang(){
        return this->bidang;
    }

    //set bidang
    void set_bidang(string bidang){
        this->bidang = bidang;
    }

    //get partai
    string get_partai(){
        return this->partai;
    }

    //set partai
    void set_partai(string partai){
        this->partai = partai;
    }

    //public methods behaviour
//Method untuk menampilkan informasi anggota DPR
void showInfo() const {
    cout << id << " | " << name << " | " << bidang << " | " << partai << '\n';
}

//Method statis untuk menambah anggota DPR ke dalam list
static void tambahDPR(list<DPR>& llist) {
    //Variabel untuk menyimpan data anggota DPR yang akan ditambahkan
    string id, name, bidang, partai;
    cout << "Masukkan data anggota DPR:\n";
    //Input data anggota DPR
    cout << "ID: ";
    cin >> id;
    cout << "Nama: ";
    cin >> name;
    cout << "Bidang: ";
    cin >> bidang;
    cout << "Partai: ";
    cin >> partai;

    //Membuat objek DPR baru dengan data yang dimasukkan
    DPR temp(id, name, bidang, partai);
    //Menambahkan objek DPR baru ke dalam list
    llist.push_back(temp);
    cout << "Anggota DPR berhasil ditambahkan.\n\n";
}

//Method statis untuk mengubah data anggota DPR dalam list
static void ubahDPR(list<DPR>& llist) {
    //Variabel untuk menyimpan ID anggota DPR yang akan diubah
    string id;
    cout << "Masukkan ID anggota DPR yang ingin diubah: ";
    cin >> id;

    //Iterasi melalui list anggota DPR
    for (auto& anggota : llist) {
        //Jika ID anggota DPR cocok dengan yang dimasukkan pengguna
        if (anggota.get_id() == id) {
            //Variabel untuk menyimpan data baru anggota DPR
            string name, bidang, partai;
            cout << "Masukkan data baru untuk anggota DPR:\n";
            cout << "Nama: ";
            cin >> name;
            cout << "Bidang: ";
            cin >> bidang;
            cout << "Partai: ";
            cin >> partai;

            //Mengubah data anggota DPR yang sesuai dengan data baru
            anggota.set_name(name);
            anggota.set_bidang(bidang);
            anggota.set_partai(partai);
            cout << "Anggota DPR berhasil diubah.\n\n";
            return;
        }
    }

    //Jika ID anggota DPR tidak ditemukan
    cout << "ID anggota DPR tidak ditemukan.\n";
}

//Method statis untuk menghapus anggota DPR dari list
static void hapusDPR(list<DPR>& llist) {
    //Variabel untuk menyimpan ID anggota DPR yang akan dihapus
    string id;
    cout << "Masukkan ID anggota DPR yang ingin dihapus: ";
    cin >> id;

    //Iterator untuk menghapus anggota DPR dari list
    auto it = llist.begin();
    while (it != llist.end()) {
        if (it->get_id() == id) {
            it = llist.erase(it); //Menghapus anggota DPR dari list
            cout << "Anggota DPR berhasil dihapus.\n\n";
            return;
        } else {
            ++it;
        }
    }

    //Jika ID anggota DPR tidak ditemukan
    cout << "ID anggota DPR tidak ditemukan.\n\n";
}

    static void tampilkanMenu() {
        cout << "Menu:\n";
        cout << "1. Tambah Anggota DPR\n";
        cout << "2. Ubah Anggota DPR\n";
        cout << "3. Hapus Anggota DPR\n";
        cout << "4. Tampilkan Daftar Anggota DPR\n";
        cout << "0. Keluar\n";
        cout << "Pilih menu (0-4): ";
    }

    ~DPR() {}
};