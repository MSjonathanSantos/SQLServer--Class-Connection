package primeiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSQLServer  {
    
    private Connection  c;

    public GenericDaoSQLServer  (){
        super();
    }
    
    public Connection  getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "192.168.0.169";
        String dbName = "teste";
        String user ="sanmac";
        String senha ="Douglas2519#";
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        
        c = DriverManager.getConnection(String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s", hostName, dbName), user, senha);
       return c;
        
    }
}






























