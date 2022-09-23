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
        postorder_iterative(root);
        System.out.println();
        postorder_iterative(root);
    }
    
    //Recursive Approach
    
    public static void postorder(Node root){
	    if(root == null) return;
	    postorder(root.left);
	    postorder(root.right);
	    System.out.print(root.value + " ");
     }

     //Postorder Iterative Approach
	public static void postorder_iterative(Node root){
	    Stack<Node> s = new Stack<>();
	    boolean check = true;
	    while(true){
	        while(root != null && check){
	            s.push(root);
	            root = root.left;
	        }
	        if(s.empty()) break;
	        if(root != s.peek().right){
	            root = s.peek().right;
	            check = true;
	            continue;
	        }
	        root = s.pop();
	        System.out.print(root.value + " ");
	        check = false;
	    }
	}
}
