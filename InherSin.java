class A{
  public void prin(){
    System.out.println("This is class A");
  }
}

class B extends A{
  public void prinDif(){
    System.out.println("This is class B");
  }
}

class C extends B{
  public void prin(){
    System.out.println("This is class C");
  }
}

class InherSin{
  public static void main(String[] args) {
    C c = new C();
    c.prin();
    c.prinDif();
    c.prin();
  }
}
