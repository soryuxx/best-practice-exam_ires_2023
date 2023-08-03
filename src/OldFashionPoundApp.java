public class OldFashionPoundApp {
  // 1d = 1d, 1s = 12d, 1p = 20 s;

  public static void main(String[] args){
    //5p 17s 8d + 3p 4s 10d
    OldFashionPound a = new OldFashionPound(5, 17, 8);
    OldFashionPound b = new OldFashionPound(3, 5, 10);
    Operations sum = new Operations();
    sum.sum(a, b);



  }

}