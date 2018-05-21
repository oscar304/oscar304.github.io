package cv.webapp.dao;

import cv.webapp.bean.ContactoBean;
import cv.webapp.utils.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author odiaz
 */
public class ContactoDao extends ConexionDB{
    
    public void registrarContacto(ContactoBean contacto) throws SQLException{
        Connection con = conexionDB();
        String sql = "INSERT INTO dbo.tbl_contactos_cv (nombre, correo, msg) VALUES (?, ?, ?);";
        
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setString(1, contacto.getNombre());
        pstmt.setString(2, contacto.getEmail());
        pstmt.setString(3, contacto.getMsg());
        
        pstmt.executeUpdate();
        
        con.close();
    }
}
