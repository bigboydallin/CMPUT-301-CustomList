import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Spruce Grove", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void cityCountTest(){
        City city = new City("Spruce Grove", "AB");
        assertEquals(list.getCount(),0);
        list.addCity(city);
        assertEquals(list.getCount(), 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Spruce Grove", "AB");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Spruce Grove", "AB");
        list.addCity(city);
        assertEquals(list.getCount(), 1);
        list.deleteCity(city);
        assertEquals(list.getCount(), 0);
    }
}
