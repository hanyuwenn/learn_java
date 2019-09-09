package com.learn.uf;

/**
 * Array Access
 *      union: N + 3, 2N + 1
 *      find: 1
 */
public class QuickFindUF extends UF {

    public QuickFindUF(int n) {
        super(n);
    }

    @Override
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
        this.count--;
    }

    @Override
    public int find(int p) {
        return id[p];
    }

}
