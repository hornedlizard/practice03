package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		Goods goodsOri = null; 
		System.out.println("상품을 담으세요.(3개)");
		System.out.println("예) 상품명 가격 수량");
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			String temp = scanner.nextLine();
			String[] tokens = temp.split(" ");
			goodsOri = new Goods();
			goodsOri.setItem(tokens[0]);
			goods[i] = goodsOri;
			goodsOri.setWon(Integer.parseInt(tokens[1]));
			goods[i] = goodsOri;
			goodsOri.setNumber(Integer.parseInt(tokens[2]));
			goods[i] = goodsOri;
		}
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(
					goods[i].getItem()+"(가격: "+goods[i].getWon()+"원)이"
							+goods[i].getNumber()+"개 입고되었습니다.");
		}
		scanner.close();
	}
}
