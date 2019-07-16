package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void SqMaxTest(){
        SqMax check = new SqMax();
        assertThat(check.max(4,2,1,3),is(4));
    }
}
