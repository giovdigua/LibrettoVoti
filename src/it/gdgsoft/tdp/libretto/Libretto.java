package it.gdgsoft.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto() {
		
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiungi un nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti punteggio da riceracre
	 * @return lista di {@link Voto} 
	 */
	public List<Voto> cercaVoti(int punti) {
		List<Voto> result = new ArrayList<Voto>();
		
		for (Voto v : this.voti) {
			if (v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}
	/**
	 * Ricerca un {@link Voto} relativo al corso di cui è specificato il corso
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto}
	 */
	public Voto cercaEsame(String nomeEsame) {
		
		for (Voto v : this.voti) {
			if (v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;
	}
}
