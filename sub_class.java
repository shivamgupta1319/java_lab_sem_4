class super_class{
int num = 20;
public void display(){
System.out.println("this is display method of super class");
}
}
public class sub_class extends super_class{
int num = 10;
public void display(){
System.out.println("this is display method of sub class");
}
public static void main(String[] args){
sub_class sub = new sub_class();
sub.display();
super.display();
System.out.println("value of the variable num in sub class is " +sub.num);
//System.out.println("value of the variable num in super class is " +super.num);
}
}