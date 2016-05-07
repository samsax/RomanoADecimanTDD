

public class Convertidor {
	String[] baseRomano = {"I","V","X","L","C","D","M"};
	Integer[] baseDecimal = {1,5,10,50,100,500,1000};
	
	
	public int convertirADecimal(String numeroRomano){
	String derecha= "";
	String izquierda = "";
	String base = "";
	if(numeroRomano.length() > 1){
		int posicion = seleccionarMayor(numeroRomano);
					izquierda = sacarIzquierda(numeroRomano, posicion);
					derecha = sacarDerecha(numeroRomano, posicion);
					base = numeroRomano.substring(posicion,posicion+1);
					return(convertirADecimal(base) - convertirADecimal(izquierda) + convertirADecimal(derecha));
	}else if(numeroRomano.length() == 1){
		return retornarBase(numeroRomano);
	}
	else {
		return 0;
		}
	}
	
	public int seleccionarMayor(String numeroRomano)
	{
		int posicion = -1;
		for (int i = baseRomano.length-1; i != -1; i--){
			posicion = numeroRomano.indexOf(baseRomano[i]);
			if(posicion!=-1){
			return posicion;
			}
		}
		return posicion;
	}

	public int retornarBase(String baseRomanoUnica) {
		for (int i = baseRomano.length-1; i != -1; i--){
			if(baseRomano[i].equals(baseRomanoUnica)){
				return baseDecimal[i];
			}
		}
		return 0;
	}
	
	public String sacarDerecha(String numeroRomano, int posicion){
		String derecha = "";
		if(posicion < numeroRomano.length()-1){
			derecha = numeroRomano.substring(posicion+1);
		}
		return derecha;
	}
	
	public String sacarIzquierda(String numeroRomano, int posicion){
		String izquierda = "";
		if(posicion!= -1){
			izquierda = numeroRomano.substring(0,posicion);
		}
		return izquierda;
	}
	
}
