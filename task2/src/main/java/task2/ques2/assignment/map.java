package task2.ques2.assignment;


import java.util.HashMap;
import java.util.Map;

public class map {

	private HashMap<String, String> map = new HashMap<>();
	
	public map(HashMap<String, String> map){
		this.map = map;
	}
	
	public void print() {
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
