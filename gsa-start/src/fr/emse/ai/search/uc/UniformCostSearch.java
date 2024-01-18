package fr.emse.ai.search.uc;

import fr.emse.ai.search.core.AbstractTreeSearch;
import fr.emse.ai.search.core.Node;
import fr.emse.ai.search.core.Problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class UniformCostSearch extends AbstractTreeSearch {

    public Collection<Node> initFrontier() {
        return new ArrayList<Node>();
    }

    public Node chooseLeafNode(Collection<Node> frontier, Problem problem) {
        Node bestNode = ((ArrayList<Node>) frontier).get(0);

        for (int i = 1; i < frontier.size(); i++) {
            Node node = ((ArrayList<Node>) frontier).get(i);

            if (node.getPathCost() < bestNode.getPathCost()) {
                bestNode = node;
            }
        }
        frontier.remove(bestNode);
        return bestNode;

        }
    }
