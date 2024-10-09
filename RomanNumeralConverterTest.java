import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
	RomanNumeralConverter romanNumeralConverter;

	@BeforeEach
	public void setUp() {
		romanNumeralConverter = new RomanNumeralConverter();
	}

	@Test
	public void string_i_returns_one() {
		int actual = romanNumeralConverter.getConversion("I");
		assertEquals(1, actual);
	}

	@Test
	public void string_ii_returns_two() {
		int actual = romanNumeralConverter.getConversion("II");
		assertEquals(2, actual);
	}

	@Test
	public void string_iii_returns_three() {
		int actual = romanNumeralConverter.getConversion("III");
		assertEquals(3, actual);
	}

	@Test
	public void string_v_returns_five() {
		int actual = romanNumeralConverter.getConversion("V");
		assertEquals(5, actual);
	}

	@Test
	public void string_iv_returns_four() {
		int actual = romanNumeralConverter.getConversion("IV");
		assertEquals(4, actual);
	}

	@Test
	public void string_vi_returns_six() {
		int actual = romanNumeralConverter.getConversion("VI");
		assertEquals(6, actual);
	}

	@Test
	public void string_x_returns_ten() {
		int actual = romanNumeralConverter.getConversion("X");
		assertEquals(10, actual);
	}

	@Test
	public void string_ix_returns_nine() {
		int actual = romanNumeralConverter.getConversion("IX");
		assertEquals(9, actual);
	}

	@Test
	public void string_xi_returns_eleven() {
		int actual = romanNumeralConverter.getConversion("XI");
		assertEquals(11, actual);
	}

	@Test
	public void string_xxviii_returns_twenty_eight() {
		int actual = romanNumeralConverter.getConversion("XXVIII");
		assertEquals(28, actual);
	}

	@Test
	public void string_xxix_returns_twenty_nine() {
		int actual = romanNumeralConverter.getConversion("XXIX");
		assertEquals(29, actual);
	}

	@Test
	public void string_xxxix_returns_thirty_nine() {
		int actual = romanNumeralConverter.getConversion("XXXIX");
		assertEquals(39, actual);
	}
}
