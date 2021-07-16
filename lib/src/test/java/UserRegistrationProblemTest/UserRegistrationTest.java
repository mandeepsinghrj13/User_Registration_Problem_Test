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
}