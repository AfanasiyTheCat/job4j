package ru.job4j.bank;

import java.util.*;

public class Bank {
    private Map<User, List<Account>> list = new HashMap<>();

    public void addUser(User user) {
        list.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(User user) {
        list.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        User user = getUserByPassport(passport);
        if (user != null){
            list.get(user).add(account);
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        User user = getUserByPassport(passport);
        if (user != null){
            list.get(user).remove(account);
        }
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> result = null;
        User user = getUserByPassport(passport);
        if (user != null){
            result = list.get(user);
        }
        return result;
    }

    public boolean transferMoney(String srcPassport,
                                 String srcRequisite,
                                 String dstPassport,
                                 String dstRequisite,
                                 double amount) {
        boolean result = false;
        Account srcAccount = getAccountByPassNReq(srcPassport, srcRequisite);
        Account dstAccount = getAccountByPassNReq(dstPassport, dstRequisite);
        if (srcAccount != null) {
            result = srcAccount.transfer(dstAccount, amount);
        }
        return result;
    }

    private User getUserByPassport(String passport) {
        User result = null;
        User[] users = new User[list.size()];
        users = list.keySet().toArray(users);
        for (User user : users) {
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }

    private Account getAccountByRequisite(User user, String requisite) {
        Account result = null;
        List<Account> accounts = list.get(user);
        for (int i = 0; i < list.size(); i++) {
            if (accounts.get(i).getRequisites().equals(requisite)) {
                result = accounts.get(i);
                break;
            }
        }
        return result;
    }

    private Account getAccountByPassNReq(String passport, String requisite) {
        Account result = null;
        User user = getUserByPassport(passport);
        if (user != null) {
            Account account = getAccountByRequisite(user, requisite);
            result = account;
        }
        return result;
    }
}
