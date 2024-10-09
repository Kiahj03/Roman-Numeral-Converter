public class RomanNumeralConverter {
	private static int getValueOfSingleRomanNumeralChar(char romanNumeral) {
		if (romanNumeral == 'I') {
			return 1;
		} else if (romanNumeral == 'V') {
			return 5;

		}
		return 10;
	}

	public int getConversion(String romanNumeral) {
		int finalResult = 0;
		for (int index = 0; index < romanNumeral.length(); index++) {
			int temporaryResult = getValueOfSingleRomanNumeralChar(romanNumeral.charAt(index));
			boolean shouldSubtract = (index + 1 < romanNumeral.length()) && shouldRomanNumeralSubtract(temporaryResult,
					getValueOfSingleRomanNumeralChar(romanNumeral.charAt(index + 1)));
			finalResult = computeFinalRomanNumeralValue(finalResult, temporaryResult, shouldSubtract);
		}
		return finalResult;
	}

	private boolean shouldRomanNumeralSubtract(int temporaryResult, int nextRomanNumeral) {
		return temporaryResult < nextRomanNumeral;
	}

	private int computeFinalRomanNumeralValue(int finalResult, int temporaryResult, boolean shouldSubtract) {
		if (shouldSubtract) {
			return finalResult - temporaryResult;
		}
		return finalResult + temporaryResult;
	}
}
