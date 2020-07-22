/**
 * 2020/07/21
 * Exercise in creating the nodes and edge links for the graph.
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;
public class Graph {
	HashMap <String, ArrayList<String>> vertex = new HashMap<String, ArrayList<String>>();
	
	public Graph(String[] nodes) {
		for(String node: nodes) {
			vertex.put(node, new ArrayList<String>());
		}
	}
	public void addEdge(String v, String w) {
		vertex.get(v).add(w);
		vertex.get(w).add(v);
		
	}
	public ArrayList<String> getNext(String node){
		return vertex.get(node);
	}
}
