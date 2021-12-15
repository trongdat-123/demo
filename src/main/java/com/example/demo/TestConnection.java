package com.example.demo;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

    public void excute (String sql) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("quangmanh");
        ds.setPassword("quangmanh01");
        ds.setServerName("QUANGMANH\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("QuanLyCovid19");

        Connection conn = ds.getConnection();
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
