package com.learn.uf;

import java.util.Arrays;

/**
 * Array Access
 *      union: 2 * find + 1
 *      find: 2 * lgN + 1
 */
public class WeightedQuickUnionUF extends QuickUnionUF {

    private int[] sz;

    public WeightedQuickUnionUF(int n) {
        super(n);
        sz = new int[n];
        for (int i = 0; i < sz.length; i++) {
            sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;
        if (sz[pId] < sz[qId]) { 
            id[pId] = qId;
            sz[qId] += sz[pId];
        }
        else {
            id[qId] = pId;
            sz[pId] += sz[qId];
        }
        this.count--;
    }

    @Override
    public String toString() {
        return Arrays.toString(id) + "\n" + Arrays.toString(sz);
    }

}
