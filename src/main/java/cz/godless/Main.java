package cz.godless;

import cz.godless.HikariCPDataSource;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String select = "SELECT * FROM contact";

        try (Connection connection = HikariCPDataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(select);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone");

                System.out.println("id: " + id + ", name " + name + ", email " + email + ", phone number: " + phoneNumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while connecting to database!");
        }
    }
}
