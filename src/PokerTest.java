
public class PokerTest {

	public static void main(String[] args) {
		int[] poker = new int[52]; // �]�w52�i�P
		for (int i = 0; i < poker.length; i++) {
			int card = (int) (Math.random() * 52);// �üƨ�52�i�P

			boolean repeat = false; // ���ƵP�����~
			for (int j = 0; j < i; j++) {// �ˬd���Ƶo�P
				if (poker[i] == card) { // �P�է��ۦP���X�A���T�o�U�@�i�P
					repeat = true;
					break;
				}
			}
			if (repeat) {
				i--; // ���ƵP���X�A�b�[�^�h�즸�ƭ��s�p��
			} else {
				poker[i] = card;
				System.out.println(poker[i]);
			}
		}
	}

}
