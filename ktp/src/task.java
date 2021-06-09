
public class task {
	public static void main(String[] args) {
	System.out.println(convert(6));
	System.out.println(points(15,6));
	System.out.println(footballPoint(15, 6, 4));
	System.out.println(divisableByFive(15));
	System.out.println(and(false, true));
	System.out.println(howManyWalls(46, 5, 4));
	System.out.println(squaed(5));
	System.out.println(profitableGamble(0.9, 3, 2));
	System.out.println(frames(10, 25));
	System.out.println(mod(25, 3));
	}
	public static int convert(int minute) {
		return minute * 60;
	}
	public static int points(int x2, int x3) {
		return x2 * 2 + x3 *3;
	}
	public static int footballPoint(int win, int draw, int loss) {
		return win * 3 + draw + loss * 0;
	}
	public static boolean divisableByFive(int num) {
		if(num % 5 == 0) {
			return true;
		}
		else {
			return false;
		}
		}
	public static boolean and(boolean a, boolean b) {
		if(a && b) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int howManyWalls(int n, int w, int h) {
		return n / (w * h);
	}
	public static int squaed(int b) {
		return b * b;
	}
	public static boolean profitableGamble(double prob, int prize, int pay) {
		if(prob * prize > pay) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int frames(int FPS, int min) {
		return FPS * 60 * min;
	}
	public static int mod(int num, int del) {
		return num - (num / del * del);
	}
}
