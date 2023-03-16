package HomeworkTest;

import Homework.ListNode;
import Homework.ReverseLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {
ReverseLinkedList listTest;

    @Before
    public void init() {
        listTest = new ReverseLinkedList();
    }

    @Test
    public void reverseList_WithEmptyList_Test() {
        ListNode head = null;
        ListNode expected = null;
        ListNode actual = listTest.reverseList(head);
        assertEquals(expected, actual);
    }
}