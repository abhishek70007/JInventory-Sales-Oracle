package com.wipro.sales.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public Connection getDBConnection(){
        Connection con=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abhi");
            //System.out.print("connections done");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }

}