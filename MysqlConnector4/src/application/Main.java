package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement st = null;
        try {
            connection = DB.getConnection();

            connection.setAutoCommit(false);

            st = connection.createStatement();

            int rows1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");

            /*
            int x = 1;
            if (x < 2){
                throw new SQLException("Fake error");
            }
            */

            int rows2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");

            connection.commit();

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}