class Laptop{
    String model;
    int price;

    // public String toString(){
    //     return model + " : " + price;
    // }
    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price == that.price;
    // }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
    

}

public class DemoObjectClass {
    public static void main(String[] args) {
        Laptop L = new Laptop();
        Laptop L1 = new Laptop();

        L.model = "lenova yoga";
        L.price = 1000;

        L1.model = "lenova yoga";
        L1.price = 1000;

        System.out.println(L.toString());
        System.out.println(L1.toString());

    
        System.out.println(L.equals(L1));
    }
    
}
