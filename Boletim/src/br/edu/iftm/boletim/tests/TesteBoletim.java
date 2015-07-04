package br.edu.iftm.boletim.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class TesteBoletim {

	@Test
	public void testSetNomeDoAluno() {
	
			Boletim b = new Boletim();
			b.setNomeDoAluno(null);
			String esperado ="";
			String atual = b.getNomeDoAluno();
			assertEquals("", atual);
		
	}
	@Test
	public void testSetNomeDisciplina() {
		
		Boletim b = new Boletim();
		b.setNomeDaDisciplina(null);
		String esperado ="";
		String atual = b.getNomeDaDisciplina();
		assertEquals("", atual);
	
}
	
}
