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
    public void reserveListTest() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));


        ListNode expected = new ListNode(5,
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(1)))));
        ListNode actual = listTest.reverseList(head);
        while (expected.next != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}