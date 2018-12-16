public class MyLinkedList{
  // we want the user to see the DATA in the node, but NOT THE NODE ITSELF
  private Node start,end;
  private int length;


  public MyLinkedList(){
    length=0;
    initiate();
  }

  /** adds the specified element to the end of the list
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

  /**
  *@return the number of elements in this list
  */
  public int size(){
    return length;
  }

  /**
  *note you don't have get(index) yet, nor would you want to use it here
  *@return a string in the form of [element,element,element]
  */
  public String toString(){
    String answer="["+start.get();
    for(Node current=start;current.hasNext();current=current.next())
    {
      answer+=(","+current.get());
    }
    return answer+"]";
  }

  /**
  *Returns the element at the specified position in this list.
  *@param index is the specified position
  *@return the element at that specified position
  */
  public Integer get(int index){
    return this.getNode(index).get();
  }

  /**
  *replaces element at the specified position on the list with
  a specified value, and returns the previous value
  *@param index is the specified position
  *@param value is the element that is to replace the original value
  *@return the element previously at the specified positions
  */
  public Integer set(int index,Integer value){
    Integer originalValue=this.getNode(index).get();
    this.getNode(index).set(value);
    return originalValue;
  }

  /*
  this is actually an interesting way to figure out contains, using toString
  but it is actually a bit slower than if we just cycle through the whole list
  and see if it is contained

  // public boolean contains(Integer value){
  //   return this.toString().contains(value+"");
  // }
  */

  /**
  *check if the value is contained in the list at all
  @param value is the value that the user is going to check the whole list for
  @return true if the value is found, and false if the value has not been found
  */
  public boolean contains(Integer value){
    //we might use indexOf
    return indexOf(value)!=-1;
  }

  /**
  *Returns the index of the first occurrence of the specified element
  in this list, or -1 if this list does not contain the element
  *@param value is the specified elements
  *@return the index of the first occurence, or -1 if the element
  is not contained
  */
  public int indexOf(Integer value){
    Node current=start;
    int i=0;
    while(current.hasNext())
    {
      if(current.get()==value)
      {
        return i;
      }
      current=current.next();
      i++;
    }
    return -1;
  }
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
