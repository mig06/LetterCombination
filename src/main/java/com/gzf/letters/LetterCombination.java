package com.gzf.letters;

import java.util.*;

/**
 * Copyright
 * User: Ganzf
 * Date: 2019/6/5 16:20 PM
 * Description: 数字转字母
 */
public class LetterCombination {


    /**
     * 数字与字母对应关系
     */

    public Map<Integer, String> numsMap =  new HashMap<Integer, String>() {
        {
            put(Constants.NUMBER_0, "");
            put(Constants.NUMBER_1, "");
            put(Constants.NUMBER_2, "abc");
            put(Constants.NUMBER_3, "def");
            put(Constants.NUMBER_4, "ghi");
            put(Constants.NUMBER_5, "jkl");
            put(Constants.NUMBER_6, "mno");
            put(Constants.NUMBER_7, "pqrs");
            put(Constants.NUMBER_8, "tuv");
            put(Constants.NUMBER_9, "wxyz");
        }
    };


    /**
     * 数字转字母
     * @param digits
     * @return
     */
    public List<String> combineLetters(String digits) {
        List<String> resultList = new LinkedList<>();
        StringBuilder tempString = new StringBuilder();
        combineLetters(digits, tempString, resultList);
        return resultList;
    }


    /**
     * 通过递归，循环每个数字里面的字母，然后拼接
     * @param digits
     * @param tempString
     */
    public void combineLetters(String digits, StringBuilder tempString, List resultList) {

        //校验数字的合法性
        //add letter to resultList
        if (digits.length() == 0 && tempString.length() != 0) {
            resultList.add(tempString.toString());
            return;
        } else if (digits.length() == 0) {
            return;
        }

        //数字包含0和1跳过
        while(digits.length() > 0 && (digits.substring(0, 1).equals("0") || digits.substring(0,1).equals("1"))){
            digits = digits.substring(1);
        }

        //数字为空
        if(digits.length() == 0) return;

        //生成字母
        Integer cur = Integer.valueOf(digits.substring(0, 1));
        String letters = numsMap.get(cur);
        for (int i = 0; i < letters.length(); i++) {
            tempString = tempString.append(letters.charAt(i));
            combineLetters(digits.substring(1), tempString, resultList);
            tempString = tempString.deleteCharAt(tempString.length()-1);
        }
    }
}
