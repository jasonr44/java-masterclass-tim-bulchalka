package com.company;

import java.sql.*;

public class TestDB {
    TestDB() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:G:\\dev\\java\\databases\\sqlite\\testjava.db");
//            conn.setAutoCommit(false); // Prevents statements from executing without explicit commit
            Statement statement = conn.createStatement();
//
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
//                    " (name TEXT, phone INTEGER, email TEST)");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jimmy', 23423423, 'jason@email.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jeff', 44444, 'jeff@email.com')");
//
//            statement.execute("UPDATE contacts SET phone=1234455 WHERE name='Jimmy'");
//            statement.execute("DELETE FROM contacts WHERE name='Jimmy'");

            // Ways to query are:

            // Using execute query
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

            // OR EASIER TO USE

            // .executeQuery
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();

        } catch(SQLException e) {
            System.out.println("Something went wrong with DB connection: " + e.getMessage());
        }
    }
}
