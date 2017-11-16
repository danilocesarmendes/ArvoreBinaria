package br.com.danilocesarmendes.s2it;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Danilo Mendes
 */
public class NodeBinaryTree {

	private Integer value;
	private NodeBinaryTree left;
	private NodeBinaryTree right;

	public NodeBinaryTree(int value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	public NodeBinaryTree getLeft() {
		return left;
	}

	void setLeft(NodeBinaryTree left) {
		this.left = left;
	}

	public NodeBinaryTree getRight() {
		return right;
	}

	void setRight(NodeBinaryTree right) {
		this.right = right;
	}

	public void insert(int item) {
		int valorNoAtual = value;
		if (item < valorNoAtual) {
			if (left == null) {
				left = new NodeBinaryTree(item);
			} else {
				left.insert(item);
			}
		} else {
			if (right == null) {
				right = new NodeBinaryTree(item);
			} else {
				right.insert(item);
			}
		}
	}

	public void walkLevels(NodeBinaryTree node) {
		if (node == null)
			throw new IllegalArgumentException("Tree node cannot be null!");
		Deque<NodeBinaryTree> fila = new ArrayDeque<>();
		fila.add(node);
		while (!fila.isEmpty()) {
			NodeBinaryTree atual = fila.removeFirst();
			System.out.printf("%s, ", atual.getValue());
			if (atual.getLeft() != null)
				fila.add(atual.getLeft());
			if (atual.getRight() != null)
				fila.add(atual.getRight());
		}
	}

	public Integer sumByLevels(NodeBinaryTree node) {
		Integer sum = 0;
		if (node == null)
			throw new IllegalArgumentException("Tree node cannot be null!");
		Deque<NodeBinaryTree> fila = new ArrayDeque<>();
		fila.add(node);
		while (!fila.isEmpty()) {
			NodeBinaryTree atual = fila.removeFirst();
			System.out.printf("%s, ", atual.getValue());
			sum += atual.getValue();
			if (atual.getLeft() != null)
				fila.add(atual.getLeft());
			if (atual.getRight() != null)
				fila.add(atual.getRight());
		}
		System.out.println("\nvalor total: " + sum);
		return sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeBinaryTree other = (NodeBinaryTree) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NodeBinaryTree [value=" + value + ", left=" + left + ", right=" + right + "]";
	}

}
