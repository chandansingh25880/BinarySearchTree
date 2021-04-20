package com.binarytree;

import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3NumberWhenAddedToBSTshouldReturnSize() {
        MyBinaryTreeTest<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
    }
}
