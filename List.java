public class List{
    
    //Variables first element and size list
    private Node start;
    private int size;
    
    //Constructor
    public List(){
        start = null;
        size = 0;
    }
    
    //Check if is empty list
    public boolean isEmpty(){
        return start == null;
    }
    
    //Check size list
    public int getSize(){
        return size;
    }
    
    //Add node at the end
    public void addEnd(int value){
        Node newNode = new Node();
        newNode.setValue(value);
        
        if (isEmpty()) {
            start = newNode;
        } else{
            // Crea ua copia de la lista.
            Node aux = start;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++;
    }
    
    //Add node at the start
    public void addStart(int value){
        Node newNode = new Node();
        newNode.setValue(value);
        
        if (isEmpty()) {
            start = newNode;
        } else{
            newNode.setNext(start);
            start = newNode;
        }
        
        size++;
    }
    
    //Find value
    public boolean find(int value){
        Node aux = start;
        boolean found = false;
        
        while(aux != null && found != true){
            if (value == aux.getValue()){
                found = true;
            }else{
                aux = aux.getNext();
            }
        }
        
        return found;
    }
    
    //Remove node by value
    public void removeByValue(int value){
        if(find(value)){
            if(start.getValue() == value){
                start = start.getNext();
            }else{
                Node aux = start;
                
                while(aux.getNext().getValue() != value){
                    aux = aux.getNext();
                }
                
                Node next = aux.getNext().getNext();
                aux.setNext(next);
            }
            size--;
        }
    }
    
    //Delete LinkedList
    public void delete(){
        if(!isEmpty()){
            start = null;
            size = 0;
        }
    }
    
    //Print list
    public void printList(){
        if (!isEmpty()) {
            Node aux = start;
            int i = 0;
            
            System.out.print("\n*** LinkedList, Size: " + size + " elements ***\n");
            
            while(aux != null){
                System.out.print("[" + aux.getValue() + "]" + " ->  ");
                aux = aux.getNext();
                i++;
            }
        }else{
            System.out.print("\n*** LinkedList is empty ***\n");
        }
        System.out.print("\n\n");
    }
}