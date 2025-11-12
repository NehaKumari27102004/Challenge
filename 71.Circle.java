package Challenge;

class Circle {

    double radiusMin;

    Circle(double radiusMin){
        this.radiusMin=radiusMin;
    }

    double getCircumference(){
        return 2*radiusMin*Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusMin, 2);
    }
    double getCircumference();
    public static void main(String[] args) {

    }
}
