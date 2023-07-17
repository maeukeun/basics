package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void test(){
        CashbackHackService test = new CashbackHackService();
        int amount = 900;
        int actual = test.remain(amount);
        int expected = 5;
        assertEquals(expected , actual);
    }

}