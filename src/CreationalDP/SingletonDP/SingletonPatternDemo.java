package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //SingletonObject object = new SingletonObject();
        SingletonObject obj1 =  SingletonObject.getInstance();
        System.out.println(obj1.message); // Merhaba
        obj1.changeMessage(); // obj1 ---> message = Merhaba BAtch 130-131-139

        // 2,obj yi uretuyorum
        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println(obj2.message); // Merhaba


    }
}
