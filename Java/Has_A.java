class Processor {
    private String brand;
    private String model;

    public Processor(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

class Mobile {
    private String brand;
    private String model;
    private Processor processor;

    public Mobile(String brand, String model, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    @Override
    public String toString() {
        return "Brand "+brand+" Model "+brand+" Processor "+processor;
    }
}

public class Has_A {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i7");
        Mobile mobile = new Mobile("Phone", "xyz model", processor);
        Processor mobileProcessor = mobile.getProcessor();
        System.out.println(mobile);
    }
}
