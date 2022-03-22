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
  
public class T_5_levelorder_traversal {
    static public void level(Node root){
        Queue<Node> queue = new LinkedList<Node>();
         queue.offer(root);
         while(!queue.isEmpty()){
             int level_num=queue.size();
             for(int i=0;i<level_num;i++){
                
                 if(queue.peek().left!=null){queue.offer(queue.peek().left);}
                 if(queue.peek().right!=null){queue.offer(queue.peek().right);}
                 System.out.print(queue.poll().key+" ");
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
        level(root);
	}
}


