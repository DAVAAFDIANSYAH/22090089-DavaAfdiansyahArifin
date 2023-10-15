package Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;


public class Koneksi {
    
    public static Connection Koneksi_database() {
        try{
            MysqlDataSource m = new MysqlDataSource();
         m.setUser ("root");
         m.setPassword ("");
         m.setDatabaseName ("db_produk");
         m.setServerName("localhost");
         m.setPortNumber (3306);
         m.setServerTimezone( "Asia/Jakarta");
         
        Connection C = m.getConnection();
         System.out.println("sukses sambung ke database");
         return C;
         
        } catch (Exception e){
           //penanganan eror
            System.out.println("gagal terhubung ke database");
            System.out.println("\"EROR \" + e.getMessage()");
        }
        return null;
    }
    
}
