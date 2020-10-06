package com.commandline;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean wrapperBoolean = Boolean.parseBoolean(args[0]);
		Byte wrapperByte = Byte.parseByte(args[1]);
		Short wrapperShort = Short.parseShort(args[2]);
		Integer wrapperInt = Integer.parseInt(args[3]);
		Long wrapperLong = Long.parseLong(args[4]);
		Float wrapperFloat = Float.parseFloat(args[5]);
		Double wrapperDouble = Double.parseDouble(args[6]);
		Character wrapperChar = args[7].charAt(0);

		System.out.println("Boolean values before and after are " + args[0] + ' ' + wrapperBoolean);
		System.out.println("Byte values before and after are " + args[1] + ' ' + wrapperByte);
		System.out.println("Short values before and after are " + args[2] + ' ' + wrapperShort);
		System.out.println("Int values before and after are " + args[3] + ' ' + wrapperInt);
		System.out.println("Long values before and after are " + args[4] + ' ' + wrapperLong);
		System.out.println("Float values before and after are " + args[5] + ' ' + wrapperFloat);
		System.out.println("Double values before and after are " + args[6] + ' ' + wrapperDouble);
		System.out.println("Charecter values before and after are " + args[7] + ' ' + wrapperChar);

	}

}
