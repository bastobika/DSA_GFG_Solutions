package BinaryHeap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeCharacters {

	static class Element implements Comparable<Element>{
        char element;
        int frequency;
        
        Element(char e,int f) {
            this.element = e;
            this.frequency = f;
        }
        
        @Override
        public int compareTo(Element e) {
            if(this.frequency > e.frequency)
                return 1;
            return -1;
        }
        
    }
    
    static String rearrangeCharacters(String str) {
        PriorityQueue<Element> pq = new PriorityQueue<Element>(Collections.reverseOrder());
        int count[] = new int[26];
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)-'a']++;
        for(int i=0;i<26;i++)
            if(count[i] > 0) pq.add(new Element((char)(i+'a'),count[i]));
        Element curr = null;
        Element prev = null;
        StringBuffer result = new StringBuffer();
        while(!pq.isEmpty()){
            curr = pq.poll();
            result.append(curr.element);
            if(prev != null && prev.frequency > 0)
                pq.add(prev);
            curr.frequency--;
            prev = curr;
        }
        return result.toString();
	}
    
	public static void main(String[] args) {
		System.out.println("Rearrange characters of string");
	}

}
