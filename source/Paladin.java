public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}
	
	private int fibonacci(int n) {
		if (n <= 1) return n;
		
		int prev = 0, curr = 1;
		for (int i = 2; i <= n; i++) {
			int next = prev + curr;
			prev = curr;
			curr = next;
		}
		return curr;
	}
	private int findFibonacciIndex(int num) {
		if (num <= 1) return num;
		
		int i = 2;
		int fib = fibonacci(i);
	
		while (fib <= num) {
			if (fib == num) return i;
			i++;
			fib = fibonacci(i);
		}
		return -1;
	}
	@Override
	public double getCombatScore() {
		int baseHp = this.getBaseHp();
		int fibIndex = findFibonacciIndex(baseHp);
		
		if (fibIndex > 2) {
			return 1000 + fibIndex;
		}
		return baseHp * 3;
	}
}
