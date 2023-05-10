package org.example.behavorial.state;

public class Main {
    public static void main(String[] args) {
        //Singleton-observer-State
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        if (context.getState().toString() == "StartState"){
            System.out.println("Çalan Müzik : Sözünden dönenler oldu");
        }
        EndState endState = new EndState();
        endState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
