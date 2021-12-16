public class Counter{
  private int count = 0;
  
  public void increment(){
    count++;
  }
  private int getValue(){
    return count;
  } 

  public static void main(String[] args) {
  	Counter obj = new Counter();
	for(int i = 0; i<10;i++){
	obj.increment();
	System.out.println("Counter : " + obj.getValue());
	}
    
  }
}