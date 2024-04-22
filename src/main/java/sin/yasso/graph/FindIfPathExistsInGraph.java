//package sin.yasso.graph;
//
//import java.util.*;
//
//public class FindIfPathExistsInGraph {
//    public static boolean validPath(int n, int[][] edges, int source, int destination) {
//
//        // n = the number of nodes
//
//        // [][] edges = 2D array represent the edge points from.
//
//        // example from a to b
//        // array 1[] & array 2[]: (1) [(2)[a,b], (2)[b,c], (2)[c,a]] like this pattern the edges comes from the input
//
//        // source = the point that we will start from
//        // destination = the point that we have to go for
//
//        // example (source = a) (destination = c):
//        // we will use the same data that we mention before in the arrays:
//        // a --> b --> c
//        // c --> a
//
//        // step 1: create the graph
//        System.out.println("Creating the graph...");
//        // we have declared a table of lists and each list based on one node
//        List<Integer>[] graph = new ArrayList[n];
//
//        // step 2: initialise each list in the table
//        // three nodes equal three lists
//        for (int i = 0; i < n; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        // array 1[] & array 2[]: (1) [(2)[a,b], (2)[b,c], (2)[c,a]]
//        // we will loop inside the first array
//        for (int[] edge : edges) {
//            // [a,b]
//            // a index 0, b index 1
//            int u = edge[0], v = edge[1];
//            // u = a && v == b
//            graph[u].add(v);
//            graph[v].add(u);
//        }
//
//
//        System.out.println("Graph created. Starting the search for a valid path...");
//        boolean[] visited = new boolean[n];
//        boolean pathExists = dfs(graph, source, destination, visited);
//        if (pathExists) {
//            System.out.println("A valid path exists from node " + source + " to node " + destination + ".");
//        } else {
//            System.out.println("No valid path exists from node " + source + " to node " + destination + ".");
//        }
//        return pathExists;
//    }
//
//    private static boolean dfs(List<Integer>[] graph, int source, int destination, boolean[] visited) {
//        if (source == destination) {
//            return true;
//        }
//        visited[source] = true;
//        for (int neighbor : graph[source]) {
//            if (!visited[neighbor] && dfs(graph, neighbor, destination, visited)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Testing the validPath method with some test cases...");
//
//        // Example 1
//        int n1 = 3;
//        int[][] edges1 = {{0,1},{1,2},{2,0}};
//        int source1 = 0;
//        int destination1 = 2;
//        validPath(n1, edges1, source1, destination1);  // Output: true
//
//        // Example 2
//        int n2 = 6;
//        int[][] edges2 = {{0,1},{0,2},{3,5},{5,4},{4,3}};
//        int source2 = 0;
//        int destination2 = 5;
//        validPath(n2, edges2, source2, destination2);  // Output: false
//
//        // Example3
//        int n3 = 6;
//        int[][] edges1 = {{0,1},{1,2},{2,0}};
//        int source1 = 0;
//        int destination1 = 2;
//        validPath(n1, edges1, source1, destination1);  // Output: true
//    }
//}