package org.a;

public class B {

	public static void main(String[] args) {

		int[] demonination = { 20, 10, 5, 2 };
		int amount = 31;

		for (int i = 0; i < demonination.length; i++) {
			int j = demonination[i];

			if (amount >= 20) {
				System.out.println("No of 20rs Notes :" + amount / 20);
				amount = amount % 20;
			} else if ((amount % 10)== 1||(amount%10==3)) {
				if ((amount%5)==1) {
					System.out.println("No of 2rs Notes :" + amount / 2);
					amount = amount % 2;
					
				}else {
					System.out.println("No of 2rs Notes :" + amount / 5);
					amount = amount % 5;
				}
				
			}

		}

	}

}
