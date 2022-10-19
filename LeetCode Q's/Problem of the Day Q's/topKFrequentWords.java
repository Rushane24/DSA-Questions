package POD_Qs;
import java.util.*;
import java.util.Map.Entry;

public class topKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
    	//Initialize a Map inorder to get the Frequencies
    	Map<String, Integer> map = new HashMap<>();
    	
    	//Loop over all of our words
    	for(String word: words) {
    		/*If we know the value is already in there we know we can take that value
    		and append to 1, but if the element is not there we need to default it to 0, 
    	 	and 1 as well.  */
    		map.put(word, map.getOrDefault(word, 0)+1); // This will handle both cases whether the word in there or not in there.
    		}
    	//We have Initialized our Map and got all of our Frequencies.
    	
    	//Initialize Priority Queue and create custom Comparator class.
    	PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>() {
    		@Override
    		/* Initialied the PriorityQueue and its just going to be storing Strings
    		 * we need to sort these String with lesser frequencies and
    		 * if these frequencies are the same we sort them by greater alphabetical Order 
    		 */
			public int compare(String word1, String word2) {
				// TODO Auto-generated method stub
    			int freq1=map.get(word1);
    			int freq2=map.get(word2);
    			if(freq1==freq2) {
    				return word2.compareTo(word1);
    			}
				return freq1-freq2;
			}
    		
    	});
    	for(Map.Entry<String, Integer> entry:map.entrySet()) {
    		pq.add(entry.getKey());
    		if(pq.size()>k) pq.poll();
    	}
    	List<String> result = new ArrayList<>();
    	while(!pq.isEmpty()) {
    		result.add(pq.poll());
    	}
    	Collections.reverse(result);
		return result;
        
    }
}
