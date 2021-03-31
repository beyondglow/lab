package com.yifeng.lab.leetcode;

import java.util.ArrayList;
import java.util.List;


class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
	
}




public class TwoSumPlus {

	public static void main(String[] args) {
		ListNode node = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		node.next = node2;
		node2.next = node3;
		node3.next = null;
		
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		
/*		List<Integer> list1 = new ArrayList<Integer>();
		while(node != null){
			list1.add(node.val);
			node = node.next;
		}
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		while(node4 != null){
			list2.add(node4.val);
			node4 = node4.next;
		}
		System.out.println(list2);*/
		/*ListNode tnode = new ListNode(0);
		while(node != null){
			if (node4 != null) {
				int sum = node.val+node4.val;
				node.val=sum%10;
				if (sum>9 && node.next != null) {
					node.next.val++;
				}
				node4 = node4.next;
			}
			tnode = node.next;
			if (node == null) {
				node = node4;
				node4 = null;
			}
		}*/
		
		/*List<Integer> list3 = new ArrayList<Integer>();
		while(mergeNode != null){
			list3.add(mergeNode.val);
			mergeNode = mergeNode.next;
		}
		System.out.println(list3);*/
		/*ListNode addTwoNumbers = addTwoNumbers(node, node4);
		List<Integer> list3 = new ArrayList<Integer>();
		while(addTwoNumbers != null){
			list3.add(addTwoNumbers.val);
			addTwoNumbers = addTwoNumbers.next;
		}
		System.out.println(list3);*/
		ListNode temp = new ListNode(0);
		ListNode lr = recursive(node,temp);
		
		List<Integer> list4 = new ArrayList<Integer>();
		while(lr != null){
			list4.add(lr.val);
			lr = lr.next;
		}
		System.out.println(list4);
	}
	
	
   /* public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int carry = 0;
    	ListNode head = new ListNode(-1);
    	ListNode temp = new ListNode(l1.val);
    	ListNode lr = recursive(l1);
    	while (l1 != null) {
    		int sum = (l1==null ? 0:l1.val)+(l2==null ? 0:l2.val);
    		int hz = sum + carry;
    		temp.val=hz%10;
			if (hz>9) {
				carry = 1;
			} else {
				carry = 0;
			}
			head.next = temp;
			if (l1.next == null && l2.next != null) {
				l1.next = l2.next;
			}
			l1 = l1.next;
		}
    	
    	return l1;
    }*/
    
    public static ListNode recursive(ListNode listNode, ListNode temp) {
    	
    	if (listNode != null) {
    		ListNode memo = listNode;
    		listNode.next = temp.next;
    		listNode = memo;
    		temp.next = recursive(listNode.next, temp.next);
    	}
    	return temp;
    }
}
