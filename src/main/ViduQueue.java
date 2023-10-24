package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ViduQueue {
  public static void main(String[] args) {
	Queue<String> danhsach = new LinkedList<String>();
	
	danhsach.offer("Nguyen van A");
	danhsach.offer("Nguyen van B");
	danhsach.offer("Nguyen van C");
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
