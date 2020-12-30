
public class PokerTest {

	public static void main(String[] args) {
		int[] poker = new int[52]; // 設定52張牌
		for (int i = 0; i < poker.length; i++) {
			int card = (int) (Math.random() * 52);// 亂數取52張牌

			boolean repeat = false; // 重複牌為錯誤
			for (int j = 0; j < i; j++) {// 檢查重複發牌
				if (poker[i] == card) { // 牌組找到相同跳出，正確發下一張牌
					repeat = true;
					break;
				}
			}
			if (repeat) {
				i--; // 重複牌跳出，在加回去原次數重新計算
			} else {
				poker[i] = card;
				System.out.println(poker[i]);
			}
		}
	}

}
