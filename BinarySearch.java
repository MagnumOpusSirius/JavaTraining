import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.stream.StreamSource;

//Binary Tree:
/*
    When is it a Binary tree:
    - at most 2 children
    - exactly 1 root
    - exactly 1 path b/w root and any node

    How to represent binary tree programatically:
    - We represent nodes as objects so like an instance of a class
    
        Node = root
        node.left and node.right

    Depth First Values:
    - initialze the stack using java.util.Stack
    - so initialize the stack with the root node so we represent the top of stack
    - keep running the algo while there is stuff in our stack
    - check for the edge case
        if(root == null){
            return empty array;
        }
        while(stack.length > 0){
            int current = stack.pop()
            - also check for the value that it is popping
            if(current.left exists then only push left){
                stack.push(current.left);
            }
            if(current.right exists then only push right){
                stack.push(current.right);
            }
            
        }


 */
public class BinarySearch {
    //it has nodes -> key(data) 
    // there are only at most 2 children for any given node -> left and right child
    // so it can have no child, 1 child or 2 child at most.

    Node root; //most important node is the root.
  
    //we traverse the tree from the root.
    void add(int data){
        Node nodeToAdd= new Node(data);
        if(root==null){
            root=nodeToAdd;
            
        }
        // if data < node, then traverse left child
        // else travers right child
        // until we get to a node that we cant traverse...insert new node
        traverseAndAddNode(root, nodeToAdd);
        
    }
    private void traverseAndAddNode(Node node, Node nodeToAdd){
        if(nodeToAdd.data < node.data){
            if(node.leftChild == null){
                node.leftChild=nodeToAdd;
            }
            else{
                traverseAndAddNode(node.leftChild, nodeToAdd);
            }
            
        }
        else if(nodeToAdd.data > node.data){
            if(node.rightChild==null){
                //add the right child if it is null
                node.rightChild=nodeToAdd;
            }
            else{
                //else traverse and add the node
                traverseAndAddNode(node.rightChild, nodeToAdd);
            }
            
        }
    }
    //types of traversal:
    /* Pre Order
     * In Order
     * Post Order 
     */
    public void traverse(){
        //given the root node is not null:
        if(root!=null){
            //in order traversal:
            Node nodeToTraverse=root;
            if(nodeToTraverse.leftChild != null){
                inOrderTraversal(nodeToTraverse.leftChild);

            }
        }
    }
    private void inOrderTraversal(Node node){
        if(node.leftChild != null){
                inOrderTraversal(node.leftChild);
        }
        System.out.println(node.data);

    }
    private static int binarySearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int valMid=arr[mid];
            if(target==valMid){
                return mid;
            }
            if(target < valMid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int target=8;

        System.out.println(binarySearch(arr, target));
    }
} 
