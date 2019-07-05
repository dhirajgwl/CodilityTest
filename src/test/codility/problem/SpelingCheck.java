package test.codility.problem;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import test.codility.utils.Utils;

public class SpelingCheck {
	
	private Utils utils = Utils.getInstance();
	
	
	public SpelingCheck() {
		String inputWord = "ABAC";
		char[] inputWordToArray = inputWord.toCharArray();
		ArrayList<String> temp = new ArrayList<String>();
		boolean counterForSameVowel = false;
		for(int i=0;i<inputWordToArray.length;i++){
			temp.add(String.valueOf(inputWordToArray[i]));
			if(temp.size()>2){
				if((temp.get(i-2).equals(temp.get(i)) && (temp.get(i-1).equals(temp.get(i) )))){
					counterForSameVowel=true;
				}
			}
		}
		if(!counterForSameVowel){
			List<String> removedVowelInList = removeVowelFromList("AEIOU",temp);
			Set<String> uniqueValueList = utils.getUniqueValue(removedVowelInList);
			System.out.println(trace()+" -->  "+utils.factorialValue(uniqueValueList.size()));
		}else{
			System.out.println(trace()+" -->  "+0);
		}
		

	}
	
	public String trace() {
		return this.toString();
	}
	
	public List<String> removeVowelFromList(String str,List<String> list){
		char[] stringtoArray = str.toCharArray();		
		for(char character : stringtoArray) {
			while(list.contains(String.valueOf(character))) {
				int index = list.indexOf(String.valueOf(character));
				list.remove(index);
				}
			}	
		
		return list;
	}
	
}
