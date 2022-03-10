import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        int listSize = list.getCount();

        list.deleteCity(city);
        assertEquals(listSize-1, list.getCount());
    }

    @Test
    public void countCitiesTest(){
        City city_1 = new City("Halifax", "NS");
        City city_2 = new City("Edmonton", "AB");
        list.addCity(city_1);
        list.addCity(city_2);

        assertEquals(2, list.countCities());

        list.deleteCity(city_2);
        assertEquals(1, list.countCities());
    }
}
