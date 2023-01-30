-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 30, 2023 at 01:14 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ars`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_akun_mekanik`
--

CREATE TABLE `tbl_akun_mekanik` (
  `id` char(10) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_akun_mekanik`
--

INSERT INTO `tbl_akun_mekanik` (`id`, `username`, `password`) VALUES
('AM001', 'Teguh', 'guhhh');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sparepart`
--

CREATE TABLE `tbl_sparepart` (
  `Kode_part` varchar(100) NOT NULL,
  `Nama_part` varchar(100) DEFAULT NULL,
  `Harga` int(10) NOT NULL,
  `stok` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_sparepart`
--

INSERT INTO `tbl_sparepart` (`Kode_part`, `Nama_part`, `Harga`, `stok`) VALUES
('BRG0001', 'handgrip', 3000, 3),
('BRG002', 'oli', 30000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi`
--

CREATE TABLE `tbl_transaksi` (
  `no_faktur` char(100) NOT NULL,
  `id` char(100) NOT NULL,
  `tanggal` date NOT NULL DEFAULT current_timestamp(),
  `Kode_part` char(100) NOT NULL,
  `kuantitas` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_transaksi`
--

INSERT INTO `tbl_transaksi` (`no_faktur`, `id`, `tanggal`, `Kode_part`, `kuantitas`) VALUES
('10a934c', 'AM001', '2023-01-30', 'BRG002', 1),
('158b78d', 'AM001', '2023-01-30', 'BRG002', 1),
('7336d33', 'AM001', '2023-01-30', 'BRG002', 1),
('ahh', 'AM001', '2023-01-30', 'BRG002', 1),
('ahha', 'AM001', '2023-01-30', 'BRG0001', 1),
('dee1c36', 'AM001', '2023-01-30', 'BRG0001', 4),
('qbhdsb', 'AM001', '2023-01-30', 'BRG0001', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_akun_mekanik`
--
ALTER TABLE `tbl_akun_mekanik`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_sparepart`
--
ALTER TABLE `tbl_sparepart`
  ADD PRIMARY KEY (`Kode_part`);

--
-- Indexes for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD PRIMARY KEY (`no_faktur`),
  ADD KEY `id` (`id`),
  ADD KEY `part` (`Kode_part`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_transaksi`
--
ALTER TABLE `tbl_transaksi`
  ADD CONSTRAINT `part` FOREIGN KEY (`Kode_part`) REFERENCES `tbl_sparepart` (`Kode_part`),
  ADD CONSTRAINT `tbl_transaksi_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tbl_akun_mekanik` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
