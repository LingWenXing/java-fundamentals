package com.dxc.ContructorInjection;

public class MainApp {

	public static void main(String[] args) {
		Parent c = new Child();
		c.pocketMoney();
		((Child)c).pocketMoney();

	}

}
