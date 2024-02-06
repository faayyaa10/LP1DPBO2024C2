#include <bits/stdc++.h>
#include "DPR.cpp"

int main() {
    list<DPR> llist;

    int pilih;
    do {
        DPR dpr1;
        dpr1.tampilkanMenu();
        cin >> pilih;

        switch (pilih) {
            case 1:
                dpr1.tambahDPR(llist);
                break;
            case 2:
                dpr1.ubahDPR(llist);
                break;
            case 3:
                dpr1.hapusDPR(llist);
                break;
            case 4:
                cout << "Daftar Anggota DPR:\n";
                for (const auto& anggota : llist) {
                    anggota.showInfo();
                }
                break;
            case 0:
                cout << "Program selesai.\n";
                break;
            default:
                cout << "Pilihan tidak valid.\n";
        }
    } while (pilih != 0);

    return 0;
}