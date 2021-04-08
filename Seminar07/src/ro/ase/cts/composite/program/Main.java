package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.CompositeAgentie;
import ro.ase.cts.composite.clase.LeafFiliala;

public class Main {

	public static void main(String[] args) {
		CompositeAgentie agentie01 = new CompositeAgentie();
		CompositeAgentie agentie02 = new CompositeAgentie();
		CompositeAgentie agentie03 = new CompositeAgentie();
		
		LeafFiliala filiala01 = new LeafFiliala("filiala01");
		LeafFiliala filiala02 = new LeafFiliala("filiala02");
		LeafFiliala filiala03 = new LeafFiliala("filiala03");
		LeafFiliala filiala04 = new LeafFiliala("filiala04");
		
		agentie01.addNod(filiala01);
		agentie01.addNod(filiala02);
		agentie01.addNod(agentie03);
		
		agentie02.addNod(filiala03);
		
		agentie03.addNod(filiala04);
		
		agentie01.afiseazaDescriere();
		System.out.println();
		agentie02.afiseazaDescriere();
		
		agentie03.removeNod(filiala04);
		agentie01.addNod(filiala04);
		
		agentie01.removeNod(agentie03);
		System.out.println();
		agentie01.afiseazaDescriere();
		System.out.println();
		agentie02.afiseazaDescriere();
	}

}
