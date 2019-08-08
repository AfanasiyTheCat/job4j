package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BankTest {
    @Test
    public void whenAddAccount() {
        Bank bank = new Bank();
        User user = new User("Nikita", "7115");
        Account account = new Account(100d, "1111");
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        assertThat(bank.getUserAccounts(user.getPassport()).get(0), is(account));
    }
    @Test
    public void whenRemoveAccount() {
        Bank bank = new Bank();
        User user = new User("Nikita", "7115");
        Account account = new Account(100d, "1111");
        Account account2 = new Account(101d, "2211");
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(user.getPassport(), account2);
        bank.deleteAccountFromUser(user.getPassport(), account2);
        assertThat(bank.getUserAccounts(user.getPassport()).size(), is(1));
    }
    @Test
    public void whenTransferMoney() {
        Bank bank = new Bank();
        User user = new User("Nikita", "7115");
        User user2 = new User("Alex", "6298");
        Account account = new Account(100d, "1111");
        Account account2 = new Account(200d, "2222");
        bank.addUser(user);
        bank.addUser(user2);
        bank.addAccountToUser(user.getPassport(), account);
        bank.addAccountToUser(user2.getPassport(), account2);
        bank.transferMoney(user.getPassport(), account.getRequisites(), user2.getPassport(), account2.getRequisites(), 50d);
        assertThat(bank.getUserAccounts(user.getPassport()).get(0).getValue(), is(50d));
    }
}
