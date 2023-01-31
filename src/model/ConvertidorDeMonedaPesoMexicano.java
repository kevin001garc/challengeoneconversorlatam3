package model;

import java.math.BigDecimal;
import enums.Moneda;

public class ConvertidorDeMonedaPesoMexicano extends ConvertidorDeMoneda {
	
	 @Override
	    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
	        moneda = Moneda.PESO_MEXICANO;
	        return super.convertirParaMoneda(moneda, valorEnReais);
	    }

	    @Override
	    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorEnMoneda) {
	        moneda = Moneda.PESO_MEXICANO;
	        return super.convertirParaReal(moneda, valorEnMoneda);
	    }

}
