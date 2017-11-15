package prog6_Testing;

public class Node<K extends Comparable<K>, V> {

	public K key;
	public V value;
	public Node left;
	public Node right;

	public Node() {
	}

	public Node(K newkey, V newvalue) {
		key = newkey;
		value = newvalue;
	}

}
