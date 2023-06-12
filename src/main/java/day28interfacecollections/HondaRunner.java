package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic =new Civic();
        myCivic.cool();//civic cool perfectly
        myCivic.run(); //AC runs super


        Engine.stop(); //Stops securely

        Accord myAccort =new Accord();
        myAccort.cool(); //Accord cools super
        myAccort.run();  //Engine runs super

        System.out.println("Ac Price" + Ac.price);
        System.out.println("Engine.price" + Engine.price);
        System.out.println("Security.price" +Security.price);
    }
}
