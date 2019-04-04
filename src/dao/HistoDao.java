/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class HistoDao {
    
    public static List getDatesParUser(User u) throws SQLException{
        
    //LISTE DES DATES
        List<String> dates = new ArrayList<>();
    
    //REQUETE SQL
        String sql = "SELECT poidsEvo, dateEvo FROM evopoids WHERE user.iduser = evopoids.idUser AND user.nom =? ";
    
    //CONNEXION A LA BASE DE DONNES
        Connection connexion = ConnectBd.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setString(1, u.getNom());
        ResultSet rs = ordre.executeQuery();
    
    //CONSUTRUCTION DE LA LISTE DES DATES
        while (rs.next()){
            dates.add(rs.getString("dateEvo"));
        }
        return dates;
    }
    
    public static List getPoidsParUser(User u) throws SQLException{
        
        
        List<Double> listPoids = new ArrayList<>();
        
        String sql = "SELECT poidsEvo, dateEvo FROM evopoids WHERE user.iduser = evopoids.idUser AND user.nom =? ";
        
        Connection connexion = ConnectBd.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setString(1, u.getNom());
        ResultSet rs = ordre.executeQuery();

        
        while (rs.next()){
            listPoids.add(rs.getDouble("poidsEvo"));
        }
        return listPoids;
    }

}
