
public class PrimeFinder implements Runnable {
	
	Thread go;
	StringBuffer primes = new StringBuffer();
	int time = 0;
	
	public PrimeFinder() {
		start();
		while (primes != null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
			time++;
		}
	}
	
	public void start() {
		if (go == null) {
			go = new Thread(this);
			go.start();
		}
	}
	
	public void run() {
		int quantity = 15_000;
		int numPrimes = 0;
		int primesInRow = 0;
		// candidate: the number that might be prime
		int candidate = 2;
		while (numPrimes < quantity) {
			if (isPrime(candidate)) {
				if (numPrimes != (quantity - 1)) {
					primes.append("[" + (numPrimes + 1) + ": ").append(candidate).append("], ");
				} else {
					primes.append("[" + (numPrimes + 1) + ": ").append(candidate).append("]");
				}
				numPrimes++;
				primesInRow++;
				
			}
			candidate++;
		}
		primes.append("" + "\n\nThese are the first ").append(quantity).append(" primes\n");
		System.out.println(primes);
		primes = null;
		System.out.println("\nTime elapsed: " + time + " seconds");
	}
	
	public static boolean isPrime(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		new PrimeFinder();
		
	}
	
}
