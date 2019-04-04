-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 04 avr. 2019 à 13:53
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `apoidsplicationcaf`
--
CREATE DATABASE IF NOT EXISTS `apoidsplicationcaf` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `apoidsplicationcaf`;

-- --------------------------------------------------------

--
-- Structure de la table `evopoids`
--

DROP TABLE IF EXISTS `evopoids`;
CREATE TABLE IF NOT EXISTS `evopoids` (
  `idEvo` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `dateEvo` varchar(45) NOT NULL,
  `poidsEvo` double NOT NULL,
  PRIMARY KEY (`idEvo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `evopoids`
--

INSERT INTO `evopoids` (`idEvo`, `idUser`, `dateEvo`, `poidsEvo`) VALUES
(1, 3, '03/03/2019', 70),
(2, 3, '08/03/2019', 68.2),
(3, 3, '18/03/2019', 71.6),
(4, 3, '23/03/2019', 71),
(5, 3, '01/04/2019', 68);

-- --------------------------------------------------------

--
-- Structure de la table `suiviobjectif`
--

DROP TABLE IF EXISTS `suiviobjectif`;
CREATE TABLE IF NOT EXISTS `suiviobjectif` (
  `idSuivi` int(11) NOT NULL AUTO_INCREMENT,
  `dateSuivi` varchar(45) DEFAULT NULL,
  `jourSuivi` varchar(45) DEFAULT NULL,
  `poidSuivi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSuivi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`iduser`, `nom`, `prenom`, `mail`, `mdp`, `sexe`, `taille`, `poids`) VALUES
(1, 'test1', 'test1', 'test1', 'test1', 'homme', 180, 81),
(2, 'test2', 'test2', 'test2', 'test2', 'femme', 160, 70);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

