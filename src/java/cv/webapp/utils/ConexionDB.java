package cv.webapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author odiaz
 */
public class ConexionDB {
    private Connection cn = null;
    public Connection conexionDB() throws SQLException{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://ulimassd.database.windows.net:1433;database=ssdDB;user=odiaz@ulimassd;password=Oscar57875;encrypt=true;trustServerCertificate=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
        }catch(Exception e){
            throw new SQLException(e);
        }
        return cn;
    }
    
    public void desconectar() throws SQLException{
        cn.close();
    }
}
