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
public class T_19_Top_View_of_Btree{
           static public LinkedList<Integer>  view(Node root){
      
     LinkedList<Integer> list=new LinkedList<Integer>();
     Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
     Queue <pair> queue=new LinkedList<pair>();
     queue.offer(new pair(root, 0));
     while(!queue.isEmpty()){
         pair it= queue.poll();
         int ht=it.num;
         Node node=it.node;
         if(!map.containsKey(ht)){map.put(ht,node.key);}
         if(node.left!=null){queue.offer(new pair(node.left,ht-1));}
         if(node.right!=null){queue.offer(new pair(node.right,ht+1));}
     }
     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
         list.add(entry.getValue());
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
        LinkedList<Integer> list=view(root);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
}
}