package ru.job4j.bank;

public class Account {
    private double value;
    private String requisites;

    public Account(double value, String requisites) {
        this.requisites = requisites;
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public double getValue() {
        return value;
    }

    public void putMoney(double amount) {
        this.value += amount;
    }

    public void takeMoney(double amount) {
        if (value > amount) {
            this.value -= amount;
        }
    }

    public boolean transfer(Account account, double amount) {
        boolean result = false;
        if (account != null) {
            if (this.value > amount) {
                this.takeMoney(amount);
                account.putMoney(amount);
                result = true;
            }
        }
        return result;
    }
}
