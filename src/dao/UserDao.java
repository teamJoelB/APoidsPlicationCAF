
package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {
    
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
             u.setId(rs.getInt("id"));
             u.setNom(rs.getString("nom"));
             u.setPrenom(rs.getString("prenom"));
             u.setMdp(rs.getString("mail"));
         }
        return u;
    }
}
