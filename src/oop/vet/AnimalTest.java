package oop.vet;

public class AnimalTest {
    public static void main(String[] args) {
        Girafa x = new Girafa();
        Hippo y = new Hippo();

        PetOwner Bob = new PetOwner(x, y);
        Vet Marley = new Vet();

        Bob.takePetsToVet(Marley);
        x.sleep();

        Bob.playWithPets();


    }
}
