public class  Circle extends Figure {
    private String name;
    private double perimetr;

    public String getName() {
        return name;
    }

    @Override
    public double colclatePerimetr() {
        return 0;
    }

    @Override
    public String draw() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }
}

