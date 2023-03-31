package Cat;
class Animal {
    private boolean vegetarian;
    private String eats;
    public Animal(){}
    public Animal(boolean veg, String food){
        this.vegetarian = veg;
        this.eats = food;
    }
    public void sound(){
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public void move() {
        System.out.println("Животные могут двигаться");
    }
}
