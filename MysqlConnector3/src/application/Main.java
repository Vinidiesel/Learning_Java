package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement st = null;
        try {
            connection = DB.getConnection();

            st = connection.prepareStatement(
                    "delete from department "
                    + "where "
                    + "Id = ?"
            );

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}