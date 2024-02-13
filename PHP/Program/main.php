<?php
require_once 'DPR.php';

//inisialisasi daftar anggota DPR
$daftarDPR = array();

//menambahkan anggota DPR
DPR::tambahAnggota($daftarDPR, 01, "Seungyoun", "Hukum", "PKS", "seungyoun.jpeg");
DPR::tambahAnggota($daftarDPR, 02, "Dokyeom", "Pendidikan", "NasDem", "dokyeom.jpeg");
DPR::tambahAnggota($daftarDPR, 03, "Heeseung", "Ekonomi", "PKB", "heeseung.jpeg");

//menampilkan daftar anggota DPR
echo "<h2>Daftar Anggota DPR</h2>";
echo "<table border='2'>";
echo "<tr>
      <th>ID</th>
      <th>Nama</th>
      <th>Bidang</th>
      <th>Partai</th>
      <th>Foto Profil</th>
    </tr>";
foreach ($daftarDPR as $anggota) {
    $anggota->tampilkanInfo();
}
echo "</table>";

//mengubah anggota DPR dengan ID 1
DPR::perbaruiAnggota($daftarDPR, 01, "Seungyoun", "Kesehatan", "PKS", "seungyoun.jpeg");

//menampilkan daftar anggota DPR setelah diubah
echo "<h2>Daftar Anggota DPR</h2>";
echo "<table border='2'>";
echo "<tr>
      <th>ID</th>
      <th>Nama</th>
      <th>Bidang</th>
      <th>Partai</th>
      <th>Foto Profil</th>
    </tr>";
foreach ($daftarDPR as $anggota) {
    $anggota->tampilkanInfo();
}
echo "</table>";
echo "<h5>Daftar Anggota DPR dengan ID 01 berhasil diubah!</h5>";

//menghapus anggota DPR dengan ID 03
DPR::hapusAnggota($daftarDPR, 03);

//menampilkan daftar anggota DPR setelah penghapusan
echo "<h2>Daftar Anggota DPR</h2>";
echo "<table border='2'>";
echo "<tr>
      <th>ID</th>
      <th>Nama</th>
      <th>Bidang</th>
      <th>Partai</th>
      <th>Foto Profil</th>
    </tr>";
foreach ($daftarDPR as $anggota) {
    $anggota->tampilkanInfo();
}
echo "</table>";
echo "<h5>Daftar Anggota DPR dengan ID 03 berhasil dihapus!</h5>";
?>
