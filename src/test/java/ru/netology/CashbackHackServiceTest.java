package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void correctCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 999;
        int actual = test.remain(amount);
        int expected = 1;
        assertEquals(expected , actual);
    }

    @Test
    void boundsCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 999;
        int actual = test.remain(amount);
        int expected = 1;
        assertEquals(expected , actual);
    }

    @Test
    void incorrectCost(){
        CashbackHackService test = new CashbackHackService();
        int amount = 1000;
        int actual = test.remain(amount);
        int expected = 0;
        assertEquals(expected , actual);
    }
}