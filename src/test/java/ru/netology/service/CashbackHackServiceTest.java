package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCountRemain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountRemainIfZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBorderIfLess() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(2999);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBorderIfMore() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(3001);


        assertEquals(expected, actual);
    }
}