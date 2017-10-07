package org.aguinore.graph;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by user on 10/7/17.
 */
public class BreadthFirstSearch {
    private Integer verticesNumber;
    private Integer edgesNumber;

    public static void main(String[] args) {
        BreadthFirstSearch search = new BreadthFirstSearch();
        search.readData(System.in);

    }

    public void readData(InputStream stream) {
        Scanner scanner = new Scanner(stream);
        String firstLine = scanner.nextLine();
        String[] verticesAndEdges = firstLine.split(" ");
        verticesNumber = Integer.parseInt(verticesAndEdges[0]);
        edgesNumber = Integer.parseInt(verticesAndEdges[1]);
        System.out.println(verticesNumber + " " + edgesNumber);


    }
}
