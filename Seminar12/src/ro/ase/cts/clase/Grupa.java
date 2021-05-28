package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

//O grupa contine maxim 35 de studenti
// Numarul grupei pentru facultatea noastra este cuprins intre 1000 - 1100

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public Grupa(int nrGrupa){
    	if(nrGrupa<=1100 && nrGrupa>=1000) {
            this.nrGrupa=nrGrupa;
    	} else {
    		throw new IllegalArgumentException();
    	}
        studenti=new ArrayList<>();
    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
        if(studenti.size() ==0) {
        	throw new IndexOutOfBoundsException();
        }
        int nrRestantieri=0;

        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }
        }
        return 1-((float)nrRestantieri/studenti.size());
    }

	public int getNrGrupa() {
		return nrGrupa;
	}

	public void setNrGrupa(int nrGrupa) {
		this.nrGrupa = nrGrupa;
	}

	public List<IStudent> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<IStudent> studenti) {
		this.studenti = studenti;
	}
}