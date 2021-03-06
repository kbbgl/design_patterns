package org.kbbgl.dp.factory_simple;

public abstract class Pizza {

    private String size;

    public Pizza(String size) {
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
        return "size=" + size;
    }
}
