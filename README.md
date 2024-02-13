# LP1DPBO2024C2

/*
Saya Talitha Fayarina Adhigunawan mengerjakan LP1 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

Pada latihan 1 praktikum DPBO ini disuruh untuk membuat program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar anggota DPR (sekumpulan objek anggota DPR) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap anggota DPR memiliki data id, nama, nama bidang, nama partai, dan foto profil (khusus bahasa PHP). Kemudian untuk bahasa yang akan jelaskan yaitu bahasa Python.

pada class DPR yang memiliki atribut id, name, bidang, dan partai. contruct __init__ digunakan untuk menginisialisasi objek dengan nilai-nilai tersebut. Kemudian ada method getId, getName, getBidang, dan getPartai digunakan untuk mendapatkan nilai dari atribut anggota DPR. 

Kemudian saya membuat method tambahDPR, ubahDPR, dan hapusDPR untuk menambah, mengubah, dan menghapus anggota DPR dari daftar yang disimpan dalam list. Lalu method tampilkanMenu untuk menampilkan menu pilihan fitur kepada pengguna. method tabel membentuk tabel dengan lebar kolom yang disesuaikan.

Selanjutnya pada file Main terdapat perulangan while untuk menampilkan menu dan memproses pilihan user. Pilihan user akan menentukan jalannya program, seperti menambah, mengubah, menghapus, atau menampilkan daftar anggota DPR. Jika user memilih untuk menampilkan daftar anggota DPR, program akan menentukan lebar kolom untuk setiap atribut, kemudian menampilkan tabel dengan data anggota DPR yang sudah disimpan dalam list.

Berikut adalah dokumentasi saat menjalankan kode program dengan bahasa python:

1. Menambahkan beberapa anggota pada list dengan atribut ID, Nama, Bidang dan Partai kemudian menampilkan tabel daftar anggota
   <img width="960" alt="Menambah Anggota 1 dan Menampilkan" src="https://github.com/faayyaa10/LP1DPBO2024C2/assets/114636102/42714024-57db-4901-882d-49b56f00e68d">
   <img width="960" alt="Menambah Anggota 2 dan Menampilkan" src="https://github.com/faayyaa10/LP1DPBO2024C2/assets/114636102/ef9735ee-ab43-4906-b456-49c3c1b5d314">
   <img width="960" alt="Menambah Anggota 3 dan Menampilkan" src="https://github.com/faayyaa10/LP1DPBO2024C2/assets/114636102/d23a85b7-38a3-4fb6-9bc3-1acfc48a3589">

2. Mengubah salah satu atribut dari anggota partai dan menampilkan tabel daftar anggota
   <img width="960" alt="Mengubah Anggota dan Menampilkan" src="https://github.com/faayyaa10/LP1DPBO2024C2/assets/114636102/7ac158d0-5495-45bb-9edd-6c87a4f20ddd">

3. Menghapus salah satu anggota partai dari list, menampilkan tabel daftar anggota dan keluar dari program
   <img width="960" alt="Menghapus Anggota, Menampilkan dan Keluar Program" src="https://github.com/faayyaa10/LP1DPBO2024C2/assets/114636102/b179cdde-1938-487e-9748-663fc8b7e7cb">
