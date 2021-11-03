package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    /*
    * Test class to run junit test
    * */
    @Test
    public void given3NumbersWhereLinkedListIsSearchedAndDeletedShouldPassLinkedListTest(){
        MyNode<Integer>  myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer>  myThirdNode = new MyNode(70);
        MyNode<Integer>  myForthNode = new MyNode(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.searchAndInsert(mySecondNode,myForthNode);

        myLinkedList.printNodes();
        myLinkedList.delete(myForthNode);
        System.out.print("LinkedList after deleting element 40 is : ");
        myLinkedList.printNodes();
        System.out.print("Size of linkedList is: ");
        myLinkedList.size(myThirdNode);

        Boolean result =  myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
