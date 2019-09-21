package com.learn.uf;

import java.util.Arrays;

public abstract class UF {

    protected int count;
    protected int[] id;

    public UF(int n) {
        this.count = n;
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }
    }

    public abstract void union(int p, int q);

    public abstract int find(int p);

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    };

    @Override
    public String toString() {
        return Arrays.toString(id);
    }

}
