package prob03;

public class CurrencyConverter {
	private static double rate;

	// 환율 설정(KRW/$1)
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate; // 클래스 변수에 접근은 클래스명.클래스변수명
	}
	
	// 한국 원화를 달러로 변환
	public static double toDollar( double krw ) {
		return krw/rate;
	}
	
	// 달러를 한국 원화로 변환
	public static double toKRW( double dollar ) {
		return dollar*rate;
	}
	
}
