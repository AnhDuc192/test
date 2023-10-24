package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class viduDeQueue {
public static void main(String[] args) {
	Deque<String> ds = new ArrayDeque<String>();
	
	ds.offerFirst("he lo la");
	ds.offer("proneverfake");
	ds.offerFirst("legend");
	ds.offerLast("leaker");
	ds.offer("love you");
	
	while(true) {
		String ten = ds.poll();
		if( ten == null)break;
		else System.out.println(ten);
	}
}
}
