//2685

import java.util.*;

class Solution {

    public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];
        int completeCount = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                ArrayList<Integer> component = new ArrayList<>();

                dfs(i, graph, visited, component);

                int vertices = component.size();
                int degreeSum = 0;

                for (int node : component) {
                    degreeSum += graph[node].size();
                }

                int edgesInComponent = degreeSum / 2;
                int requiredEdges = vertices * (vertices - 1) / 2;

                if (edgesInComponent == requiredEdges) {
                    completeCount++;
                }
            }
        }

        return completeCount;
    }

    private void dfs(int node, ArrayList<Integer>[] graph,
                     boolean[] visited, ArrayList<Integer> component) {

        visited[node] = true;
        component.add(node);

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next, graph, visited, component);
            }
        }
    }
}