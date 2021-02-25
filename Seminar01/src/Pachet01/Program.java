package Pachet01;
import Clase.Girafa;
import Clase.Zoo;

public class Program {

	public static void main(String [] args) {
		Zoo zoo = new Zoo();
		
		Girafa girafa01 = new Girafa("girafa01");
		Girafa girafa02 = new Girafa("girafa02");
		
		zoo.addAnimal(girafa01);
		zoo.addAnimal(girafa02);
		
		zoo.feedAllAnimals();
	}
}
