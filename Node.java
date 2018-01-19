public class Node{
    
    //Define variables to save value
    private int value;
    
    //Define variable to link nodes
    private Node next;
    
    //Consturctor
    public Node(){
        this.value = 0;
        this.next = null;
    }
    
    //Getter and Setter methods
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
}