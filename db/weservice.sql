-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2015 at 07:27 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `weservice`
--

-- --------------------------------------------------------

--
-- Table structure for table `provinsi`
--

CREATE TABLE IF NOT EXISTS `provinsi` (
  `id_provinsi` varchar(2) NOT NULL,
  `nama_provinsi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `provinsi`
--

INSERT INTO `provinsi` (`id_provinsi`, `nama_provinsi`) VALUES
('01', 'Aceh'),
('02', 'Sumatera Utara'),
('03', 'Sumatera Barat'),
('04', 'Jambi'),
('05', 'Bengkulu'),
('06', 'Riau'),
('07', 'Kepulauan Riau'),
('08', 'Sumatera Selatan'),
('09', 'Bangka Belitung'),
('10', 'Lampung'),
('11', 'Banten'),
('13', 'Jawa Barat'),
('14', 'Jawa Tengah'),
('15', 'DI Yogyakarta'),
('16', 'Jawa Timur'),
('17', 'Bali'),
('18', 'NTB'),
('19', 'NTT'),
('20', 'Kalimantan Barat'),
('21', 'Kalimantan Tengah'),
('22', 'Kalimantan Selatan'),
('23', 'Kalimantan Timur'),
('24', 'Gorontalo'),
('25', 'Sulawesi Utara'),
('26', 'Sulawesi Tengah'),
('27', 'Sulawesi Tenggara'),
('28', 'Sulawesi Selatan'),
('29', 'Sulawesi Barat'),
('30', 'Maluku'),
('31', 'Maluku Utara'),
('32', 'Papua Barat'),
('33', 'Papua');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `provinsi`
--
ALTER TABLE `provinsi`
 ADD PRIMARY KEY (`id_provinsi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
