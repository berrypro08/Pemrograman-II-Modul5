package praktikum5;

public abstract class Shape {
    protected String shapeName;

    public Shape(String Nama){
        this.shapeName = Nama;
    }

    public abstract double area ();

    @Override
    public String toString(){
        return shapeName;
    }
}
