public class PhOMat{
  public static void main(String[] a){
    String[] word1 = {"one", "two", "three", "four", "five", "six"};
    String[] word2 = {"is", "the", "was", "there"};
    String[] word3 = {"yes", "nothing", "something"};

    int r1 =(int) (Math.random() * word1.length);
    int r2 =(int) (Math.random() * word2.length);
    int r3 =(int) (Math.random() * word3.length);

    System.out.println(word1[r1] +" "+ word2[r2] +" "+word3[r3]);

   }

}
