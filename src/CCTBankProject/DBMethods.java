/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCTBankProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static CCTBankProject.DBMethods.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DBMethods {

    static public Connection connection;

    public static Connection getConnection() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cctbank", "root", "");

        }
        return connection;
    }

    public static void createAccount(AccountVar account) throws Exception {
        PreparedStatement preparedStmt = null;
        Connection conn = DBMethods.getConnection();
        String query = ("INSERT INTO newacc (firstname,lastname,email,phone,address,city,accountnumber,sortcode,balance,overdraft) VALUES (?,?,?,?,?,?,?,?,?,?)");

        try {
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, account.getFirstname());
            preparedStmt.setString(2, account.getLastname());
            preparedStmt.setString(3, account.getEmail());
            preparedStmt.setString(4, account.getPhone());
            preparedStmt.setString(5, account.getAddress());
            preparedStmt.setString(6, account.getCity());
            preparedStmt.setInt(7, account.getAccountnumber());
            preparedStmt.setInt(8, account.getSortcode());
            preparedStmt.setInt(9, account.getBalance());
            preparedStmt.setInt(10, account.getOverdraft());

            preparedStmt.execute();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public void getaccountdata(AccountVar acc) throws Exception {

        Connection dbConnection = DBMethods.getConnection();
        PreparedStatement preparedStatement = null;

        String selectSQL = "select * FROM account WHERE id = ?";

        try {
            //dbConnection = DBMethods.getConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, acc.getId());

            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                rs.getInt(acc.getId());
                rs.getString(acc.getFirstname());
                rs.getString(acc.getLastname());
                rs.getString(acc.getEmail());
                rs.getString(acc.getPhone());
                rs.getString(acc.getAddress());
                rs.getString(acc.getCity());
                rs.getInt(acc.getAccountnumber());
                rs.getInt(acc.getSortcode());
                rs.getInt(acc.getBalance());
                rs.getInt(acc.getOverdraft());

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        // dbConnection.close();   
    }

    public static void withdrawupdate(int id, int initialbalance) throws Exception {
        try {

            Connection con = getConnection();

            // the mysql update statement
            String query = "UPDATE newacc set balance = ? where id = ?";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, initialbalance);
            preparedStmt.setInt(2, id); // must follow order of query string
            // execute the preparedstatement
            preparedStmt.executeUpdate(); //exectueUpdate used for manipulating information

            // con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            //  JOptionPane.showMessageDialog(null, "Record " +Account.getaccountid()+ "Updated");
        }
    }

    public static void depositupdate(int id, int initialbalance) throws Exception {
        try {

            Connection con = getConnection();

            // the mysql update statement
            String query = "UPDATE newacc set balance = ? where id = ?";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, initialbalance);
            preparedStmt.setInt(2, id); // must follow order of query string
            // execute the preparedstatement
            preparedStmt.executeUpdate(); //exectueUpdate used for manipulating information

            // con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            //  JOptionPane.showMessageDialog(null, "Record " +Account.getaccountid()+ "Updated");
        }
    }

    public static void updatetransaction1(Transactions trans) throws Exception {
        try {

            Connection con = getConnection();

            // the mysql insert statement
            String query
                    = " insert into transactions (accountnumber,description,credit,debit,balance)"
                    + " values (?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, trans.getAccountNumber());
            preparedStmt.setString(2, trans.getDescription()); // must follow order of query string
            preparedStmt.setInt(3, 0);
            preparedStmt.setInt(4, trans.getDebit());
            preparedStmt.setInt(5, trans.getBalance());
            // execute the preparedstatement
            preparedStmt.execute(); //exectueUpdate used for manipulating information

            // con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            //  JOptionPane.showMessageDialog(null, "Record " +Account.getaccountid()+ "Updated");
        }
    }

    public static void updatetransaction2(Transactions trans) throws Exception {
        try {

            Connection con = getConnection();

            // the mysql insert statement
            String query
                    = " insert into transactions (accountnumber,description,credit,debit,balance)"
                    + " values (?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, trans.getAccountNumber());
            preparedStmt.setString(2, trans.getDescription()); // must follow order of query string
            preparedStmt.setInt(3, trans.getCredit());
            preparedStmt.setInt(4, 0);
            preparedStmt.setInt(5, trans.getBalance());
            // execute the preparedstatement
            preparedStmt.execute(); //exectueUpdate used for manipulating information

            // con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            //  JOptionPane.showMessageDialog(null, "Record " +Account.getaccountid()+ "Updated");
        }
    }

    public static void editAccount(AccountVar account) throws Exception {
        PreparedStatement preparedStmt = null;
        Connection conn = DBMethods.getConnection();
        //String query = ("INSERT INTO newacc (firstname,lastname,email,phone,address,city,accountnumber,sortcode,balance,overdraft) VALUES (?,?,?,?,?,?,?,?,?,?)");
        String query = ("UPDATE newacc SET firstname = ?, lastname = ?, email = ?, phone = ?, address = ?, city = ? WHERE id = ?");

        try {
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, account.getFirstname());
            preparedStmt.setString(2, account.getLastname());
            preparedStmt.setString(3, account.getEmail());
            preparedStmt.setString(4, account.getPhone());
            preparedStmt.setString(5, account.getAddress());
            preparedStmt.setString(6, account.getCity());
            preparedStmt.setInt(7, account.getId());
            preparedStmt.execute();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void Login(String username, String password) throws Exception {
        Connection conn = DBMethods.getConnection();
        if (username != null) {
            String query = "Select * from accdata Where username = ? and password = ?";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                new Frame_Accounts().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                Frame_Login newFrame = new Frame_Login();
                newFrame.setVisible(true);
            }
        }
    }

    public static void transferFunds(AccountVar account, int receivernum, double receivertransfer) throws Exception {
        PreparedStatement statement1 = null;
        PreparedStatement statement2 = null;
        Connection conn = DBMethods.getConnection();
        String query1 = ("UPDATE newacc SET balance = ? WHERE accountnumber = ?");
        String query2 = ("UPDATE newacc SET balance = balance + ? WHERE accountnumber = ?");

        try {

            statement1 = conn.prepareStatement(query1);
            statement2 = conn.prepareStatement(query2);

            statement1.setDouble(1, (account.getBalance() - receivertransfer));
            statement1.setInt(2, (account.getAccountnumber()));
            statement1.executeUpdate();

            statement2.setDouble(1, receivertransfer);
            statement2.setInt(2, receivernum);
            statement2.executeUpdate();
        } catch (NumberFormatException ex) {
            System.out.println(ex);

        }
    }

    public static void DeleteAccount(int id) throws Exception {
        try {

            Connection con = getConnection();
            String query = "Delete from newacc where id = ?";
            PreparedStatement preparedStat = con.prepareStatement(query);
            preparedStat.setInt(1, id);
            preparedStat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Account deleted by ID: " + id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
