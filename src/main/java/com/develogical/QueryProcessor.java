package com.develogical;

import java.util.*;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split("%20"); 
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (String s : parts) {
                if (Character.isDigit(s.charAt(0))) 
                    nums.add(Integer.parseInt(s));
            } Collections.sort(nums);
            return Integer.toString(nums.get(nums.size() - 1));

            
        }
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        return "";
    }
}


