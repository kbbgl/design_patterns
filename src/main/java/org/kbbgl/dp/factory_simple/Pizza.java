package org.kbbgl.dp.factory_simple;

public abstract class Pizza {

    private String description;
    private String size;

    public Pizza(String description, String size) {
        this.description = description;
        this.size = size;
    }

    void prepare(){
        System.out.println("Preparing...");
    }

    void bake(){
        System.out.println("Baking...");
    }

    void cut(){
        System.out.println("Cutting...");
    }

    void box(){
        System.out.println("Boxing...");
    }

    void delivering(){
        System.out.println("Delivering...");
    }

    @Override
    public String toString() {
        return "{" +
                "description='" + description + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
