public class Main {
    public static void main(String[] args) {
        Dog bobby = new Dog("Bobby");
        bobby.name = "Bobby";

        bobby.bark();
    }


    private String name;

    public static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = "Danny";
        }

        public void bark() {
            System.out.println(name + " barked!");
        }
    }
}

