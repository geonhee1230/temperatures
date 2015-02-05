// @ GeonHee Ko
// csc201
// Temperatures

package temperatures;

import java.util.Scanner;

public class Temperatures {

	static int[][] temperature = new int[12][2];

	public static void main(String[] args) {

		inputTempForYear();
		System.out.println("The average high temperature of the year is "
				+ calculateAverageHigh(temperature) + " degrees.");
		System.out.println("The average low temperature of the year is "
				+ calculateAverageLow(temperature) + " degrees.");
		System.out.println("The highest temperature of the year was on "
				+ monthName(findHighestTemp(temperature)) + ".");
		System.out.println("The lowest temperature of the year was on "
				+ monthName(findLowestTemp(temperature)) + ".");

	}

	public static void inputTempForMonth(int month, int[][] k) {

		System.out.println("Input the high temperature for "
				+ monthName(month + 1) + ".");
		Scanner keyboard = new Scanner(System.in);
		int temper = keyboard.nextInt();
		k[month][0] = temper;

		System.out.println("Input the low temperature for "
				+ monthName(month + 1) + ".");
		int tempera = keyboard.nextInt();
		k[month][1] = tempera;

	}

	public static int[][] inputTempForYear() {

		System.out
				.println("Input the highs and lows from Jan to Dec in order.");
		for (int i = 0; i < temperature.length; i++)

			inputTempForMonth(i, temperature);

		return temperature;

	}

	public static int calculateAverageHigh(int[][] k) {
		int sum = 0;
		int average = 0;
		for (int i = 0; i < k.length; i++)
			sum += k[i][0];
		average = sum / k.length;
		return average;
	}

	public static int calculateAverageLow(int[][] k) {
		int sum = 0;
		int average = 0;
		for (int i = 0; i < k.length; i++)
			sum += k[i][1];
		average = sum / k.length;
		return average;
	}

	public static int findHighestTemp(int[][] k) {
		int temp = k[0][0];
		int highest = 0;
		for (int i = 1; i < k.length; i++) {
			if (k[i][0] > temp) {
				temp = k[i][0];
				highest = i + 1;
			}
		}
		return highest;
	}

	public static int findLowestTemp(int[][] k) {
		int temp = k[0][1];
		int lowest = 0;
		for (int i = 1; i < k.length; i++) {
			if (k[i][1] < temp) {
				temp = k[i][1];
				lowest = i + 1;
			}
		}
		return lowest;
	}

	public static String monthName(int k) {
		String monthString;

		switch (k) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		return monthString;

	}
}
