//must create public class with the name IDENTICAL to the file name
public class Test{
  public int num;
  //must then create contructor with public and name IDENTICAL to the file name
  //in the brackets we put what our constructor is receving
  //in this examples its an int
  public Test(int a){
    //we need somewhere to store the int received
    //will be stored into the public num
    num = a;
  }

  //This is a method in the class
  //It can be called from the main class
  //It will print out the int
  public void print(){
    System.out.println(num);
  }
  //Go back to main 
}