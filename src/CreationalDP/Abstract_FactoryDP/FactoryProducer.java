package CreationalDP.Abstract_FactoryDP;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SEKIL")){
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("RENK")) {
            return new ColorFactory();
        }
        return null;

    }
}
