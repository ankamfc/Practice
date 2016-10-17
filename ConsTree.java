/*
 The way to think recursively is to consider the cases. In our case, we look at a single node and can decide what paths it has:

If the node has no children, then the only path is the singleton path (consisting of that node by itself).
If the node has only one child, then all paths go through that child.
Otherwise, the node has two children. Then, all paths go through one of its two children.
In case 1, the maximum must be that node's value. In case 2, the maximum is that node's value, 
plus the max-path-sum of its child (since that path is extended to a path for the parent through the only child). 
In case 3, the maximum is the maximum max-path-sum of its two children (since the best path must go through one 
of the two children, and the parent can see which of the children's best paths is better).

Therefore, the code is really simple. Here, since you return an int, I'm going to assume T = int.
  */

/* */

// MAX PATH
public class ConsTree
{
    ConsTree left;
    ConsTree right;
    int data;

    public int maxSum() 
    {
        int left_max = 0;
        int right_max = 0;
        if (left != null)
            left_max = left.maxSum();
        if (right != null)
            right_max = right.maxSum();
        return data + Math.max(right_max, left_max);
    }
} 
