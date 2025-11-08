package org.auto0427RT;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem {

    public void findfirstNonrepeatedchar(String word){
        char[] word_to_array = word.toCharArray();
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        char nonDuplicate ='\n';
        for (int i =0 ;i<=word_to_array.length-1;i++){
                if (map.containsKey(word_to_array[i])){
                    map.put(word_to_array[i],map.get(word_to_array[i])+1);
                }
                //if it does not contain the character
                else {
                  map.put(word_to_array[i],1) ;
                }
               // System.out.println("result" +map.get(word_to_array[i]));
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                nonDuplicate = entry.getKey();
            break;}
        }
        System.out.println("nonduplicate: "+ nonDuplicate);
    }
}
