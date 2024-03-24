package task1.ques1.assignment;

import java.util.*;

public class map {

	private HashMap<String, String> map = new HashMap<>();
	
	public map(HashMap<String, String> map){
		this.map = map;
	}
	
	public void print() 
	{

		for(Map.Entry<String, String> i : map.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}
}

