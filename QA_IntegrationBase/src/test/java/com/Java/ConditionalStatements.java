package com.Java;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String examstatus = "pass";
		if (examstatus == "pass") {
			System.out.println("Please wait for furthur rounds");
			String round1 = "pass";

			if (round1 == "pass") {
				System.out.println("You are qualified to first round");
				String round2 = "pass";
				if (round2 == "Pass") {
					System.out.println("You are qulified ot secound round ");
				} else {
					System.out.println("You  are not qualified for secound roud sorry to say you can go to Home");
				}

			} else {
				System.out.println("You  are not qualified for first roud sorry to say you can go to Home");
			}

		}

	}

}
