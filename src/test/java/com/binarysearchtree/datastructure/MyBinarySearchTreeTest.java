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
}
