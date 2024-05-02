package search;

import graph.*;
import java.util.*;

public class UniformCostSearch {
    private Graph graph;

    public UniformCostSearch(Graph graph) {
        this.graph = graph;
    }

    /**
     * Uniform Cost Search Nodes
     * <p>
     * Store word and cost
     */
    private static class Node {
        private String word;
        private int cost;

        public Node(String word, int cost) {
            this.word = word;
            this.cost = cost;
        }

        public String getWord() {
            return word;
        }

        public int getCost() {
            return cost;
        }
    }

    /**
     * Uniform Cost Search
     */
    public List<String> findShortestPath(String source, String target) {
        // Queue of nodes sorted by their cost
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::getCost));

        // Map to track visited nodes
        Map<String, Integer> visited = new HashMap<>();

        // Map to keep track of the parent node for each node in the shortest path
        Map<String, String> parent = new HashMap<>();

        // Add the source node to the priority queue with cost 0
        pq.offer(new Node(source, 0));

        // Uniform Cost Search
        while (!pq.isEmpty()) {
            // Get the node with the lowest cost
            Node currentNode = pq.poll();
            String currentWord = currentNode.getWord();
            int currentCost = currentNode.getCost();

            // target found
            if (currentWord.equals(target)) {
                List<String> shortestPath = new ArrayList<>();
                
                // Backtrack to reconstruct the result
                String word = target;
                while (word != null) {
                    shortestPath.add(0, word);
                    word = parent.get(word);
                }
                return shortestPath;
            }

            // add node to visited
            visited.put(currentWord, currentCost);

            // Visit neighboring of the current node
            for (String neighbor : graph.getAdjacencyList().getOrDefault(currentWord, new ArrayList<>())) {
                int neighborCost = currentCost + 1; 

                if (!visited.containsKey(neighbor) || neighborCost < visited.get(neighbor)) {
                    // Update the cost of the neighbor
                    visited.put(neighbor, neighborCost);

                    // Update the parent node for the neighbor
                    parent.put(neighbor, currentWord);
                    
                    // Add the neighbor to the priority queue
                    pq.offer(new Node(neighbor, neighborCost));
                }
            }
        }

        // If target is not found
        return Collections.emptyList();
    }
}