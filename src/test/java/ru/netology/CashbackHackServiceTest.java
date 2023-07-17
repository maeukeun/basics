package ru.netology;

import static org.testng.Assert.assertEquals;



public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void correctCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 900;
        int actual = test.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void boundsCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 999;
        int actual = test.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

}