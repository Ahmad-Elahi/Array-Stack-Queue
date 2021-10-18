public class ArrayStack implements Stack{
  private int pointer = -1;  // Points to the top of array
  private Element [] array;
  public ArrayStack(){
    array = new Element[4];
  }  
  // implements  pseudocode
    public void push(Element e){
    if(stackFull()){
      System.out.println("stack is full!");
    }
    else{
      pointer++;
      array [pointer] = e;
    }
  }
    
    public boolean stackEmpty(){
    if(pointer == -1){
      return true;
    }
    else{
      return false;
    }
  }
  
    // implements  pseudocode
    public boolean stackFull(){
      if(pointer == array.length){
        return true;
      }
      else{
        return false;
      }
    }
      
      public int getTopValue(){
        return this.array[pointer-1].getKeyValue();
      }

  public Element pop(){
    if(stackEmpty()){
      System.out.println("stack is empty!");
    }
    else{ 
      this.pointer--;
      return this.array[pointer];
    }
  } 
}

  
    