package org.yvasylchuk.t7_tempalateMethod;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BankAccount {
    private String iban;
    private String customer;
    private BigDecimal balance;
    private LocalDate expirationDate;

    public BankAccount(String iban, String customer, BigDecimal balance, LocalDate expirationDate) {
        this.iban = iban;
        this.customer = customer;
        this.balance = balance;
        this.expirationDate = expirationDate;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
