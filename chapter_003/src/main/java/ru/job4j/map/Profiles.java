package ru.job4j.map;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public  List<Address> collect(List<Profile> profiles) {
        List<Address> result =  profiles.stream().sorted(new Comparator<Profile>() {
            @Override
            public int compare(Profile o1, Profile o2) {
                return o1.toString().compareTo(o2.toString());
            }
        }).distinct().map(Profile::getAddress).collect(Collectors.toList());
        return result;
    }
}
