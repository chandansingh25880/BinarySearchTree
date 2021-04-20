package com.binarysearchtree.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinarySearchTreeTest {

    /* @Description- To create a BST by adding 56 and then adding 30 and 70  */
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);

    }

    /* @Description- To create a BST given by following condition */
    @Test
    public void givenNumbersWhenAddedToBinaryTreeShouldReturnSizeThirteen() {
        BinarySearchTree<Integer> myBinaryTree = new BinarySearchTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13, size);

    }
}