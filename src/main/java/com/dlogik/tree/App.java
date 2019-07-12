package com.dlogik.tree;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BinaryTree<Integer> tree = new BinaryTree<>();
    	tree.insert(7).insert(5).insert(15);
    	
    	List<Integer> list = tree.preOrder();
    	
    	System.out.println("The tree is:" + list);

    	BinaryTree<Integer> tree2 = new BinaryTree<>();
    	tree2.insert(15).insert(5).insert(7);
    	
    	list = tree2.preOrder();
    	System.out.println("The tree is:" + list);

    }
}
