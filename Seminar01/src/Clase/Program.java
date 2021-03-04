package Pachet01;
import Clase.Girafa;
import Clase.Zoo;
import Clase.Zebra;

public class Program {

	public static void main(String [] args) {
		Zoo zoo = new Zoo();
		
		Girafa girafa01 = new Girafa("girafa01");
		Girafa girafa02 = new Girafa("girafa02");
		
		Zebra zebra01 = new Zebra("zebra01");
		Zebra zebra02 = new Zebra("zebra02");
		
		zoo.addAnimal(girafa01);
		zoo.addAnimal(girafa02);
		zoo.addAnimal(zebra01);
		zoo.addAnimal(zebra02); 
		zoo.feedAllAnimals();
	}
}
