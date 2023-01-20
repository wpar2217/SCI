package normal;

public class PrimeNumberChecker {
	public Boolean validate(final Integer PrimeNumber) {
		for(int i = 2; i < (PrimeNumber / 2); i++) {
			if(PrimeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}
