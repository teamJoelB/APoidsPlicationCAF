-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 05 Avril 2019 à 09:32
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `apoidsplicationcaf`
--
CREATE DATABASE IF NOT EXISTS `apoidsplicationcaf` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `apoidsplicationcaf`;

-- --------------------------------------------------------

--
-- Structure de la table `evopoids`
--

CREATE TABLE IF NOT EXISTS `evopoids` (
  `idEvo` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `dateEvo` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `poidsEvo` double NOT NULL,
  PRIMARY KEY (`idEvo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Contenu de la table `evopoids`
--

INSERT INTO `evopoids` (`idEvo`, `idUser`, `dateEvo`, `poidsEvo`) VALUES
(1, 3, '0000-00-00 00:00:00', 70),
(2, 3, '0000-00-00 00:00:00', 68.2),
(3, 3, '0000-00-00 00:00:00', 71.6),
(4, 3, '0000-00-00 00:00:00', 71),
(5, 3, '0000-00-00 00:00:00', 68),
(6, 1, '0000-00-00 00:00:00', 1),
(7, 1, '0000-00-00 00:00:00', 10),
(8, 1, '0000-00-00 00:00:00', 50),
(9, 1, '2019-04-04 15:19:59', 20),
(10, 1, '2019-04-04 15:20:40', 15),
(11, 1, '2019-04-04 17:22:39', 70),
(12, 1, '2019-04-04 17:22:53', 50),
(13, 1, '2019-04-05 09:08:57', 10),
(14, 3, '2019-04-05 09:09:58', 70),
(15, 3, '2019-04-05 09:12:29', 70.5);

-- --------------------------------------------------------

--
-- Structure de la table `suiviobjectif`
--

CREATE TABLE IF NOT EXISTS `suiviobjectif` (
  `idSuivi` int(11) NOT NULL AUTO_INCREMENT,
  `dateSuivi` varchar(45) DEFAULT NULL,
  `jourSuivi` varchar(45) DEFAULT NULL,
  `poidSuivi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSuivi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `sexe` varchar(45) NOT NULL,
  `taille` int(11) NOT NULL,
  `poids` int(11) NOT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`iduser`, `nom`, `prenom`, `mail`, `mdp`, `sexe`, `taille`, `poids`) VALUES
(1, 'test1', 'test1', 'test1', 'test1', 'homme', 180, 10),
(2, 'test2', 'test2', 'test2', 'test2', 'femme', 160, 70),
(3, 'Mbappe', 'Kylian', 'km@psg.com', 'psg', 'homme', 170, 71);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
