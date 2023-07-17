package BehavioralDP.MediatorDP;

public class MediatorRunner {

    void mediatorDemo(){
        // danisman objemi olusturuyorum
        MessageDispatcher dispatcher = new MessageDispatcher();

        // actorlerimi olusturuyorum
        Actor actor1 = new MessageActor("Actor 1", dispatcher);
        Actor actor2 = new MessageActor("Actor 2", dispatcher);
        Actor actor3 = new MessageActor("Actor 3", dispatcher);
        Actor actor4 = new MessageActor("Actor 4", dispatcher);

        // dispatcher uzerinden hangi actor hangi alanda uzman onu setliyoruz
        dispatcher.register("Topic1", actor1);
        dispatcher.register("Topic2", actor2);
        dispatcher.register("Topic3", actor3);
        dispatcher.register("Topic4", actor4);

        // actorlerin sordugu sorular
        actor1.sendMessage("Topic2", "Message for Topic-2"); // actor2 karsiliyacak
        actor1.sendMessage("Topic3", "Message for Topic-3"); // actor3 karsiliyacak
        actor1.sendMessage("Topic4", "Message for Topic-4"); // actor 4 karsiliyacak

        actor2.sendMessage("Topic1", "Message for Topic-1"); // actor 1 karsiliyacak
        actor2.sendMessage("Topic5", "Message for Topic-5"); // uyari mesaji
    }

    public static void main(String[] args) {

        MediatorRunner mediator = new MediatorRunner();
        mediator.mediatorDemo();

    }
}
