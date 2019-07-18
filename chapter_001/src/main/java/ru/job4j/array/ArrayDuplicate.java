package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Nikita Shvetsov
 * @version 1.0v
 * @since 18.07.2019
 */

public class ArrayDuplicate {
    /**
     *
     * @param data - массив для проверки на дубликат
     * @return - массив без дубликатов
     */
    public String[] cut(String[] data){
        int count = 0;
        int duplicates = 0;
        for (int i = 1; i < data.length; i++){
            boolean flag = true;
            for (int j = 0; j != 1+count; j++){
                if (data[j].equals(data[1+count])){
                    flag = false;
                    if (i != data.length - 1) {
                        String x = data[1 + count];
                        duplicates++;
                        data[1 + count] = data[1 + count + duplicates];
                        data[1 + count + duplicates] = x;
                        break;
                    }
                }
            }
            if (flag){
                count++;
            }
        }
        return Arrays.copyOf(data,count+1);
    }
}
