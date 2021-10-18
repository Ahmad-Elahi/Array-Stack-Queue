import java.util.*;
public class Driver{
  private static final Stack s = new ArrayStack();
  private static final Queue q = new ArrayQueue();
  public static void main(String[]args){
    Random rand = new Random();
    
   int n = 4;
   int n1 = n - 1;
   int count = 0;
   int r;
   int m = n - 1;
   int j = 0;
   int k = 0;
   int v = 0;
   int minn = n+1; 
   Element minimum = new Element(minn, Integer.toString(minn));
   
   // Push in random numbers
   while(count <= n){
     r = rand.nextInt(1) + n1;
     Element ran = new Element(r, Integer.toString(r));
     s.push(ran);
     count++;
   }
   Element head = s.pop();
   
   while(k<=3){ // larger loop to repeat proceeding steps until whole atack sorted
     
   // step one.A
   for(int i=n1;i>=0;i--){ 
     if(head.getKeyValue()<minimum.getKeyValue()){
       minimum = head;
       j = i;
     }
     s.pop();
     q.enQueue(minimum); 
   }
   
   // step 1.B
   while(j<=m){
     if((q.getHeadValue() == minimum.getKeyValue()) && (j==0)){
       q.deQueue();
       s.push(minimum);
       r = 1;
       j = n;
     }
     else if(q.getHeadValue() == minimum.getKeyValue()){
       Element hold = new Element(minimum.getKeyValue(), Integer.toString(minimum.getKeyValue()));
       q.deQueue();
       j = n;
     }
     else{
       Element value = new Element(q.getHeadValue(), Integer.toString(q.getHeadValue()));
       q.deQueue();
       s.push(value);
     }
     j++;
   }
   
   // step 1.C
   for(int i = 0;i<j;i++){
     Element value1 = new Element(s.getTopValue(), Integer.toString(s.getTopValue()));
     s.pop();
     q.enQueue(value1);
   }
   
   // step 1.D
   if(!(s.getTopValue() == minimum.getKeyValue())){
     s.push(minimum);
   }
   
   // step 1.E
   while(q.queueEmpty() == false){
     Element value2 = new Element(q.getHeadValue(), Integer.toString(q.getHeadValue()));
     q.deQueue();
     s.push(value2);
   }
   k++;
  }
}
}
   