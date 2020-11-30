package com.company;

import java.sql.*;

public class BetterTestDB {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECT_STRING = "jdbc:sqlite:G:\\dev\\java\\databases\\sqlite\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    BetterTestDB() {
        try {
            Connection conn = DriverManager.getConnection(CONNECT_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");
            insertContact(statement,"Jason Reezy", 234522, "Jason@email.com");
            insertContact(statement,"Jeff McDeezy", 23423, "jeff@email.com");
            insertContact(statement,"Jimmy Eazy", 5345346, "Jimmy@email.com");
            insertContact(statement,"Delete Meezy", 3333, "DELETE@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_NAME +"='Jimmy Butler' WHERE " + COLUMN_EMAIL + "='Jimmy@email.com'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_EMAIL + "='DELETE@email.com'");

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

    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone +", '" + email +"')");
    }
}
