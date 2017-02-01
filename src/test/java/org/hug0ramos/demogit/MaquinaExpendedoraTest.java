package org.hug0ramos.demogit;

import org.junit.*;

public class MaquinaExpendedoraTest {

	@Test
	public void testCorriente() {

		// cuando la maquina se crea debe estar sin corriente por defecto
		MaquinaExpendedora me = new MaquinaExpendedora(50, 25);

		Assert.assertEquals(false, me.getCorriente());
	}

	@Test
	public void testEncenderMaquina() {

		MaquinaExpendedora me = new MaquinaExpendedora(50, 25);
		me.encender();
		Assert.assertEquals(true, me.getCorriente());
	}
}
