package edu.ithaca.jhunter1;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class plannerTest {

    @Test
    public void addEventTest() throws IOException {
        planner myPlanner = new planner();
        myPlanner.addEvent("Test 1", "12:34");
        myPlanner.addEvent("Test 2", "1:23");
        assertEquals("Test 1 12:34 Test 2 1:23 ", myPlanner.listEvents());
    }
}
