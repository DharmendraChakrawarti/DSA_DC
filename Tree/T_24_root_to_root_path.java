
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
public class T_24_root_to_root_path{
    static public boolean pathtopath(Node root,LinkedList<Integer> list,int x){
      if(root==null){return false;}
     list.add(root.key);
     if(root.key==x)return true;
     if(pathtopath(root.left,list,x)||pathtopath(root.right,list,x))return true;
     list.remove(list.size()-1);
     return false;
    }

    static public LinkedList<Integer> path(Node toot,int b){
     LinkedList<Integer> list = new LinkedList<Integer>();
      pathtopath(toot,list,b);
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
     LinkedList<Integer> ans=path(root,4);
     for(int it:ans){
         System.out.println(it);
     }
}
}