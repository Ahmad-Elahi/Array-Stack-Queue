public class ArrayQueue implements Queue{
  private int pointer_head = -1;
  private int pointer_tail = -1;
  private Element [] array;
  private int num = 3; //array.length - 1;
  public ArrayQueue(){
    array = new Element[4];
  }
  
    public void enQueue(Element e){
      array[pointer_tail] = e;
      if(pointer_tail == array.length){
        pointer_tail = 1;
      }
      else{
        pointer_tail++;
      }
    }
    
    public Element deQueue(){
      Element elem = array[pointer_head];
      if(pointer_head == array.length){
        pointer_head = 1;
      }
      else{
        pointer_head++;
      }
      return elem;
    }
    
    // implements  pseudocode
    public boolean queueEmpty(){
      if((pointer_head > pointer_tail) || (pointer_tail == -1)){
        return true;
      }
      else{
        return false;
      }
    }
    
    // implements  pseudocode
    public boolean queueFull(){
      if(num == pointer_tail){
        return true;
      }
      else{
        return false;
      }
    }
    
    public int getHeadValue(){
      return this.array[pointer_head].getKeyValue();
    }
    
    public int getTailValue(){
      return this.array[pointer_tail].getKeyValue();
    }
  }