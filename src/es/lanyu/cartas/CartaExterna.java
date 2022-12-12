package es.lanyu.cartas;

import com.github.cards.Card;

public class CartaExterna extends Card implements Carta {

	public CartaExterna(int suit, int rank) {
		super(suit, rank);		
	}

	@Override
	public int getPalo() {		
		return getSuit();
	}

	@Override
	public int getNumero() {		
		return getRank();
	}

}
