package UserRegistrationProblemTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration UserRegistration;

	@Before
	public void setUp() {
		UserRegistration = new UserRegistration();

	}
	@Test
	public void givenName_WhenFirstNameCaptial_Atlist_2_Minmum_Character_True() {

		boolean actual = UserRegistration.isFirstName("Mandeep");
		Assert.assertTrue(actual);
	}
	@Test
	public void givenName_WhenFirstName_FirstCharacter_IsInLowerCase_False() {

		boolean actual = UserRegistration.isFirstName("mandeep");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_Given_SpecialCharacter_False() {

		boolean actual = UserRegistration.isFirstName("Mandeep@");
		Assert.assertFalse(actual);
	}

	
	@Test
	public void givenName_WhenFirstName_HaveNumbers_False() {

		boolean actual = UserRegistration.isFirstName("Mandeep123");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenName_WhenFirstName_HaveSpace_False() {

		boolean actual = UserRegistration.isFirstName("Mand eep123");
		Assert.assertFalse(actual);
	}
	
	@Test//this test case check for last name
	public void givenName_WhenLastNameCaptial_ShouldReturn_True() {

		boolean actual = UserRegistration.isLastName("Mandeep");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenLastName_FirstCharacter_IsInLowerCase_False() {

		boolean actual = UserRegistration.isLastName("mandeep");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastName_SpecialCharacter_IsThere_OrNot_False() {

		boolean actual = UserRegistration.isLastName("Mandeep@");
		Assert.assertFalse(actual);
	}

	
	@Test
	public void givenName_WhenLastName_HaveNumbers_End_False() {

		boolean actual = UserRegistration.isLastName("Mandeep123");
		Assert.assertFalse(actual);
	}
	@Test
	public void givenName_WhenLastName_HaveNumbers_With_Space_False() {

		boolean actual = UserRegistration.isLastName("Mandeep 123");
		Assert.assertFalse(actual);
	}
}