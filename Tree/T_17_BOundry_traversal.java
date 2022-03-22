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
public class T_17_BOundry_traversal{
           static public LinkedList<Integer> boudry(Node root){
      LinkedList<Integer> list =new LinkedList<Integer>();
      if(isleaf(root)==false)list.add(root.key);
      left(root,list);
      mid(root,list);
      right(root,list);
      return list;
    
     }

     static public boolean isleaf(Node node) {return (node.left==null)&&(node.right==null);}

     static public void left (Node root,List<Integer> list){
     Node current =root.left;
     if(isleaf(current)==true){return;}
     while(current!=null){
         if(isleaf(current)==false){
             list.add(current.key);
         }
         if(current.left==null){
             current=current.right;
         }
         else
         current=current.left;
     }
     }
     static public void mid(Node root ,LinkedList<Integer> list){
         if(isleaf(root)==true){
             list .add(root.key);
             return;
         }
         if(root.left!=null)mid(root.left,list);
         if(root.right!=null)mid(root.right,list);

     }

     static public void right(Node root,LinkedList<Integer> list){
         Node current =root.right;
         Stack<Integer> stack=new Stack<Integer>();
         while(current!=null){
            if(isleaf(current)==false)stack.push(current.key);
            if(current.right!=null){current=current.right;}
            else current =current.left;
         }
         while(!stack.isEmpty()){
             list.add(stack.pop());
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
     LinkedList<Integer> list=boudry(root);
     for(int i=0; i<list.size(); i++){
         System.out.print(list.get(i)+" ");
     }

}
}