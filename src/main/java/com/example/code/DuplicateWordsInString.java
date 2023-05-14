package com.example.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        findDuplicateWords("Hey java is a java programming in java");

    }

    public static void findDuplicateWords(String inputString) {
        //split
        String words[]=inputString.split(" ");
        //hashmap creation
        Map<String,Integer>wordCount=new HashMap<String,Integer>();
        //to check each word in giver array:
        for(String word:words){
            //if word is present :
            if (wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }else{
                wordCount.put(word,1);
            }
        }

        //extracting all the keys of map -wordcount map using set interface


        Set<String> wordsInString=wordCount.keySet();

        //for  loop through all the words in wordCount
        for(String word:wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word+" :" +wordCount.get(word));
            }
        }

    }


}
