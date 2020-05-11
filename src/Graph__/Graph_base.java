package Graph__;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph_base {
    private ArrayList<String> vertexList; //存储顶点集合
    private int[][] edges;
    private int numOfEdges;
    public static void main(String[] args) {
        int n = 5;  //结点的个数
        String Vertexs[] = {"A", "B", "C", "D", "E"};
        //创建图对象
        Graph_base graph = new Graph_base(n);
        //循环的添加顶点
        for(String vertex: Vertexs) {
            graph.insert(vertex);
        }

        //添加边
        //A-B A-C B-C B-D B-E
		graph.insertEdge(0, 1, 1); // A-B
		graph.insertEdge(0, 2, 1); //
		graph.insertEdge(1, 2, 1); //
		graph.insertEdge(1, 3, 1); //
		graph.insertEdge(1, 4, 1); //
        graph.showGraph();

    }
    public Graph_base(int x){
        edges = new int[x][x];
        vertexList = new ArrayList<String>(x);
        numOfEdges = 0;
    }
    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = 1;
        edges[v2][v1] = 1;
        numOfEdges++;
    }
    public void showGraph(){
        for (int[] Link:edges){
            System.out.println(Arrays.toString(Link))  ;
        }
    }

    public int getNumOfEdges() {
        return numOfEdges;
    }
    public void insert(String i){
        vertexList.add(i);
    }


}
