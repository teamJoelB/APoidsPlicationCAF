-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 04 Avril 2019 à 12:42
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
  `dateEvo` varchar(45) NOT NULL,
  `poidsEvo` double NOT NULL,
  PRIMARY KEY (`idEvo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`iduser`, `nom`, `prenom`, `mail`, `mdp`, `sexe`, `taille`, `poids`) VALUES
(1, 'test1', 'test1', 'test1', 'test1', 'homme', 180, 81),
(2, 'test2', 'test2', 'test2', 'test2', 'femme', 160, 70);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
