package com.willianmedeiros.hello_java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AppTest  {
	
	@Test
	public void testa_se_esta_somando_corretamente() {
		App app = new App();
		int soma = app.soma(10, 5);
		assertThat( soma ).isEqualTo(15);
	}
	
	@Test
	public void testa_se_esta_subtraindo_corretamente() {
		App app = new App();
		int soma = app.subtrai(10, 5);
		assertThat( soma ).isEqualTo(5);
	}
	
	@Test
	public void testa_se_esta_retornando_vai_planeta() {
		App app = new App();
		assertThat( app.print() ).isEqualTo("Vai planeta");
	}
	
}