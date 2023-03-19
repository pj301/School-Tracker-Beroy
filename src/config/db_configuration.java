/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import static adminMain.mainDashboard.jTable8;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author SCC-COLLEGE
 */
public class db_configuration {
    private Connection connection;
    
    public db_configuration(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
        
    }
    
    
    
    public ResultSet getData(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
    public void insertData(String sql){
       try{ 
        PreparedStatement pstmt =connection.prepareStatement(sql);
        pstmt.executeUpdate();
        System.out.println("Inserted Successfully!");
        pstmt.close();
       }catch(SQLException e){
           System.out.println("Connection Error:"+e);
       }
    }
    
    
    
    
}
