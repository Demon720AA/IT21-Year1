public class Ship extends Vehicle implements Floatable{
    public Ship(){
        this(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    
    @Override
    public void fl0at(){
        if (this.getFuel() >= 50){
            this.setFuel(this.getFuel() - 50);
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine(){
        if (this.getFuel() >= 10){
            this.setFuel(this.getFuel() - 10);
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        for(int i=0; i < distance; i++){
            if (this.getFuel() >= 50){
                this.fl0at();
            }
        }
    }
}
