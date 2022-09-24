package utilities;

public class CurrencyConverter {
	public double dolarCotation;
	public double dolarQuantity;
	public double finalValor;
	

public double dolarConverter() {
	finalValor = dolarCotation * dolarQuantity;
	finalValor += finalValor * 0.06;
	return finalValor;
}

}
