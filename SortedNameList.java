public class SortedNameList {
    private NameNode head;
    private NameNode current;
  
    public SortedNameList(){
      head = null;
      current = null;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    public boolean contains(String name) {
        NameNode ptr = head;
        if (ptr.getName() == name)
            return true;
        else
            return false;
    }
  
    public void add(String name){
        if(head == null)
          head = new NameNode(name, null);
        else
          if(afterLastName(name))
            append(name);
          else
            insert(name);
    }

    private void insert(String newName) {
        NameNode leadPtr = head;
        NameNode tailPtr = head;
        while (leadPtr.getName().compareToIgnoreCase(newName) < 0) {
            tailPtr = leadPtr;
            leadPtr = leadPtr.getNext();
        }
        tailPtr.setNext(new NameNode(newName, leadPtr));
    }

    private void append(String newName) {
        if (head == null)
      head = new NameNode(newName, null);
    else {
      NameNode tempPtr = head;
      while(tempPtr.getNext() != null)
      tempPtr = tempPtr.getNext();
            
      tempPtr.setNext(new NameNode(newName, null));
        }
    }

    public void delete(String name){
        NameNode leadPtr = head;
        NameNode tailPtr = head;
        while (leadPtr.getName().compareToIgnoreCase(name) < 0) {
            tailPtr = leadPtr;
            leadPtr = leadPtr.getNext();
          }
          tailPtr.setNext(leadPtr.getNext());

    }
  
    private boolean afterLastName(String new_name){
      return getLastNameInList().compareToIgnoreCase(new_name) < 0;
    }
  
    private String getLastNameInList(){
        NameNode ptr = head;
  
        while(ptr.getNext() != null){
          ptr = ptr.getNext();
        }

        return ptr.getName();
    }


    public void print() {
      if(isEmpty())
          System.out.println("ss");
      else {
          NameNode tempPtr = head;
          while (tempPtr != null) {
              System.out.println(tempPtr.getName());
              tempPtr = tempPtr.getNext();
          }
      }
  }
    
}