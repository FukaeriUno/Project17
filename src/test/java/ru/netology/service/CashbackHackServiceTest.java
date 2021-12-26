package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
   @Test
   public void shouldCalculateSum1() {

       CashbackHackService cashbackHackService = new CashbackHackService();
       int amount = 900;

       int actual = cashbackHackService.remain(amount);
       int expected = 100;
       assertEquals(actual, expected);
   }

    @Test
    public void shouldCalculateSum2() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateSum3() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateSum4() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}