package com.example.onemoretime.ninja.trees.basic01;

import jnr.ffi.annotations.In;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreesUse {
    public static void main(String[] args) {
       /* BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;


        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
        rootLeft.right = twoRight;
        rootRight.left = threeLeft;*/

        // BinaryTreeNode<Integer> root = takeTreeInput();
        //  BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        BinaryTreeNode<Integer> root = takeInputLevelWise();

        printTreeDetailed(root);

        System.out.println(getSum(root));

        //is balanced sout
        // System.out.println("is balanced " + isBalancedBetter(root).isBalanced);


    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }

        // System.out.println(root.data + " :L" + root.left.data + " ,R" + root.right.data);
        System.out.print(root.data + " :");
        if (root.left != null) {
            System.out.print("L" + root.left.data + " , ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        //todo take care of best case
        /*if (root.left != null || root.right != null) {
            return;
        }*/

        //way two
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);


        //way one
        /*System.out.println(root.data);

        if (root.left != null) {
            printTree(root.left);
        }

        if (root.right != null) {
            printTree(root.right);
        }*/
    }

    //take input
    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    //take input better
    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    following are the prolems that are worked upon getting the information about the tree
*/
    //number of nodes in binary tree
    public static int noOfNodesInBinaryString(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int i = noOfNodesInBinaryString(root.left);
        int i1 = noOfNodesInBinaryString(root.right);
        return 1 + i + i1;
    }


    //get sum of all nodes
    public static int getSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int sumLeft = getSum(root.left);
        int sumRight = getSum(root.right);
       /* int rootSum = 0;
        int rootLeft = 0;
        int rootRight = 0;
        int totalSum = 0;
        if (sumLeft != -1 && sumRight != -1) {
            rootSum += root.data;
            rootLeft += root.left.data;
            rootRight += root.right.data;

            totalSum = rootSum + rootLeft + rootRight;
        }*/
        /*int leftCount = 0;
        if (sumLeft == null) {
            leftCount += root.left.data;
        }

        int rightCount = 0;
        if (sumRight != -1) {
            rightCount += root.right.data;
        }
        return leftCount + rightCount;*/
        return root.data + sumLeft + sumRight;


    }

    //preorder binary tree
    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //postorder binary tree
    public static void postOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //Node With largest data
    public static int nodeWithLargestData(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int i1 = nodeWithLargestData(root.left);
        int i = nodeWithLargestData(root.right);
        return Math.max(root.data, Math.max(i1, i));
    }

    //nodes greater than x
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        /*if (root == null) {
            return -1;
        }
        int count = 1;
        int left = countNodesGreaterThanX(root.left, x);
        if (left < x) {
            count++;
        }

        int right = countNodesGreaterThanX(root.right, x);
        if (right < x) {
            count++;
        }
        return count;*/
        if (root == null) {
            return 0;
        }
        int count = (root.data > x) ? 1 : 0;
        int countLeft = countNodesGreaterThanX(root.left, x);
        int countRight = countNodesGreaterThanX(root.right, x);
        return count + countLeft + countRight;

    }

    //height of the tree
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    //number of leaves
    public static int numOfLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return numOfLeaves(root.left) + numOfLeaves(root.right);
    }

    //print at depthK
    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k - 1);
        printAtDepthK(root.right, k - 1);
    }


    //replace node with depth
    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        changeToDepthTreeHelper(root, 0);
    }

    public static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root, int level) {
        if (root == null) {
            return;
        }
        root.data = level;
        changeToDepthTreeHelper(root.left, level + 1);
        changeToDepthTreeHelper(root.right, level + 1);
    }

    //is node present
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data.equals(x)) {
            return true;
        }
        return (isNodePresent(root.left, x) || isNodePresent(root.right, x));
    }

    //nodes without siblings
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right != null) {
            System.out.println(root.right.data + " ");
        } else if (root.left != null && root.right == null) {
            System.out.println(root.left.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    following are the prolems that are worked upon changing the structure of tree
*/

    //remove all tree leaf nodes
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        //removeLeaves(root.left);
        //removeLeaves(root.right);

        //update the root node
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;

    }

    //mirror binary tree
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        mirrorBinaryTree(root.right);
        mirrorBinaryTree(root.left);
        BinaryTreeNode<Integer> rootTemp = root.left;
        root.left = root.right;
        root.right = rootTemp;
    }

    //tree is balanced or not
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = heightt(root.left);
        int rightHeight = heightt(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        boolean balancedLeft = isBalanced(root.left);
        boolean balancedRight = isBalanced(root.right);
        return balancedLeft && balancedRight;
    }

    public static int heightt(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int heightLeft = heightt(root.left);
        int heightRight = heightt(root.right);
        return 1 + Math.max(heightLeft, heightRight);

    }

    //balanced tree improved
    public static BalancedTreeReturned isBalancedBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturned ans = new BalancedTreeReturned();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturned leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturned rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);


        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBal = false;

        }
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBal = false;
        }
        BalancedTreeReturned ans = new BalancedTreeReturned();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }


    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        Pair pair = diameterHelper(root);
        return pair.diameter;
    }

    private static Pair diameterHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair pair = new Pair(0, 0);
            return pair;
        }
        Pair leftPair = diameterHelper(root.left);
        Pair rightPair = diameterHelper(root.right);

        int leftDiameter = leftPair.diameter;
        int rightDiameter = rightPair.diameter;
        /*
         * dist denotes the longest distance between  deepest node of the left subtree and
         * deepest node of the right subtree
         * */

        int dist = leftPair.height + rightPair.height + 1;
        int diameter = Math.max(leftDiameter, Math.max(rightDiameter, dist));
        int height = Math.max(leftPair.height, rightPair.height) + 1;
        return (new Pair(diameter, height));
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter root data");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChild.add(root);

        while (!pendingChild.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChild.poll();
            System.out.println("enter left child of " + front.data);
            int left = s.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pendingChild.add(leftChild);
            }

            System.out.println("enter right child of " + front.data);
            int right = s.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.left = rightChild;
                pendingChild.add(rightChild);
            }

        }
        return root;

    }

}
