package Linked_List;

import java.util.HashMap;
import java.util.Map;

//Remove Duplicates from an Unsorted LL
public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

public class RemoveDuplicates {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
    // Your code goes here
    Map<Integer, Integer> map = new HashMap<>();
    ListNode prev = null, node = head;
    while (node != null) {
      int val = node.val;
      map.put(val, map.getOrDefault(val, 0) + 1);
      node = node.next;
    }
    node = head;
    while (node != null) {
      if (map.get(node.val) > 1) {
        if (node == head) head = head.next;
        else prev.next = node.next;
        node=node.next;
      }
      else{
        prev=node; node = node.next;
      }
      
    }
    return head;
  }
}
}
