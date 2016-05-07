import static org.junit.Assert.*;



public class Test {
	Convertidor convertidor = new Convertidor();
	@org.junit.Test
	public void testI() {
		int numeroDecimal = convertidor.convertirADecimal("I");
		assertEquals(1,numeroDecimal);
	}
	@org.junit.Test
	public void testII() {
		int numeroDecimal = convertidor.convertirADecimal("II");
		assertEquals(2,numeroDecimal);
	}
	
	@org.junit.Test
	public void testIV() {
		int numeroDecimal = convertidor.convertirADecimal("IV");
		assertEquals(4,numeroDecimal);
	}
	
	@org.junit.Test
	public void testVIII() {
		int numeroDecimal = convertidor.convertirADecimal("VIII");
		assertEquals(8,numeroDecimal);
	}
	
	@org.junit.Test
	public void testIX() {
		int numeroDecimal = convertidor.convertirADecimal("IX");
		assertEquals(9,numeroDecimal);
	}
	
	@org.junit.Test
	public void mayorIV() {
		int posicion = convertidor.seleccionarMayor("IV");
		assertEquals(1,posicion);
	}
	
	@org.junit.Test
	public void mayorIX() {
		int posicion = convertidor.seleccionarMayor("IX");
		assertEquals(1,posicion);
	}
	
	@org.junit.Test
	public void baseI(){
		int baseDecimal = convertidor.retornarBase("I");
		assertEquals(1, baseDecimal);
	}
	
	@org.junit.Test
	public void baseV(){
		int baseDecimal = convertidor.retornarBase("V");
		assertEquals(5, baseDecimal);
	}
	@org.junit.Test
	public void baseX(){
		int baseDecimal = convertidor.retornarBase("X");
		assertEquals(10, baseDecimal);
	}
	
	@org.junit.Test
	public void derechaVIII(){
		int posicion = convertidor.seleccionarMayor("VIII");
		String derecha = convertidor.sacarDerecha("VIII", posicion);
		assertEquals("III", derecha);
	}
	@org.junit.Test
	public void izquierdaIV(){
		int posicion = convertidor.seleccionarMayor("IV");
		String izquierda = convertidor.sacarIzquierda("IV", posicion);
		assertEquals("I", izquierda);
	}
	
	@org.junit.Test
	public void izquierdaIX(){
		int posicion = convertidor.seleccionarMayor("IX");
		String izquierda = convertidor.sacarIzquierda("IX", posicion);
		assertEquals("I", izquierda);
	}
	
	@org.junit.Test
	public void testDVIII(){
		int numeroDecimal = convertidor.convertirADecimal("DVIII");
		assertEquals(508,numeroDecimal);
	}
	 
	@org.junit.Test
	public void testDCXXXVIII(){
		int numeroDecimal = convertidor.convertirADecimal("DCXXXVIII");
		assertEquals(638,numeroDecimal);
	}
}
