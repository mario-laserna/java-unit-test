package com.mlh.javaunittest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -3);
    }

    @Test
    public void str_is_not_empty(){
        Assert.assertFalse(StringUtil.isEmpty("Mario"));
    }

    @Test
    public void str_is_empty(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void str_null_is_empty(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void str_spaces_is_empty(){
        Assert.assertTrue(StringUtil.isEmpty("  "));
    }
}