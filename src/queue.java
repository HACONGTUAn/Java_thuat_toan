// Queue implementation in Java

public class queue {
    int arr[];
  int size;
  int Front;
  int Rear;
  queue(){
      Front = -1;
      Rear = -1;
      size = 5;
      arr = new int[size];
  }
  boolean checkisFull(){
      if(Rear == size -1 ){
          return true;
      }else {
          return false;
      }
  }
  boolean checkisEmpty(){
      if(Front == -1){
          return true;
      }
      return false;
  }
  void Enqueue(int x){
      if(checkisFull()){
          System.out.println("queue da day");
          System.exit(1);
      }
      if(Front == -1)
            Front = 0;
      arr[++Rear] = x;

  }

 int Dequeue(){
      int element;
      if(checkisEmpty()){
          System.out.println("queue trong ");
          System.exit(1);
      }
      element = arr[Front] ;
      if(Front == Rear){
          arr[Front] = 0;
          Front = -1;
          Rear = -1;
      }else {Front++;}
     System.out.println("Deleted -> " + element);
     return (element);
  }

  void printf(){
      for(int i = Front ; i<=Rear; i++){
          System.out.print( arr[i] +" ");
      }
  }
    public static void main(String[] args) {
        queue q = new queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(5);
        q.Dequeue();
        q.printf();
    }
}
