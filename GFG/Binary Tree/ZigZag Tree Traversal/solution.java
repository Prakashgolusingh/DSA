
//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> arr = new ArrayList<>();
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    q.add(null);
	    boolean flag = true;
	    ArrayList<Integer> ar = new ArrayList<>();
	    while(!q.isEmpty())
	    {
	        Node temp = q.remove();
	        if(temp == null)
	        {
	            if(flag)
	                flag = false;
	            else
	            {
	                for(int i=ar.size()-1; i>=0; i--)
	                    arr.add(ar.get(i));
	                ar = new ArrayList<>();
                    flag = true;
	            }
	            if(q.isEmpty())
	                    return arr;
	                q.add(null);
	        }
	        else
	        {
	            if(flag)
	                arr.add(temp.data);
	            else
	                ar.add(temp.data);
	            if(temp.left != null)
	                q.add(temp.left);
	            if(temp.right != null)
	                q.add(temp.right);
	        }
	    }
	    return arr;
	}
}
