package com.day1.operations1;

public class Operations {
	private int var1;

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public float getVar3() {
		return var3;
	}

	public void setVar3(float var3) {
		this.var3 = var3;
	}

	public float getVar4() {
		return var4;
	}

	public void setVar4(float var4) {
		this.var4 = var4;
	}

	private int var2;
	private float var3;
	private float var4;

	public void arthematicOperations() {
		var1 = -5 + 8 * 6;
		var2 = (55 + 9) % 9;
		var3 = 20 + -3 * 5 / 8;
		var4 = 5 + 15 / 3 * 2 - 8 % 3;
	}
}
