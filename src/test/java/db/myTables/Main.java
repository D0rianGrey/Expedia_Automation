package db.myTables;

import db.DbConnection;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    private static ResultSet getResultSet(String sql) {
        ResultSet resultSet;
        try {
            resultSet = DbConnection.INSTANCE.getConnection().createStatement().executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Your age: "));

        System.out.println(name);
        System.out.println(age);
    }

}
