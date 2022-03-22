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
public class T_16_zig_zak_traversal{
           static public LinkedList<LinkedList<Integer>>  zig(Node root){
      
     LinkedList<LinkedList<Integer>> list=new LinkedList<LinkedList<Integer>>();
     boolean lefttoright=true;
     if(root==null) return list;
     Queue<Node> queue=new LinkedList<Node>();
     queue.offer(root);
     while(!queue.isEmpty()){
         int size = queue.size();
         LinkedList<Integer> li=new LinkedList<Integer>();
         for(int i=0;i<size;i++){
             Node node=queue.poll();

             int index =(lefttoright)?i:size-1-i;
             li.add(index, node.key);
             if(node.left!=null){
             queue.offer(node.left);
             }
             if(node.right!=null){
             queue.offer(node.right);
             }
         }
         lefttoright=!lefttoright;
         list.add(li);

     }
     return list;
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
     System.out.println(zig(root));
}
}