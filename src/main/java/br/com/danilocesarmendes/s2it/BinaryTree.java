package br.com.danilocesarmendes.s2it;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Danilo Mendes
 */
public class BinaryTree {

	private Integer value;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree(int value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	public BinaryTree getLeft() {
		return left;
	}

	void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	void setRight(BinaryTree right) {
		this.right = right;
	}

	public void insert(int item) {
		int valorNoAtual = value;
		if (item < valorNoAtual) {
			if (left == null) {
				left = new BinaryTree(item);
			} else {
				left.insert(item);
			}
		} else {
			if (right == null) {
				right = new BinaryTree(item);
			} else {
				right.insert(item);
			}
		}
	}

	public void walkLevels(BinaryTree node) {
		if (node == null)
			throw new IllegalArgumentException("Tree node cannot be null!");
		Deque<BinaryTree> fila = new ArrayDeque<>();
		fila.add(node);
		while (!fila.isEmpty()) {
			BinaryTree atual = fila.removeFirst();
			System.out.printf("%s, ", atual.getValue());
			if (atual.getLeft() != null)
				fila.add(atual.getLeft());
			if (atual.getRight() != null)
				fila.add(atual.getRight());
		}
	}

	public Integer sumByLevels(BinaryTree node) {
		Integer sum = 0;
		if (node == null)
			throw new IllegalArgumentException("Tree node cannot be null!");
		Deque<BinaryTree> fila = new ArrayDeque<>();
		fila.add(node);
		while (!fila.isEmpty()) {
			BinaryTree atual = fila.removeFirst();
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
		BinaryTree other = (BinaryTree) obj;
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
		return "BinaryTree [value=" + value + ", left=" + left + ", right=" + right + "]";
	}

}
