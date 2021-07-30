package cs445.rec11.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

import cs445.rec11.MapLandmarks;
import cs445.rec11.Tuple;


/**
 * A class that provides sample tests for MapLandmarks
 * @author William C. Garrison III
 * @author Norhan Abbas
 * @author Brian T. Nixon
 */
public class DictionaryTest {

	MapLandmarks dictionary_test = new MapLandmarks();

	Tuple key1 = new Tuple(1,2);
    Tuple key2 = new Tuple(100,200);
    Tuple key3 = new Tuple(1.99998,2.9997);
    Tuple key4 = new Tuple(1000.99998,2000.9997);
    Tuple key5 = new Tuple(1008,20097);

    @BeforeEach
    public void setup() {
    	dictionary_test = new MapLandmarks();
    }

    @AfterEach
    public void teardown() {
    	dictionary_test = null;
    }



    @Test
    @DisplayName("addLandmark")
    void testAddLandmark() {

    	dictionary_test.addLandmark("this", 1, 2);
    	dictionary_test.addLandmark("is", 100, 200);
    	dictionary_test.addLandmark("CS", 1.99998, 2.9997);

    	dictionary_test.addLandmark("449", 1000.99998, 2000.9997);
    	dictionary_test.addLandmark("445", 1000.99998, 2000.9997);

    	assertTrue(dictionary_test.getValue(1, 2).equals("this"));
    	assertTrue(dictionary_test.getValue(100, 200).equals("is"));
    	assertTrue(dictionary_test.getValue(1.99998, 2.9997).equals("CS"));
    	assertTrue(dictionary_test.getValue(1000.99998, 2000.9997).equals("445"));
    }

    @Test
    @DisplayName("removeLandmark")
    void testRemoveLandmark() {

    	dictionary_test.addLandmark("this", 1, 2);
    	dictionary_test.addLandmark("is", 100, 200);
    	dictionary_test.addLandmark("CS", 1.99998, 2.9997);
    	dictionary_test.addLandmark("445", 1000.99998, 2000.9997);

    	dictionary_test.removeLandmark("this");
    	dictionary_test.removeLandmark("is");
    	dictionary_test.removeLandmark("CS");
    	dictionary_test.removeLandmark("445");

    	assertNull(dictionary_test.getValue(key1));
    	assertNull(dictionary_test.getValue(key2));
    	assertNull(dictionary_test.getValue(key3));
    	assertNull(dictionary_test.getValue(key4));

    }
}

