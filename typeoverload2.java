class typeoverload2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
   typeoverload2 obj=new  typeoverload2();  
  obj.sum(20,20);    //now int arg sum() method gets invoked  
  }  
}  