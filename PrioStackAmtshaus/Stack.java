public class Stack<ContentType> {

  /* --------- Anfang der privaten inneren Klasse -------------- */

  private class StackNode {

    private ContentType content = null;
    private StackNode nextNode = null;
    public StackNode(ContentType pContent) {
      content = pContent;
      nextNode = null;
    }

    
    public void setNext(StackNode pNext) {
      nextNode = pNext;
    }

    
    public StackNode getNext() {
      return nextNode;
    }
    public ContentType getContent() {
      return content;
    }
  }

  /* ----------- Ende der privaten inneren Klasse -------------- */

  private StackNode head;

  
  public Stack() {
    head = null;
  }

  
  public boolean isEmpty() {
    return (head == null);
  }

  
  public void push(ContentType pContent) {
    if (pContent != null) {
      StackNode node = new StackNode(pContent);
      node.setNext(head);
      head = node;
    }
  }
  public void pop() {
    if (!isEmpty()) {
      head = head.getNext();
    }
  }
 public ContentType top() {
    if (!this.isEmpty()) {
      return head.getContent();
    } else {
      return null;
    }
  }
}
