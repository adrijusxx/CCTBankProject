/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCTBankProject;

import java.sql.Date;

/**
 *
 * @author User
 */
class Transactions {


    public int TransId;
    public java.util.Date Date;
    public String Description;
    public int Credit;
    public int Debit;
    public int Balance;
    public int AccountNumber;

    public int getTransId() {
        return TransId;
    }

    public void setTransId(int TransId) {
        this.TransId = TransId;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int Credit) {
        this.Credit = Credit;
    }

    public int getDebit() {
        return Debit;
    }

    public void setDebit(int Debit) {
        this.Debit = Debit;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

}
