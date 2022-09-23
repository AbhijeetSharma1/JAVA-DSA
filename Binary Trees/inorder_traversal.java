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
        inorder(root);
        System.out.println();
        inorder_iterative(root);
        System.out.println();
        inorder_iterative1(root);
    }
    
    //Recursive Approach
    
    public static void inorder(Node root){
	    if(root == null) return;
	    inorder(root.left);
	    System.out.print(root.value + " ");
	    inorder(root.right);
	}
	
	
	//Iterative Approaches
	
	//Inorder Iterative approach 1 = efficient stack space(height of B.T)
	public static void inorder_iterative(Node root){
	    Stack<Node> s = new Stack<>();
	    while(true){
	        while(root != null){
	            s.push(root);
	            root = root.left;
	        }
	        if(root == null){
	            if(s.empty()) break;
	            root = s.pop();
	            System.out.print(root.value + " ");
	            root = root.right;
	        }
	    }
	}
	
	//Inorder Iterative approach 2 = uses more stack space
	public static void inorder_iterative1(Node root){
	    Stack<Node> s = new Stack<>();
	    s.push(root);
	    while(true){
	        while(root != null){
	            root = s.pop();
	            if(root == null) continue;
	            s.push(root.right);
	            s.push(root);
	            s.push(root.left);
	        }
	            if(s.empty()) break;
	            root = s.pop();
	            if(root == null) {
	                if(s.empty()) break;
	                root = s.pop();
	            }
	            System.out.print(root.value + " ");
	            root = root.right;
	    }
	}
}
