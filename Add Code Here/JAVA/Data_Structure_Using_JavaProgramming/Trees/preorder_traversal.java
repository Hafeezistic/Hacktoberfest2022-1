class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() { root = null; }

	void printPreorder(Node node)
	{
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left subtree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	void printPreorder() { printPreorder(root); }

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println(
			"Preorder traversal of binary tree is ");
		tree.printPreorder();
	}
}
