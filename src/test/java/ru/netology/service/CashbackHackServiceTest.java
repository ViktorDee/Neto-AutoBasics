package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCountRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2450);
        int expected = 550;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountRemainIfZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBorderIfLess() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBorderIfMore() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(3001);
        int expected = 999;

        assertEquals(expected, actual);
    }
}