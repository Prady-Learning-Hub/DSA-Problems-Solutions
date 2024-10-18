package LeetCodeLinkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    @DisplayName("Add node at head")
    void addAtHead() {
        MyLinkedList objLinkedList = new MyLinkedList();
        objLinkedList.addAtHead(10);//10
        objLinkedList.addAtHead(20);//20->10
        assertAll(() -> assertEquals(20, objLinkedList.get(0)),
                () -> assertEquals(10, objLinkedList.get(1)));
    }

    @Test
    @DisplayName("Add node at tail")
    void addAtTail() {
        MyLinkedList objLinkedList = new MyLinkedList();
        objLinkedList.addAtTail(10);//10
        objLinkedList.addAtTail(20);//10->20
        assertAll(() -> assertEquals(10, objLinkedList.get(0)),
                () -> assertEquals(20, objLinkedList.get(1)));
    }

    @Test
    @DisplayName("Add node at Index")
    void addAtIndex() {
        MyLinkedList objLinkedList = new MyLinkedList();
        objLinkedList.addAtIndex(0,10);//10
        objLinkedList.addAtIndex(0,20);//20->10
        objLinkedList.addAtIndex(1,15);//20->15->10
        assertAll(() -> assertEquals(20, objLinkedList.get(0)),
                () -> assertEquals(15, objLinkedList.get(1)),
                () -> assertEquals(10, objLinkedList.get(2)));
    }

    @Test
    @DisplayName("Get node at Index")
    void get() {
    }

    @Test
    @DisplayName("Delete node at Index")
    void deleteAtIndex() {
        MyLinkedList objLinkedList = new MyLinkedList();
        objLinkedList.addAtIndex(0,10);//10
        objLinkedList.addAtIndex(0,20);//20->10
        objLinkedList.addAtIndex(1,15);//20->15->10
        assertAll(() -> assertEquals(20, objLinkedList.get(0)),
                () -> assertEquals(15, objLinkedList.get(1)),
                () -> assertEquals(10, objLinkedList.get(2)));

        objLinkedList.deleteAtIndex(0);//15->10
        assertAll(() -> assertEquals(15, objLinkedList.get(0)),
                () -> assertEquals(10, objLinkedList.get(1)));
    }
}