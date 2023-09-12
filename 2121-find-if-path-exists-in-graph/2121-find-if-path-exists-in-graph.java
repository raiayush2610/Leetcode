class Solution {
   private boolean pathExistsDFS(Map<Integer, List<Integer>> graph, boolean[] visited, int source, int destination) {
        if (visited[source] == true) return false;
        if (source == destination) return true;
        visited[source] = true;
        for (Integer neighbour:graph.get(source)) {
            if (pathExistsDFS(graph, visited, neighbour, destination)) return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        boolean visti[]= new boolean[n];
        return pathExistsDFS(graph, visti, source, destination);
    }
}