public class MyLinkedList{
  // we want the user to see the DATA in the node, but NOT THE NODE ITSELF
  private Node start,end;
  private int length;


  public MyLinkedList(){
    length=0;
    initiate();
  }

  /** adds the specified element to the end of the list
  *
  * @param value is the specified elmeent being added
  * I will attempt to change the end node to a different node,
  * with data as the element
  */
  public boolean add(Integer value){
    Node answer=new Node(value);
    end.setNext(answer);
    length++;
    return true;
  }
  public int size(){
    return length;
  }

  //note you don't have get(index) yet, nor would you want to use it here
  public String toString(){
    String answer="["+start.get();
    for(Node current=start;current.hasNext();current=current.next())
    {
      answer+=(","+current.get());
    }
    return answer+"]";
  }
  public Integer get(int index){
    return this.getNode(index).get();
  }

  /**
  * @return the element previously at the specified positions
  */
  public Integer set(int index,Integer value){
    Integer originalValue=this.getNode(index).get();
    this.getNode(index).set(value);
    return originalValue;
  }

  public boolean contains(Integer value){
    return this.toString().contains(value+"");
  }
  public int indexOf(Integer value){}

  public void add(int index,Integer value){}
  public Integer remove(int index){}
  public boolean remove(Integer value){} //indexOf() would also be useful


  // helper function to clearly set the start and next nodes
  private void initiate(){
    this.start.setPrev(null);
    this.end.setNext(null);
  }
  // helper function to loop through the linked list to get a node
  // at a specific index.  That node would be used for whatever it needs
  // to be used for in other methods, such as get(index) and set(value,index)
  private Node getNode(int index){
    Node current=start;
    int i=0;
    while(i<index && current.hasNext())
    {
      current=current.next();
      i++;
    }
    return current;
  }

}
