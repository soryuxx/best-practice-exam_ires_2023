public class OldFashionPoundApp {
  // 1d = 1d, 1s = 12d, 1p = 20 s;

  public static void main(String[] args){
    OldFashionPound a = new OldFashionPound(5, 17, 8);
    OldFashionPound b = new OldFashionPound(3, 5, 10);
    OldFashionPound c = new OldFashionPound(8, 5, 10);
    Operations sum = new Operations();
    sum.sum(a, b);
    Operations sub = new Operations();
    sub.subtraction(a, b );
    sub.subtraction(a, c);
    Operations mult = new Operations();
    mult.multiplication(a, 2);
    Operations div = new Operations();
    OldFashionPound d = new OldFashionPound(18, 16, 1);
    div.division(d, 15);
    div.division(a, 3);



  }

}