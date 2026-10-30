package praktikum5;

public class Paint {
    private double coverege;

    public Paint(double c){
        this.coverege = c;
    }

    public double amount (Shape s){
    System.out.println ("Computing amount for " + s);
    return Math.ceil(s.area() / coverege);
    }
}
