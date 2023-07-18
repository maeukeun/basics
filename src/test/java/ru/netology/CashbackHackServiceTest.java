package ru.netology;

import static org.junit.Assert.assertEquals;



public class CashbackHackServiceTest {
    @org.junit.Test
    public void correctCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 900;
        int actual = test.remain(amount);
        int expected = 100;
        assertEquals(expected , actual);
    }

    @org.junit.Test
    public void boundsCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 999;
        int actual = test.remain(amount);
        int expected = 1;
        assertEquals(expected , actual);
    }

    @org.junit.Test
    public void incorrectCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 1000;
        int actual = test.remain(amount);
        int expected = 0;
        assertEquals(expected , actual);
    }
}