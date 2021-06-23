package com.example.hellorest.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoSQL {

    public void workingWithDB() throws Exception {
        Class.forName("driver class of database");
        Connection conn = DriverManager.getConnection("");
        PreparedStatement prepStmt = conn.prepareStatement("SQL");
        ResultSet rs = prepStmt.executeQuery();
        while(rs.next()) {
            int id = rs.getInt("id");
        }
    }

}
