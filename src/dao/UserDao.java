
package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
    
    String varMdp;
    
    
    public static User getByLoginPass(String login, String mdp)
    throws SQLException{
        User u = null;
        
        // les ? permettent d'éviter une faille de sécurité !
         String sql = "SELECT * FROM user WHERE mail=? AND mdp=?";
         
         Connection connexion = ConnectBd.getConnection();
         
         //attribution des variables aux "?"
         PreparedStatement ordre = connexion.prepareStatement(sql);
         ordre.setString(1, login);
         ordre.setString(2, mdp);
         // on stock les infos entrees
         ResultSet rs = ordre.executeQuery();
         // si on trouve un utilisateur equivalent aux données rentrées dans la bdd
         if(rs.next()){
             u = new User();
             u.setId(rs.getInt("iduser"));
             u.setNom(rs.getString("nom"));
             u.setPrenom(rs.getString("prenom"));
             u.setMdp(rs.getString("mail"));
             u.setSexe(rs.getString("sexe"));
             u.setTaille(rs.getInt("taille"));
             u.setPoids(rs.getDouble("poids"));
         }
        return u;
    }
    
    public static void insertUser(User u)
            throws SQLException{
        String sql = "INSERT INTO user (nom, prenom, mail, mdp, sexe, taille, poids) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection connexion = ConnectBd.getConnection();
        
        PreparedStatement ordre = connexion.prepareStatement(sql);
        
        ordre.setString(1, u.getNom());
        ordre.setString(2, u.getPrenom());
        ordre.setString(3, u.getMail());
        ordre.setString(4, u.getMdp());
        ordre.setString(5, u.getSexe());
        ordre.setInt(6, u.getTaille());
        ordre.setDouble(7, u.getPoids());
        
        
        ordre.execute();
    }
    
    
    
}


