package CreationalDP.Abstract_FactoryDP;

public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

   @Override
    Shape getShape(String shapeType){

        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("DAIRE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("DIKDORTGEN")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("KARE")) {
            return new Square();
        }
        return null;

    }

}
