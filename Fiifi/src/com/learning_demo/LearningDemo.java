package com.learning_demo;

public class LearningDemo {

	public static void main(String[] args) {
		String palindrome = "Enock thought I was Sam";
		int len = palindrome.length();
		System.out.println("String Length is : " + len);

	}

	public static class Test {
		public static void main(String[] args) {
			String Str = new String("  Welcome to Tutorialspoint.com  ");

			System.out.println("Return Value :");
			System.out.println(Str.trim());

		}

		public static class Enoch {

			public static int minFunction(int n1, int n2) {

				int min;

				if (n1 > n2)
					min = n2;
				else
					min = n1;

				return min;

			}

			public static class Kofi {
				
				public static void main(String[] args) {
					 int a = 11;
					 int b = 6;
					 int c = minFunction(a, b);
					 
					 System.out.println("Minimum Value = " + c);
				}
				
				
			}
		}
	}

}
