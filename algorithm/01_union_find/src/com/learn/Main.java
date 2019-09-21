package com.learn;

import com.learn.uf.*;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.nio.channels.FileChannel;

public class Main {

    public static void testUF(UF uf) {
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components.");
        System.out.println(uf);
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        // testUF(new QuickFindUF(n));
        // testUF(new QuickUnionUF(n));
        testUF(new WeightedQuickUnionUF(n));
    }
}
