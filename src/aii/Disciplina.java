package aii;

/**
 * The class the contains all the information regarding a 'disciplina'.
 */
public class Disciplina {
	public enum TipDisciplina {Obligatoriu, Optional, Facultativ};
	public enum Examinare {Examen, Colocviu};
	
	public int cod;
	public String denumire;
	public TipDisciplina tip;
	public int nrOre;
	public int pctCredit;
	public Examinare examinare;
	public int anStudiu;
	public int semestru;
	
	@Override
	public String toString() {
		return "Disciplina [an=" + anStudiu + ", cod=" + cod + ", denumire=" + denumire + ", examinare="
				+ examinare + ", nrOre=" + nrOre + ", pctCredit=" + pctCredit + ", semestru="
				+ semestru + ", tip=" + tip + "]";
	}
	
}
