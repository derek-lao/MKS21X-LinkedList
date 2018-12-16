public class MyLinkedList{
  // we want the user to see the DATA in the node, but NOT THE NODE ITSELF
  private Node start,end;
  private int length;

  private void initiate(){
    this.start.setPrev(null);
    this.end.setNext(null);
  }

  public MyLinkedList(){
    length=0;
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
    for(Node current=start,int i=0;i!=index;)
  }
  public Integer set(int index,Integer value){}

  public boolean contains(Integer value){}
  public int indexOf(Integer value){}

  public void add(int index,Integer value){}
  public Integer remove(int index){}
  public boolean remove(Integer value){} //indexOf() would also be useful

  public boolean hasNext(){
    return this.next()!=null;
  }
  public boolean hasPrev(){
    return this.prev()!=null;
  }

}
