public class Dough {
    String products;

public Dough(String products) {
    this.products = products;
}
public void show() {
    System.out.println("I can make " + products + " out of dough");

   }
}

public class Main {
    public static void main(String[] args) {
        Dough d = new Dough("Bread");
        d.show();  // Output: I can make cookies out of dough
    }
}


