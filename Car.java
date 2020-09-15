public class Car {

    int x;
    int y;
    int angle;
    int v;

    public Car(){
        x = 100;
        y = 100;
        angle = 0;
        v=0;
    }

    public void update() {
        x += v*Math.cos(angle);
        y += v*Math.sin(angle);
    }

    public void GasGasGas(){
        v += 1;
    }

}
