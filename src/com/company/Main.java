package com.company;

public class Main {

    public static void main(String[] args) {
        Graph graph=new Graph();
        //9 14
        //1 2 8
        //1 7 11
        //1 9 4
        //2 3 7
        //2 8 2
        //2 5 4
        //3 4 9
        //3 5 14
        //4 5 10
        //5 6 2
        //6 7 1
        //6 8 6
        //7 8 7
        //7 9 8
        System.out.println(graph.Kruskal());
        graph.showKruskal();
    }
}
