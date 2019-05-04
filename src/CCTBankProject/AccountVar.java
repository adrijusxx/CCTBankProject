/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCTBankProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
class AccountVar {

    private String firstname, lastname, email, phone, address, city;
    private int id, accountnumber, sortcode, balance, overdraft;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getSortcode() {
        return sortcode;
    }

    public void setSortcode(int sortcode) {
        this.sortcode = sortcode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public void getaccountdata(AccountVar acc) throws Exception {

        Connection dbConnection = DBMethods.getConnection();
        PreparedStatement preparedStatement = null;
        String query1 = "select * FROM newacc WHERE id = ?";
        //String selectSQL = "select * FROM account WHERE id = ?";

        try {
            //dbConnection = DBMethods.getConnection();
            preparedStatement = dbConnection.prepareStatement(query1);
            preparedStatement.setInt(1, acc.id);

            // execute select SQL stetement
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                acc.id = rs.getInt(1);
                acc.firstname = rs.getString(2);
                acc.lastname = rs.getString(3);
                acc.email = rs.getString(4);
                acc.phone = rs.getString(5);
                acc.address = rs.getString(6);
                acc.city = rs.getString(7);
                acc.accountnumber = rs.getInt(8);
                acc.sortcode = rs.getInt(9);
                acc.balance = rs.getInt(10);
                acc.overdraft = rs.getInt(11);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        // dbConnection.close();   
    }

}
