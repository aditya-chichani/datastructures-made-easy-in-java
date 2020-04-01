/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter03linkedlists;

public class ExchangeAdjacentNodes {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for(int i =1; i<6;i++)
            linkedList.insertAtEnd(new ListNode(i));
        System.out.println(linkedList);
        linkedList.head = exchangeAdjacentNodes(linkedList.head);
        System.out.println(linkedList);

    }
    public static ListNode exchangeAdjacentNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode t0 = temp, t1 = head;
        while(t1 != null && t1.next != null){
            ListNode t2 = t1.next;
            ListNode t3 = t2.next;

            t2.next = t1;
            t1.next = t3;
            t0.next = t2;

            t0 = t1;
            t1 = t3;
        }
        return temp.next;
    }

    public ListNode exchangeOriginalAdjacentNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp, curr = head;
        while(curr != null && curr.next != null){
            ListNode tmp = curr.next.next;
            curr.next.next = prev.next;
            prev.next = curr.next;
            curr.next = tmp;
            prev = curr;
            curr = prev.next;
        }
        return temp.next;
    }
}
