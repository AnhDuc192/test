package main;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class viduPriorityQueue {
public static void main(String[] args) {
	List<String> s=  new LinkedList<String>();
	LinkedList<Integer> t = new LinkedList<>();
Queue<String> danhsach = new PriorityQueue<String>();
	
	danhsach.offer("Nguyen van A");
	
	danhsach.offer("Nguyen van C");
	danhsach.offer("Nguyen van B");
	danhsach.offer("Nguyen van D");
   
	while(true) {
		String ten = danhsach.poll();
				// peek : lấy ra nhưng không xóa
                // poll lấy ra và xóa   
		if( ten == null) break;
		else System.out.println(ten);
		
		
	}
}
}
