package com.gzf.letters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Copyright
 * User: Ganzf
 * Date: 2019/6/5 4:16 PM
 * Description: 数字转字母测试
 */
public class LetterCombinationTest {
    LetterCombination letterCombination = null;

    @Before
    public void init() {
        letterCombination = new LetterCombination();
    }

    @Test
    public void TestCombineLetters() {
        String input1 ="0";
		String expect1 = "[]";
		Assert.assertEquals(expect1, letterCombination.combineLetters(input1).toString());
		//letterCombination.clearLetters();

		String input2 ="1";
		String expect2 = "[]";
		Assert.assertEquals(expect2, letterCombination.combineLetters(input2).toString());
		//letterCombination.clearLetters();
        
		String input3 ="09";
		String expect3 = "[w, x, y, z]";
		Assert.assertEquals(expect3, letterCombination.combineLetters(input3).toString());
		//letterCombination.clearLetters();

        String input4 ="23";
        String expect4 = "[ad, ae, af, bd, be, bf, cd, ce, cf]";
        Assert.assertEquals(expect4, letterCombination.combineLetters(input4).toString());
        //letterCombination.clearLetters();

        String input5 ="0213";
        String expect5 = "[ad, ae, af, bd, be, bf, cd, ce, cf]";
        Assert.assertEquals(expect5, letterCombination.combineLetters(input5).toString());
        //letterCombination.clearLetters();


    }




}
