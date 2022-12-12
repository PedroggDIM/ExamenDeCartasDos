package es.lanyu.cartas;

public interface Carta extends Comparable<Carta>{

	int getPalo();

	int getNumero();

	    // hago el compareTo para todos los tipos que implementen Carta.
    default int compareTo(Carta otraCarta) {
    	// ordena por palo y luego por numero ascendente
    			// ordeno primero por palo
    					int resultado =  Integer.compare(getPalo(),  otraCarta.getPalo());	
    					// si el palo es el mismo ordeno por número ascendente.
    	     			if(resultado == 0) {
    					resultado = Integer.compare(getNumero(),  otraCarta.getNumero());
    					}
    					return resultado;
    }

}