package com.company;

public class Domkrat {
    private int maxWeight;
    private String name;
    private String colour;
    private int mass;
    protected String material;
    protected String type;

    public Domkrat(int maxWeight, String name, String colour, int mass,String material, String type){
        this.maxWeight = maxWeight;
        this.name = name;
        this.colour = colour;
        this.mass = mass;
        this.material = material;
        this.type = type;
    }
    public Domkrat(int maxWeight, String name, String colour, int mass){
        this(maxWeight, name, colour, mass, null, null);
    }
    public Domkrat(){
        this(0, null, null, 0);
    }

    @Override
    public String toString(){
        return "Domkrat {\n"
                + "maxWeight " + maxWeight + "\n"
                + "name " + name + "\n"
                + "colour " + colour + "\n"
                + "mass " + mass + "\n"
                + "material " + material + "\n"
                + "type " + type + "\n"
                + "}\n";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
