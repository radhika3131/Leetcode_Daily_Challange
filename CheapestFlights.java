package com.dataStructures.LeetcodeDailyChallange;
import java.util.*;
public class CheapestFlights {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // Create the adjacency list to depict airports and flights
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Populate the adjacency list
        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        // Create a queue to store nodes and their distances from the source
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0, 0}); // {node, cost, stops}

        // Distance array to store the updated distances from the source
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Iterate through the graph using a queue
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int cost = curr[1];
            int stops = curr[2];

            // Stop the process if the limit for the stops is reached
            if (stops > K) continue;

            // Explore neighbors
            for (int[] neighbor : adj.get(node)) {
                int adjNode = neighbor[0];
                int edgeWeight = neighbor[1];

                // Update the queue if the new calculated distance is less than the previous
                if (cost + edgeWeight < dist[adjNode] && stops <= K) {
                    dist[adjNode] = cost + edgeWeight;
                    queue.offer(new int[]{adjNode, cost + edgeWeight, stops + 1});
                }
            }
        }

        // If the destination node is unreachable return -1, else return the calculated distance
        return (dist[dst] == Integer.MAX_VALUE) ? -1 : dist[dst];
    }



    public static void main(String[] args) {
        int n = 4, src = 0, dst = 3, K = 1;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        CheapestFlights obj = new CheapestFlights();
        int ans = obj.findCheapestPrice(n, flights, src, dst, K);
        System.out.println(ans);
    }
}
