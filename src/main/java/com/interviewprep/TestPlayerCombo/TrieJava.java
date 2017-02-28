package com.interviewprep.TestPlayerCombo;

import static org.mockito.Matchers.anyMap;

import java.util.HashMap;
import java.util.Map;

public class TrieJava {
	TrieNode root = null;
	TrieJava(){
		root = new TrieNode();
	}
	public static void main(String[] args) {
		TrieJava trieJava = new TrieJava();
		trieJava.insert("leetcode");
		trieJava.insert("leets");
		System.out.println(trieJava.search("leetcode"));
		//System.out.println(trieJava.searchPrefix("lee"));
	}
	
	public void insert(String word){
		Map<Character,TrieNode> children = root.children;
		TrieNode t;
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			if(children == null ){
				t = new TrieNode(c);
				children.put(c, t);
			}else{
				if(children.containsKey(c)){
					t = children.get(c);
				}else{
					t = new TrieNode(c);
					children.put(c, t);
				}				
			}
			children = t.children;
			if(i == word.length()-1) t.isEnd = true;
		}
	}
	
	public TrieNode searchNode(String word){
		TrieNode t = null;
		Map<Character,TrieNode> children = root.children;
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			if(children.containsKey(c)){
				t = children.get(c);
				children = t.children;	
				System.out.println("***************");
				for(Map.Entry<Character, TrieNode> child:children.entrySet()){
					System.out.format("Key, Value :: %s,%s",child.getKey(), child.getValue());
					
				}
				System.out.println(t.children.toString());
				System.out.println("***************");
			}else{
				return null;
			}
		}
		return t;
	}
	
	public boolean search(String word){
		TrieNode t = searchNode(word);
		if(t==null) return false;
		if(t!=null && t.isEnd == true) return true;
		return false;

	}
	
	public boolean searchPrefix(String prefix){
		TrieNode t = searchNode(prefix);
		if(t==null) return false;
		else return true;
	}
	

}

class TrieNode{
	public TrieNode(char c) {
		this.c = c;
		this.children= new HashMap<>();
	}
	
	public TrieNode(){
		this.children = new HashMap<>();
	}
	char c;
	Map<Character,TrieNode> children;
	boolean isEnd;
	@Override
	public String toString() {
		return "TrieNode [c=" + c + ", children=" + children + ", isEnd=" + isEnd + "]";
	}
	
}
