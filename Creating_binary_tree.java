import java.util.*;
public class Main
{
      static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = creatNode();
		display(root);
	}
	static Node creatNode()
	{
	      System.out.println("Enter data for root");
	      int data = sc.nextInt();
	      if(data == -1)
	            return null;
	      Node root = new Node(data);
	      System.out.println("Enter data for left of :"+ data);
	      root.left = creatNode();
	      System.out.println("Enter data for right of : "+ data);
	      root.right = creatNode();
	      return root;
	}
	static void display(Node root)
	{
	      if(root == null)
	            return;
	      System.out.println(root.data);
	      display(root.left);
	      display(root.right);
	            
	}
}
class Node
{
      int data;
      Node left,right;
      Node(int data)
      {
            this.data = data;
            left = null;
            right = null;
      }
}
