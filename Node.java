public class Node{

  private Node next,prev;
  private Integer data;

  public Node(Integer element){
    data=element;
  }

  public Node next(){
    return this.next;
  }
  public Node prev(){
    return this.prev;
  }
  public void setNext(Node other){
    this.next=other;
  }
  public void setPrev(Node other){
    this.prev=other;
  }
  public String toString(){}

  public Integer get(){
    return this.data;
  }
}
