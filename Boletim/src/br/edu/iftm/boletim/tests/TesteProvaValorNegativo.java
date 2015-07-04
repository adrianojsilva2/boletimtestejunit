package br.edu.iftm.boletim.tests;


import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.iftm.boletim.Prova;

public class TesteProvaValorNegativo {

	Prova p;
	@Before
	public void setUp() throws Exception {
		
	}

	

	@Test
	public void testGetNota_max() {
		assertEquals(-1, -1);
	}

	@Test
	public void notaMenorQueZero() {
		Prova p = new Prova();
		p.setNota_max(-1.0);
		double esperado = 0.0;
		double atual = p.getNota_max();
		assertEquals(0.0, atual, 0.0);
	}

	@Test
	public void descricaoProva() {
		Prova p = new Prova();
		p.setDescricao(null);
		String esperado ="";
		String atual = p.getDescricao();
		assertEquals("", atual);
	}

	@Test
	public void testSetNota_obtida() {
		Prova p = new Prova();
		p.setNota_max(40);
		p.setNota_obtida(43);
		double esperado = 0.0;
		double atual = p.getNota_obtida();
		assertEquals(esperado, atual, 0.0);
	}

}
