public class Operations implements OldFashionPoundOperation {
    @Override
    public void sum(OldFashionPound a, OldFashionPound b) {
        int p = a.pound + b.pound;
        int s = a.shilling + b.shilling;
        int d = a.pence + b.pence;
        if (d > 12){
            s += 1;
            d = d - 12;
        }
        if (s > 20){
            p += 1;
            s = s - 20;
        }
        System.out.println("The sum is = " + p + "p " + s + "s " + d+ "d");

    }

    @Override
    public void subtraction(OldFashionPound a, OldFashionPound b) {
    }

    @Override
    public OldFashionPound multiplication() {
        return null;
    }

    @Override
    public OldFashionPound division() {
        return null;
    }
}
