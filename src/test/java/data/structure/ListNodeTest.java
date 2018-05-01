package data.structure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ListNodeTest {
    private ListNode listNode;

    @Before
    public void setUp() {
        listNode = new ListNode(1);
    }

    @Test
    public void hasNext() {
        assertThat(listNode.hasNext(), is(false));
    }

    @Test
    public void getData() {
        assertThat(listNode.getData(), is(1));
    }
}
