package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    private int [] root;//вершины -> множество
    private Edge [] edges; //рёбра

    public Graph(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("value of roots ");
        root =new int [scanner.nextInt()];
        for (int i = 0; i < root.length; i++) root[i]=i;
        System.out.print("value of edges ");
        edges=new Edge[scanner.nextInt()];
        System.out.println("enter 'first edge' 'second edge' 'value' ");
        for (int i = 0; i < edges.length; i++) edges[i] = new Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Arrays.sort(edges);
        for (Edge edge: edges
        ) {
            System.out.println(edge);
        }
    }
    public int Kruskal(){
        int cost=0;
        for (Edge t: edges
        ) {
            if(merge(t.u,t.v)) cost+=t.w;
            else t.w=-1;
        }
        return cost;
    }
    public void showKruskal(){
        for (Edge t:edges
        ) {
            if(t.w!=-1) System.out.println(t.u+1 + "-" + (t.v+1) +" | cost:" + t.w);

        }
    }

    private class Edge implements Comparable<Edge>  {
        private int u;
        private int v;
        private int w;

        public Edge(int u, int v, int w){
            this.u=u-1;
            this.v=v-1;
            this.w=w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w-o.w;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "u=" + u +
                    ", v=" + v +
                    ", w=" + w +
                    '}';
        }
    }
    private boolean merge(int u, int w){
        for (int t: root
        ) {
            System.out.print(t +" ");
        }
        System.out.println();
        if(root[u]== root[w])
            return false;
        int change = root[u];
        for (int i = 0; i < root.length; i++) if(root[i]==change) root[i]= root[w];
        return true;

    }
}
