class Main {
  public static void main(String[] args) {
    
    int andrew = 1;
    
    //this is how you declare an object from a class
    //any thing inside the brackets is passed to the class
    //in this example im passing an int
    //it requires an adittional file on the left side
    //that file must end in .java
    Test obj = new Test(andrew);
    
    //go to the class now

    //to call a method from a class you type NAME-OF-OBJECT.method-name();
    obj.print();

    //Thats ur 5 min tutorial
  }
}