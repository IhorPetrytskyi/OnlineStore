package throwable;

public class Division {
  public void div (int a, int b){

      int result = a/b;
      System.out.println(result);
  }

    public static void main(String[] args) {
        Division division = new Division();
try {
    division.div(3,0);
}catch (ArithmeticException e){
    System.out.println("cant divide on zero");

}



    }
}
