package week_3.heogeonho;

import java.util.*;
import java.io.*;

public class PGS_더맵게 {
	public static void main(String[] args) {

	}

	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int cnt=0;

		for(int i=0; i<scoville.length; i++) {
			pq.offer(scoville[i]);
		}

		while(pq.peek()<K) {
			if(pq.size()==1){
				return -1;
			}
			int a=pq.poll();
			int b=pq.poll();
			pq.offer(a+(b*2));
			cnt++;
		}

		return cnt;
	}
}