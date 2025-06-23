package DSA_Dinesh_Varuani.graph;

public class Graph {
    private int V;//number of vertices in Graph
    private int E;//number of edges in Graph
    private int[][] adjMatrix;

    public Graph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }


}
