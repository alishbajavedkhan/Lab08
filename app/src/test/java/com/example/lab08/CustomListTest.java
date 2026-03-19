package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City karachi = new City("Karachi", "Sindh");
        list.addCity(karachi);
        assertTrue(list.hasCity(karachi));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City lahore = new City("Lahore", "Punjab");
        list.addCity(lahore);
        list.deleteCity(lahore);
        assertFalse(list.hasCity(lahore));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        list.addCity(new City("Islamabad", "Punjab"));
        list.addCity(new City("Quetta", "Balochistan"));
        assertEquals(2, list.countCities());
    }

}
