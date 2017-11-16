package br.com.danilocesarmendes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.danilocesarmendes.s2it.NodeBinaryTree;

/**
 * 
 * @author Danilo Mendes
 */
public class BinaryTreeTest {

	@Test
	public void exeecicio9() {
		// {5, 1, 2, 4, 3, 6, 9, 7, 10, 8};
		NodeBinaryTree binaryTree = new NodeBinaryTree(5);
		
		binaryTree.insert(1);
		binaryTree.insert(2);
		binaryTree.insert(4);
		binaryTree.insert(3);
		binaryTree.insert(6);
		binaryTree.insert(9);
		binaryTree.insert(7);
		binaryTree.insert(10);
		binaryTree.insert(8);
		
		
		Integer sum = binaryTree.sumByLevels(binaryTree);
		Assertions.assertThat(sum).isEqualTo(55);
		
		sum = binaryTree.sumByLevels(binaryTree.getLeft());
		Assertions.assertThat(sum).isEqualTo(10);
		
		sum = binaryTree.sumByLevels(binaryTree.getLeft().getRight());
		Assertions.assertThat(sum).isEqualTo(9);
		
		sum = binaryTree.sumByLevels(binaryTree.getRight());
		Assertions.assertThat(sum).isEqualTo(40);
		
		sum = binaryTree.sumByLevels(binaryTree.getRight().getRight());
		Assertions.assertThat(sum).isEqualTo(34);
		
	}
}
