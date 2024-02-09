public class Pigeon extends Bird {
    private static int numberOfPigeon;
    
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        numberOfPigeon += 1;
    }
    
    public void eat(String food){
        if (food.equals("worm")){
            this.eat(0.5);
        } else if (food.equals("seed")){
            this.eat(0.2);
        } else {
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    
    @Override
    public String toString(){
        return "Pigeon "+this.getWeight()+" kg and "+this.getHeight()+" cm. There are "+numberOfPigeon+" pigeons.";
    }
    @Override
    public void fly(){
        if (this.getWeight() >= 5){
            this.setWeight(this.getWeight() - 0.25);
            System.out.println("Fly Fly");
        } else {
            System.out.println("I’m hungry.");
        }
    }
    @Override
    public void takeOff(){
        if (this.getWeight() >= 5){
            this.setWeight(this.getWeight() - 0.5);
            System.out.println("Take Off");
        } else {
            System.out.println("I’m hungry.");
        }
    }
    @Override
    public void landing(){
        if (this.getWeight() >= 5){
            this.setWeight(this.getWeight() - 0.5);
            System.out.println("Landing");
        } else {
            System.out.println("I’m hungry.");
        }
    }
    
}
