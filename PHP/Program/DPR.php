<?php
class DPR {
    private $id;    
    private $name;  
    private $bidang;    
    private $partai;    
    private $fotoProfil;    

    public function __construct($id, $name, $bidang, $partai, $fotoProfil) {
        $this->id = $id;
        $this->name = $name;
        $this->bidang = $bidang;
        $this->partai = $partai;
        $this->fotoProfil = $fotoProfil;
    }
    
    public function tampilkanInfo() {
        echo "<tr>";
        echo "<td>{$this->id}</td>";
        echo "<td>{$this->name}</td>";
        echo "<td>{$this->bidang}</td>";
        echo "<td>{$this->partai}</td>";
        echo "<td><img src='{$this->fotoProfil}' alt='Foto Profil' width='115' height='145'></td>";
        echo "</tr>";
    }

    public function getId() {
        return $this->id;
    }

    public function getName() {
        return $this->name;
    }

    public function getBidang() {
        return $this->bidang;
    }

    public function getPartai() {
        return $this->partai;
    }

    public function getProfilePicture() {
        return $this->fotoProfil;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function setBidang($bidang) {
        $this->bidang = $bidang;
    }

    public function setPartai($partai) {
        $this->partai = $partai;
    }

    public function setFotoProfil($fotoProfil) {
        $this->fotoProfil = $fotoProfil;
    }

    // Fungsi untuk menambah anggota DPR baru
    public static function tambahAnggota(&$daftar, $id, $name, $bidang, $partai, $fotoProfil) {
        $anggotaBaru = new DPR($id, $name, $bidang, $partai, $fotoProfil);
        array_push($daftar, $anggotaBaru);
    }

    // Fungsi untuk memperbarui data anggota DPR berdasarkan ID
    public static function perbaruiAnggota(&$daftar, $id, $name, $bidang, $partai, $fotoProfil) {
        foreach ($daftar as $anggota) {
            if ($anggota->getId() == $id) {
                $anggota->setName($name);
                $anggota->setBidang($bidang);
                $anggota->setPartai($partai);
                $anggota->setFotoProfil($fotoProfil);
                break;
            }
        }
    }

    // Fungsi untuk menghapus anggota DPR berdasarkan ID
    public static function hapusAnggota(&$daftar, $id) {
        foreach ($daftar as $key => $anggota) {
            if ($anggota->getId() == $id) {
                unset($daftar[$key]);
                break;
            }
        }
    }
}
?>
