package ThirtyDaysOfCode.Day23;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}


class Solution {
    static void levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node element = queue.remove();
            System.out.print(element.data + " ");


            if (element.left != null){
                queue.add(element.left);
            }

            if (element.right != null) {
                queue.add(element.right);
            }

        }

//        int treeHeight = height(root);
//        for(int i = 0; i < treeHeight; i++){
//
//            System.out.println();
//
//        }
//    }
//
//    static int height(Node root) {
//        if (root == null) {
//            return 0;
//        }
//
//        int leftHeight = 1 + height(root.left);
//        int rightHeight = 1 + height(root.right);
//
//        return Math.max(leftHeight, rightHeight);
//    }
    }



    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

}