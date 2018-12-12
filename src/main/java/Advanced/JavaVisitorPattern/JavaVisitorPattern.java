//package Advanced.JavaVisitorPattern;
//
//import java.util.ArrayList;
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//enum Color {
//    RED, GREEN
//}
//
//abstract class Tree {
//
//    private int value;
//    private Color color;
//    private int depth;
//
//    public Tree(int value, Color color, int depth) {
//        this.value = value;
//        this.color = color;
//        this.depth = depth;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public int getDepth() {
//        return depth;
//    }
//
//    public abstract void accept(TreeVis visitor);
//}
//
//class TreeNode extends Tree {
//
//    private ArrayList<Tree> children = new ArrayList<>();
//
//    public TreeNode(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitNode(this);
//
//        for (Tree child : children) {
//            child.accept(visitor);
//        }
//    }
//
//    public void addChild(Tree child) {
//        children.add(child);
//    }
//}
//
//class TreeLeaf extends Tree {
//
//    public TreeLeaf(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitLeaf(this);
//    }
//}
//
//abstract class TreeVis
//{
//    public abstract int getResult();
//    public abstract void visitNode(TreeNode node);
//    public abstract void visitLeaf(TreeLeaf leaf);
//
//}
//
////The SumInLeavesVisitor implementation must return the sum of the values in the tree's leaves only.
//class SumInLeavesVisitor extends TreeVis {
//    public int getResult() {
//        while ()
//        return 0;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        //implement this
//    }
//}
//
//class ProductOfRedNodesVisitor extends TreeVis {
//    public int getResult() {
//        //implement this
//        return 1;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        //implement this
//    }
//}
//
//class FancyVisitor extends TreeVis {
//    public int getResult() {
//        //implement this
//        return 0;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        //implement this
//    }
//}
//
//public class Solution {
//
//    public static Tree solve() {
//        Scanner scanner = new Scanner(System.in);
//
//        int numberOfNodes = scanner.nextInt();
//
//        int[] values = new int[numberOfNodes];
//        for (int i = 0; i < numberOfNodes; i++) {
//            values[i] = scanner.nextInt();
//        }
//
//        Color[] colors = new Color[numberOfNodes];
//        for (int i = 0; i < numberOfNodes; i++) {
//            int colorCode = scanner.nextInt();
//
//            if (colorCode == 0) {
//                colors[i] = Color.RED;
//            } else {
//                colors[i] = Color.GREEN;
//            }
//        }
//
//        Tree tree = new Tree(values[0], colors[0], 0) {
//            @Override
//            public void accept(TreeVis visitor) {
//                tree
//            }
//        };
//        ((TreeNode) tree).addChild();
//
//        int[][] edges = new int[numberOfNodes-1][2];
//        for (int i = 0; i < numberOfNodes-1; ++i){
//            edges[i][0]=scanner.nextInt();
//            edges[i][1]=scanner.nextInt();
//        }
//
//
//
//
//        return tree;
//        //read the tree from STDIN and return its root as a return value of this function
//    }
//
//    public static void main(String[] args) {
//        Tree root = solve();
//        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
//        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
//        FancyVisitor vis3 = new FancyVisitor();
//
//        root.accept(vis1);
//        root.accept(vis2);
//        root.accept(vis3);
//
//        int res1 = vis1.getResult();
//        int res2 = vis2.getResult();
//        int res3 = vis3.getResult();
//
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);
//    }
//}