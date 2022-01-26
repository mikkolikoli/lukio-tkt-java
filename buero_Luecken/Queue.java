public class Queue<ContentType> {
    
    private QueueNode head;
    private QueueNode tail;
    
        private class QueueNode {

            private ContentType content = null;
            private QueueNode nextNode = null;

            /**
            * Ein neues Objekt vom Typ QueueNode<ContentType> wird erschaffen. 
            * Der Inhalt wird per Parameter gesetzt. Der Verweis ist leer.
            * 
            * @param pContent das Inhaltselement des Knotens vom Typ ContentType
            */
            public QueueNode(ContentType pContent) {
                content = pContent;
            }

            /**
            * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
            * gesetzt.
            * 
            * @param pNext der Nachfolger des Knotens
            */
            public void setNext(QueueNode pNext) {
                nextNode = pNext;
            }
        
            /**
            * Liefert das naechste Element des aktuellen Knotens.
            * 
            * @return das Objekt vom Typ QueueNode, auf das der aktuelle Verweis zeigt
            */
            public QueueNode getNext() {
              // EINFUEGEN
              return nextNode;
            }

            /**
            * Liefert das Inhaltsobjekt des Knotens vom Typ ContentType.
            * 
            * @return das Inhaltsobjekt des Knotens
            */
            public ContentType getContent() {
               // EINFUEGEN
               return content;
            }
        
        } // Ende der lokalen Klasse "QueueNode"

    /**
     * Eine leere Schlange wird erzeugt. 
     * Objekte, die in dieser Schlange verwaltet werden, muessen vom Typ
     *  sein.
     */
    public Queue() {
        head = null;
        tail = null;
    }

    /**
     * Die Anfrage liefert den Wert true, wenn die Schlange keine Objekte enthaelt, 
     * sonst liefert sie den Wert false.
     * 
     * @return true, falls die Schlange leer ist, sonst false
     */
    public boolean isEmpty() {
      // EINFUEGEN
      return head == null;
    }

    /**
     * Das Objekt pContentType wird BEIM TAIL an die Schlange angehaengt. 
     * Falls pContentType gleich null ist, bleibt die Schlange unveraendert.
     * 
     * @param pContent
     *            das anzuhaengende Objekt vom Typ ContentType
     */
    public void enqueue(ContentType pContent) {
        QueueNode h = new QueueNode(pContent);
        if(head!=null){
        tail.setNext(h);
        tail = tail.getNext();}
        else{
            head = h;
            tail = h;
        }
        // EINFUEGEN
    }

    /**
     * Das erste Objekt wird BEIM HEAD aus der Schlange entfernt. 
     * Falls die Schlange leer ist, wird sie nicht veraendert.
     */
    public void dequeue() {
        if (!isEmpty()) { 
            head = head.getNext();
          }
          if(head==null)
          {tail = null;}
    }

    /**
     * Die Anfrage liefert das erste Objekt der Schlange. 
     * Die Schlange bleibt unveraendert. 
     * Falls die Schlange leer ist, wird null zurueckgegeben.
     *
     * @return das erste Objekt der Schlange vom Typ ContentType oder null,
     *         falls die Schlange leer ist
     */
    
    public ContentType front() {
       // EINFUEGEN
       if (head != null) { 
       return head.getContent(); }
       return null;
    }
}
