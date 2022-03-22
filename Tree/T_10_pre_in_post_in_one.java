import java.util.*;

class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
  
class pair{
    int num ;
    Node node;
    pair(Node _node, int val){
        num=val;
        node =_node;
    }
}
public class  T_10_pre_in_post_in_one{
    static public void itration(Node root){
        Stack<pair> st1 = new Stack<pair>(); 
        if(root == null) System.out.println("null"); 
        List<Integer> in = new ArrayList<Integer>();
        List<Integer> post = new ArrayList<Integer>();
        List<Integer> pre= new ArrayList<Integer>();
        st1.add(new pair(root,1));
        while(!st1.isEmpty()){
            pair it =st1.pop();
            if(it.num==1)
            {
                pre.add(it.node.key);
                it.num++;
                st1.push(it);
                if(it.node.left!=null)
                {
                    st1.push(new pair(it.node.left,1));
                }
            }
            if(it.num==2){
                in.add(it.node.key);
                it.num++;
                st1.push(it);
                if(it.node.right!=null){
                    st1.push(new pair(it.node.right,1));
                }
            }
            else{
                post.add(it.node.key);
            }
        }
        
    }


    
	public static void main(String[] args)
	{
	
		/*create root*/
		Node root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

		root.left = new Node(2);
		root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
			1
			/	 \
		2	 3
		/ \	 / \
	null null null null */


		root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/
        itration(root);
	}
}
