import java.util.*;
class Node{
    int value;
    Node left, right;
    public Node(int value){
        this.value = value;
        left = right = null;
    }
}
public class Main
{
	public static void main(String[] args) {
	Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preorder(root);
        System.out.println();
        preorder_iterative(root);
        System.out.println();
        preorder_iterative1(root);
    }
    
    //Recursive Approach
    
    public static void preorder(Node root){
	    if(root == null) return;
	    System.out.print(root.value + " ");
	    preorder(root.left);
	    preorder(root.right);
	}
	
	
	//Iterative Approaches
	
	//preorder Iterative approach 1 = efficient stack space(height of B.T)
	public static void preorder_iterative(Node root){
	    Stack<Node> s = new Stack<>();
	    while(true){
	        while(root != null){
	            s.push(root);
	            System.out.print(root.value + " ");
	            root = root.left;
	        }
	        if(root == null){
	            if(s.empty()) break;
	            root = s.pop();
	            root = root.right;
	        }
	    }
	}
	
	//Preorder Iterative approach 2 = uses more stack space
	public static void preorder_iterative1(Node root){
	    Stack<Node> s = new Stack<>();
	    s.push(root);
	    while(true){
	        if(s.empty()) break;
	        root = s.pop();
	        if(root == null) continue;
	        System.out.print(root.value + " ");
	        s.push(root.right);
	        s.push(root.left);
	    }
	}
}
