package com.learn.uf;

/**
 * Array Access
 *      union: 2 * find + 1
 *      find: 2 * depth + 1
 */
public class QuickUnionUF extends UF {

    public QuickUnionUF(int n) {
        super(n);
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;
        id[pId] = qId;
        this.count--;
    }

    @Override
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
}
