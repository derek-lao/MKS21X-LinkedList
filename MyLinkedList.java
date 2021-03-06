public class MyLinkedList{
  // we want the user to see the DATA in the node, but NOT THE NODE ITSELF
  private Node start,end;
  private int length;


  public MyLinkedList(){
    length=0;
    // initiate();
  }

  /** adds the specified element to the end of the list
  * @param value is the specified elmeent being added
  * I will attempt to change the end node to a different node,
  * with data as the element
  */
  public boolean add(Integer value){
    if(length==0)
    {
      start=new Node(value);
      end=start;
      start.setNext(end);
      start.setPrev(null);
      end.setPrev(start);
      end.setNext(null);
      length++;
      return true;
    }
    Node holder=end;
    // System.out.println("The holder has "+holder.get());
    Node endPrev=end.prev();
    holder.setPrev(endPrev);
    endPrev.setNext(holder);
    end=new Node(value);
    // System.out.println("The new end has "+end.get());
    end.setPrev(holder);
    holder.setNext(end);
    end.setNext(null);
    start.setPrev(null);
    length++;
    // System.out.println("Element to be added: "+value);
    // System.out.println("List now: "+this.toString());
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
    if(length==0)
    return "[]";
    String answer="["+start.get();
    Node current=start;
    int i=1;
    while(current.hasNext()&&i<length)
    {
      current=current.next();
      answer+=(","+current.get());
      i++;
    }
    return answer+"]";
  }

  /**
  *Returns the element at the specified position in this list.
  *@param index is the specified position
  *@return the element at that specified position
  */
  public Integer get(int index){
    if(index<0||index>=length)
    throw new IndexOutOfBoundsException();
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
    if(index<0||index>=length)
    throw new IndexOutOfBoundsException();
    Integer originalValue=this.getNode(index).get();
    this.getNode(index).set(value);
    return originalValue;
  }

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

  /**
  *Inserts the specified element at the specified position in this list.
  Shifts the element currently at that position (if any) and any
  subsequent elements to the right (adds one to their indices).
  *@param index is the specified position
  *@param value is the element to be inserted
  */
  public void add(int index,Integer value){
    if(index<0||index>length)
    throw new IndexOutOfBoundsException();
    // System.out.println("List before: "+this.toString());
    if(index==length)
    this.add(value);
    else
    {
      Node current=this.getNode(index);
      // System.out.println("My data in my current node I am looking at is: "+current.get());
      // System.out.println("Does my current hasPrev? Expecting false: "+current.hasPrev());
      // System.out.println("Does my start hasPrev? Expecting false: "+start.hasPrev());
      Node answer=new Node(value);
      if(current.hasPrev())
      {
        Node currentPrev=current.prev();
        currentPrev.setNext(answer);
        answer.setPrev(currentPrev);
        current.setPrev(answer);
        answer.setNext(current);
      }
      else
      {
        start=new Node(value);
        // System.out.println("The data in this new start node is: "+start.get());
        current.setPrev(start);
        start.setNext(current);
        start.setPrev(null);
      }
      length++;
    }
    // System.out.println("List after: "+this.toString());
  }

  /**
  *changes reference points in the code
  *remove Node at given index, returns removed element
  *@param index is the specified index
  *@return the removed element
  */
  public Integer remove(int index){
    if(index<0||index>=length)
    throw new IndexOutOfBoundsException();
    else{
      Node current=this.getNode(index);
      Integer answer=current.get();
      if(index==length-1)
      {
        Node currentPrev=current.prev();
        end.set(currentPrev.get());
        end.setPrev(currentPrev.prev());
        end.setNext(null);
        return answer;
      }
      if(index==0)
      {
        Node currentNext=current.next();
        start.set(currentNext.get());
        start.setNext(currentNext.next());
        start.setPrev(null);
        return answer;
      }
      else
      {
        Node currentNext=current.next();
        Node currentPrev=current.prev();
        currentPrev.setNext(currentNext);
        currentNext.setPrev(currentPrev);
        return answer;
      }
    }
  }

  /**
  *Removes the first occurrence of the specified element from this list,
  if it is present.
  If this list does not contain the element, it is unchanged
  *@param value is the element to be removed
  *@return true if the list includes the element, and false if not
  */
  public boolean remove(Integer value){
    if(this.contains(value))
    {
      this.remove(this.indexOf(value));
      return true;
    }
    else
    {
      return false;
    }
  } //indexOf() would also be useful

  public void extend(MyLinkedList other){
          //in O(1) runtime, move the elements from other onto the end of this
          //The size of other is reduced to 0
          //The size of this is now the combined sizes of both original lists
    this.end.setNext(other.start);
    other.start.setPrev(this.end);
    this.length=this.length+other.size();
    other.length=0;
    other.start.setPrev(null);
    other.end.setNext(null);
  }

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
