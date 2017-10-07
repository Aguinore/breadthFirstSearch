package org.aguinore.graph;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by user on 10/7/17.
 */
class BreadthFirstSearchTest {
    @Test
    void testStepic1() throws FileNotFoundException {
        BreadthFirstSearch search = new BreadthFirstSearch();
        File file = new File("resources/testStepic1");
        FileInputStream fis = new FileInputStream(file);
        search.readData(fis);
    }

    @Test
    void testStepic2() throws FileNotFoundException {
        BreadthFirstSearch search = new BreadthFirstSearch();
        File file = new File("resources/testStepic2");
        FileInputStream fis = new FileInputStream(file);
        search.readData(fis);
    }

}