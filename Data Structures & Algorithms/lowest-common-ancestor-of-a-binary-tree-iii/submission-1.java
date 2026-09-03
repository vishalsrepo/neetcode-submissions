/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Deque<Node> pathP = new ArrayDeque<>();
        Deque<Node> pathQ = new ArrayDeque<>();

        Node ans = null;
        path(p, pathP);
        path(q, pathQ);

        while(!pathP.isEmpty() && pathP.peekLast() == pathQ.peekLast()) {
            ans = pathP.pollLast();
            pathQ.pollLast();
        }
        return ans;
    }

    private void path(Node curr, Deque<Node> path) {
        path.offerLast(curr);
        while(curr.parent != null) {
            curr = curr.parent;
            path.offerLast(curr);
        }
    }
}