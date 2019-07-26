package ru.job4j.pseudo;

public class Square implements Shape {

    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("#####\n");
        sb.append("#   #\n");
        sb.append("#   #\n");
        sb.append("#####\n");
        return sb.toString();
    }
}
