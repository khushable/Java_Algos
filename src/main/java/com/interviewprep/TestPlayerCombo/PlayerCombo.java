package com.interviewprep.TestPlayerCombo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class PlayerCombo {
	static Map<String,LinkedList<List<Player>>> playerTypeMap = new HashMap();
	
	public static void comboPlayers(){
		String sArray[] = new String []{"Apple", "Orange", "Pineapple", "Banana"};
		String tArray[] = new String[]{"Carrot","Ginger","Spinach","Avocado"};
		String uArray[] = new String[]{"Rice","Wheat","Corn","Sorghum"};
		String vArray[] = new String[]{"Chicken","Fish","Egg","Crab"};
	    //convert array to list
	    List<String> list1 = Arrays.asList(sArray);
	    List<String> list2 = Arrays.asList(tArray);
	    List<String> list3 = Arrays.asList(uArray);
	    List<String> list4 = Arrays.asList(vArray);
	    
	    LinkedList<List <String>> lists = new LinkedList<List <String>>();

	    lists.add(list1);
	    lists.add(list2);
	    lists.add(list3);
	    lists.add(list4);	    

	    Set<String> combinations = new TreeSet<String>();
	    Set<String> newCombinations;

	    for (String s: lists.removeFirst())
	        combinations.add(s);

	    while (!lists.isEmpty()) {
	        List<String> next = lists.removeFirst();
	        newCombinations =  new TreeSet<String>();
	        for (String s1: combinations) 
	            for (String s2 : next) 
	              newCombinations.add(s1 + ","+s2);               

	        combinations = newCombinations;
	    }
	    for (String s: combinations)
	        System.out.print(s+" ");  		
	}
	
	public static void comboPlayerGroups(){
/*		String sArray[] = new String []{"Apple", "Orange", "Pineapple", "Banana"};
		String tArray[] = new String[]{"Carrot","Ginger","Spinach","Avocado"};
		String uArray[] = new String[]{"Rice","Wheat","Corn","Sorghum"};
		String vArray[] = new String[]{"Chicken","Fish","Egg","Crab"};
	    //convert array to list
	    List<String> list1 = Arrays.asList(sArray);
	    List<String> list2 = Arrays.asList(tArray);
	    List<String> list3 = Arrays.asList(uArray);
	    List<String> list4 = Arrays.asList(vArray);
*/	    
//	    List<List<List <Player>>> lists = new LinkedList();
//
//	    lists.add(playerTypeMap.get("PG"));
//	    lists.add(playerTypeMap.get("SG"));
//	    lists.add(playerTypeMap.get("SF"));
//	    lists.add(playerTypeMap.get("PF"));	 
	    
	    

	    LinkedList<List<Player>> combinations = new LinkedList<>();
	    LinkedList<List<Player>> newCombinations=null;

	    //Add the first list to the combinations set
	    for(Map.Entry<String, LinkedList<List<Player>>> entry:playerTypeMap.entrySet()){
	    	List<List<Player>> entryList = entry.getValue();
	    	for(List<Player> playerList:entryList){
	    		combinations.add(playerList);
	    	}
	    	playerTypeMap.remove(entry.getKey());
	    	break;
	    }

	    //Add the remaining lits to the combinations set
	    for(Map.Entry<String, LinkedList<List<Player>>> entry:playerTypeMap.entrySet()){
	    	//List<Player> entryList = entry.getValue().removeFirst();
	    	for(List<Player> player:combinations)
	    		for(Player entryPlayer : entry.getValue().removeFirst())
	    		
	    	
	    	combinations = newCombinations;
	    }
	    System.out.println("Combinations-"+combinations.toString());
    Set<Player> playSet = null;
	    
	    //Remove duplicates
	    List<Set<Player>> uniquePlayerCombo = new LinkedList<>();
	    for(List<Player> playList:combinations){
    		playSet = new HashSet<>();
	    	for(Player playr:playList){
	    		playSet.add(playr);
	    	}
	    	uniquePlayerCombo.add(playSet);
	    	//combinations.remove(playList);
	    }
	    System.out.println("Unique Combos!! "+uniquePlayerCombo.toString());
	}
	
	public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub
		//comboPlayers();
		String[] playerTypes = {};
		createComboList();
		comboPlayerGroups();
		System.exit(0);
	}
	
	public static Map<String,LinkedList<List<Player>>> createComboList() throws JsonProcessingException, IOException{
		/*
		 * Create list of PGs, SGs,SFs, PFs and C
		 */
		List<List<Player>> PGList = new ArrayList<List<Player>>();
		List<Player> pgPlayerList = new ArrayList();
		List<Player> sgPlayerList = new ArrayList();
		List<Player> sfPlayerList = new ArrayList();
		List<Player> pfPlayerList = new ArrayList();
		List<Player> cPlayerList = new ArrayList();

		try{
			File csvFile = new File("C:\\Users\\masha\\Documents\\Players\\Players.csv"); // or from String, URL etc
			CsvMapper mapper = new CsvMapper();
			CsvSchema schema = CsvSchema.emptySchema().withHeader(); // use first row as header; otherwise defaults are fine
			MappingIterator<Map<String,String>> it = mapper.readerFor(Map.class)
			   .with(schema)
			   .readValues(csvFile);
			while (it.hasNext()) {
			  Map<String,String> rowAsMap = it.next();
			  switch (rowAsMap.get("pos")) {
			case "PG":
				  pgPlayerList.add(new Player(rowAsMap.get("player"), rowAsMap.get("salary"), rowAsMap.get("fpts"),rowAsMap.get("pos")));				
				break;
			case "SG":
					sgPlayerList.add(new Player(rowAsMap.get("player"), rowAsMap.get("salary"), rowAsMap.get("fpts"),rowAsMap.get("pos")));								
				break;
			case "SF":
					sfPlayerList.add(new Player(rowAsMap.get("player"), rowAsMap.get("salary"), rowAsMap.get("fpts"),rowAsMap.get("pos")));			
				break;
			case "PF":
					pfPlayerList.add(new Player(rowAsMap.get("player"), rowAsMap.get("salary"), rowAsMap.get("fpts"),rowAsMap.get("pos")));			
				break;
			case "C":
					cPlayerList.add(new Player(rowAsMap.get("player"), rowAsMap.get("salary"), rowAsMap.get("fpts"),rowAsMap.get("pos")));			
				break;
			default:
				break;
			}
			  // access by column name, as defined in the header row...
			}//end while
			playerTypeMap.put("PG", createPlayerTypeComboList(pgPlayerList));
			playerTypeMap.put("SG", createPlayerTypeComboList(sgPlayerList));
			//playerTypeMap.put("PF", createPlayerTypeComboList(pfPlayerList));
			//playerTypeMap.put("SF",createPlayerTypeComboList(sfPlayerList));
			//playerTypeMap.put("C", createPlayerTypeComboList(cPlayerList));
			
		}catch(Exception e){
			
		}finally{
			
		}
		return playerTypeMap;
	}
	private static LinkedList<List<Player>> createPlayerTypeComboList(List<Player> playerList) {
		LinkedList<List<Player>> PGList = new LinkedList<>();
		int min = 0;
		for(int i = min;i<playerList.size();i++){
			Double iFpts = Double.parseDouble(playerList.get(i).getFpts());
			if(iFpts > 40){
				for(int j=i+1;j<playerList.size();j++){
					List<Player> subPlayerList = new ArrayList<Player>();
					Double jFpts = Double.parseDouble(playerList.get(j).getFpts());
					if(jFpts > 35){
						subPlayerList.add(playerList.get(i));
						subPlayerList.add(playerList.get(j));
						PGList.add(subPlayerList);
					}
				}				
			}
			min++;
		}
		System.out.println("PGList"+PGList);
		return PGList;
	}


}
