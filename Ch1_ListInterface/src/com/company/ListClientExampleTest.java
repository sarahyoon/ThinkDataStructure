package com.company;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class ListClientExampleTest {

    @Test
    public void testListClientExample(){
        ListClientExample listClientExample = new ListClientExample();
        List list = listClientExample.getList();
        assertThat(list, instanceOf(ArrayList.class));

    }


}
