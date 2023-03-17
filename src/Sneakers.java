public class Sneakers {
    private long model;
    private String marca;
    private String color;
    private double size;

    public Sneakers() {
        this.model = model;
        this.color = color;
        this.marca = marca;
        this.size = size;
    }

    public long getModel() {
        return model;
    }

    public void setModel(long model) {
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        System.out.println("zapatos"
                +"\nmodelo:"+getModel()
                +"\ntalla:"+getSize()
                +"\ncolor:"+getColor()
                +"\nmarca:"+getMarca());

        return null;
    }
}
