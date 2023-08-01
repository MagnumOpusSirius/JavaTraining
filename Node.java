public class Node{
    //provide data for binary tree
    int data;
    Node leftChild;
    Node rightChild;

    public Node(){

    }
    //base constructor to define the intial values of our nodes
    //data is the intial root value
    //left and right child are by default empty or null
    public Node(int data){
        this.data=data;
        this.leftChild= null;
        this.rightChild=null;
    }
}