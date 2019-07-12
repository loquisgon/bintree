package com.dlogik.tree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * Unit test for simple App.
 */
public class BinaryTreeTest 
{
	
	private BinaryTree<Integer> binaryTree = new BinaryTree<>();
    
	@Before
	public void setup() {
    	List<Integer> input = new ArrayList<>();
    	input.add(5);
    	input.add(15);
    	input.add(3);
    	input.add(6);
    	input.add(2);
    	input.add(4);
    	input.add(1);
    	input.add(13);
    	input.add(21);
    	input.add(12);
    	input.add(14);
    		
    	
        binaryTree = new BinaryTree<>(7);
        for (Integer value : input) {
        	binaryTree.insert(value);
        }
		
	}
	
    @Test
	public void testPreOrder()
    {

    	List<Integer> expected = new ArrayList<>();
    	expected.add(7);
    	expected.add(5);
    	expected.add(3);
    	expected.add(2);
    	expected.add(1);
    	expected.add(4);
    	expected.add(6);
    	expected.add(15);
    	expected.add(13);
    	expected.add(12);
    	expected.add(14);
    	expected.add(21);

        
        List<Integer> listFromTree = binaryTree.preOrder();
        assertEquals("failure - byte arrays not same",expected,listFromTree);
    }
    
    @Test
    public void testFind() {
    	BinaryTree<Integer> emptyTree = new BinaryTree<>();
    	assertFalse("Empty tree! It does not have any data", emptyTree.find(6));
    	assertTrue("Value  not found in tree", binaryTree.find(14));
    	assertTrue("Value  not found in tree", binaryTree.find(1));
    	assertTrue("Value  not found in tree", binaryTree.find(13));
    	assertFalse("Value  found in tree", binaryTree.find(29));
    	
    }
    
}
