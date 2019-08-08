package ru.job4j.bank;

public class User {
    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName(){
        return name;
    }
    public String getPassport(){
        return passport;
    }

    public boolean equals(Object o) {
        boolean result = false;
        if (o != null) {
            if (o.getClass() == this.getClass()) {
                User user = (User) o;
                if (user.getName() == this.getName()
                && user.getPassport() == this.getPassport()) {
                    result = true;
                }
            }
        }
        return result;
    }

    public int hashCode() {
        return passport.hashCode();
    }
}
