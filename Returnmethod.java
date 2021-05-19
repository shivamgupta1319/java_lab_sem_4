class Returnmethod
{ 
 void int[] main()
 {  
  return new int[]{10,30,50,90,60};  
 }  
  
 public static void main(String args[])
 {  
  int arr[]=main();   
  for(int i=0;i<arr.length;i++)  
  System.out.println(arr[i]);  
 }
}  