package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		//  환율을 세팅 합니다.
		CurrencyConverter.setRate(1121.0);
		
		double toDollar = CurrencyConverter.toDollar(1000000);
		double toKRW = CurrencyConverter.toKRW(100);
		
		System.out.println("백만원은 "+toDollar+"달러입니다.");
		System.out.println("백달러는 "+toKRW+"원입니다.");
	}

}
