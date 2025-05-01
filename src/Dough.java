public class Dough {
    String products;

    public Dough(String products) {
        this.products = products;
    }
    public void show() {
        System.out.println("I can make " + products + " out of dough");

    }
    public void setProduct(String newProduct) {
        this.products = newProduct;
    }

}





