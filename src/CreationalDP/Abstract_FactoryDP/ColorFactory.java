package CreationalDP.Abstract_FactoryDP;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("KIRMIZI")) {
            return new Red();
        } else if (color.equalsIgnoreCase("YESIL")) {
            return new Green();
        } else if (color.equalsIgnoreCase("MAVI")) {
           return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
