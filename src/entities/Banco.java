package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nomeBanco;
	private List<Contaa> list = new ArrayList<>();
	
	public Banco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	public List<Contaa> getList() {
		return list;
	}
	
	public Integer acharNum(List <Contaa> account , int num) {
		for(int i = 0; i<account.size();i++) {
			if(account.get(i).getNumConta() == num) {
				return i;
			}
		}
		return null;
	}
	
	public void mostrandoContas() {
		for(Contaa c : list) {
			System.out.println(c);
		}
	}
}
