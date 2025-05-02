public class setName {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        setName obj = new setName();  // Creating an instance of the class
        obj.setName("Tommy");  // Setting the name
        System.out.println(obj.getName());  // Output: Tommy
    }
}
