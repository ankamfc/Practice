/*
 procedure bfs(G; s)
Input: Graph G = (V;E), directed or undirected; vertex s 2 V
Output: For all vertices u reachable from s, dist(u) is set
to the distance from s to u.
for all u 2 V :
dist(u) = 1
dist(s) = 0
Q = [s] (queue containing just s)
while Q is not empty:
u = eject(Q)
for all edges (u; v) 2 E:
if dist(v) = 1:
inject(Q; v)
dist(v) = dist(u) + 1
 */

public class Bfs {

}
