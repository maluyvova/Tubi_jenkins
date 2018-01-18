package core;
import java.io.*;
import java.util.*;

import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import org.testng.annotations.*;

import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;

import java.lang.reflect.Method;

public class TubiTVTest {

	
	
	

	
	
	

public static void TestCase01_01 () throws InterruptedException, IOException  {
assertThat( Testcase01_01.TestCase01_0(), equalTo("https://tubitv.com/"));	}	
	




	@Test
	public static void TestCase01_02 () throws InterruptedException, IOException  {
	assertThat(Testcase01_02.TestCase01_02(), equalTo("https://tubitv.com/home"));	}
	
	
	@Test
	public static void TestCase01_02_1 () throws InterruptedException, IOException  {
	assertThat(Testcase1_02_1.TestCase1_02_1(), equalTo("https://tubitv.com/home?notify=EVS"));	}
	
	@Test
	public static void TestCase01_03 () throws InterruptedException, IOException  {
	assertThat(Testcase01_03.TestCase01_03(), equalTo("First Name\n60/60"));	}
	
	@Test
	public static void TestCase01_04 () throws InterruptedException, IOException  {
	assertThat(Testcase01_04.TestCase01_04(), equalTo("Last Name\n60/60"));	}
	
	@Test
	public static void TestCase01_05 () throws InterruptedException, IOException  {
	assertThat(Testcase01_05.TestCase01_05(), equalTo("Invalid email address"));	}
	@Test
	public static void TestCase01_06 () throws InterruptedException, IOException  {
	assertThat(Testcase01_06.TestCase01_06(), equalTo("Invalid email address"));	}
	
	@Test
	public static void TestCase01_07 () throws InterruptedException, IOException  {
	assertThat(Testcase01_07.TestCase01_07(), equalTo("Invalid email address"));	}
	
	@Test
	public static void TestCase01_08 () throws InterruptedException, IOException  {
	assertThat(Testcase01_08.TestCase01_08(), equalTo("Email has already been used. Please Login or Reset your password"));	}
	
	@Test
	public static void TestCase01_09 () throws InterruptedException, IOException  {
	assertThat(Testcase01_09.TestCase01_09(), equalTo("Length must be between 6 and 30"));	}
    @Test 
    public static void TestCase01_10() throws  InterruptedException, IOException {
    	assertThat (Testcase01_10.TestCase01_10(), equalTo("Length must be between 6 and 30"));
    }
    @Test 
    public static void TestCase01_11() throws  InterruptedException, IOException {
    	assertThat (Testcase01_11.TestCase01_11(), equalTo("Passwords do not match"));	
	}
    @Test 
    public static void TestCase01_12() throws  InterruptedException, IOException {
    	assertThat (Testcase01_12.TestCase01_12(), equalTo("Invalid Month"));	
	}@Test 
    public static void TestCase01_13() throws  InterruptedException, IOException {
    	assertThat (Testcase01_13.TestCase01_13(), equalTo("Invalid Day"));	
	}@Test 
    public static void TestCase01_14() throws  InterruptedException, IOException {
    	assertThat (Testcase01_14.TestCase01_14(), equalTo("Invalid Year"));	
	}@Test 
    public static void TestCase01_15() throws  InterruptedException, IOException {
    	assertThat (Testcase01_15.TestCase01_15(), equalTo("Invalid Year"));	
	}@Test 
    public static void TestCase01_16() throws  InterruptedException, IOException {
    	assertThat (Testcase01_16.TestCase01_16(), equalTo("https://tubitv.com/home"));	
	}
	@Test 
    public static void TestCase01_17() throws  InterruptedException, IOException {
    	assertThat (Testcase01_17.TestCase01_17(), equalTo("http://tubitv.com/home#_=_"));	
	}
@Test
public static void TestCase01_18() throws InterruptedException, IOException{
	assertThat (Testcase01_18.TestCase01_18(), equalTo ("https://tubitv.com/home"));}
	@Test
	public static void TestCase01_19() throws InterruptedException, IOException{
		assertThat (Testcase01_19.TestCase01_19(), equalTo ("https://tubitv.com/home"));
	
}

	@Test
	public static void TestCase01_20() throws InterruptedException, IOException{
		assertThat (Testcase01_20.TestCase01_20(), equalTo ("You must be 13 years or older"));
	
}
@Test
	public static void TestCase01_21() throws InterruptedException, IOException{
		assertThat (Testcase01_21.TestCase01_21(), equalTo ("Success\nPassword was successfully set\nClose"));
}
	@Test
	public static void TestCase01_22() throws InterruptedException, IOException{
		assertThat (Testcase01_22.TestCase01_22(), equalTo ("https://tubitv.com/home"));
}
	
	
	
	
	
	
	
	
	
	@Test
	public static void TestCase02_01() throws InterruptedException, IOException{
		assertThat (Testcase02_01.TestCase02_01(), equalTo ("https://tubitv.com/home"));
	
}
	@Test
	public static void TestCase02_02() throws InterruptedException, IOException{
		assertThat (Testcase02_02.TestCase02_02(), equalTo ("Email address you provided does not exist"));
	
}
	@Test
	public static void TestCase02_03() throws InterruptedException, IOException{
		assertThat (Testcase02_03.TestCase02_03(), equalTo ("Invalid password/email combination"));
	
}

	@Test
	public static void TestCase02_04() throws InterruptedException, IOException{
		assertThat (Testcase02_04.TestCase02_04(), equalTo ("Invalid password/email combination"));
	
}
	@Test
	public static void TestCase02_05() throws InterruptedException, IOException{
		assertThat (Testcase02_05.TestCase02_05(), equalTo ("https://tubitv.com/home"));
	
}
	@Test
	public static void TestCase02_06() throws InterruptedException, IOException{
		assertThat (Testcase02_06.TestCase02_06(), equalTo ("https://tubitv.com/home"));
	
}
	
	@Test
	public static void TestCase02_07() throws InterruptedException, IOException{
		assertThat (Testcase02_07.TestCase02_07(), equalTo ("Success\nPassword was successfully set\nClose"));
	
}
	@Test
	public static void TestCase02_08() throws InterruptedException, IOException{
		assertThat (Testcase02_08.TestCase02_08(), equalTo ("https://tubitv.com/home"));
	
}
	
	
	
	
	
	
	
	
	
	@Test
	public static void TestCase03_01() throws InterruptedException, IOException{
		assertThat (Testcase03_01.TestCase03_01(), equalTo ("https://tubitv.com/activate"));
	
}
	@Test
	public static void TestCase03_02() throws InterruptedException, IOException{
		assertThat (Testcase03_02.TestCase03_02(), equalTo ("http://tubitv.com/activate#_=_"));
	
}
	@Test
	public static void TestCase03_03() throws InterruptedException, IOException{
		assertThat (Testcase03_03.TestCase03_03(), equalTo ("https://tubitv.com/activate"));
	
}

	@Test
	public static void TestCase03_04() throws InterruptedException, IOException{
		assertThat (Testcase03_04.TestCase03_04(), equalTo ("https://tubitv.com/activate"));
	
}
	@Test
	public static void TestCase03_05() throws InterruptedException, IOException{
		assertThat (Testcase03_05.TestCase03_05(), equalTo ("https://tubitv.com/home"));
	
}
	@Test
	public static void TestCase03_05_1() throws InterruptedException, IOException{
		assertThat (Testcase03_05_1.TestCase03_05_1(), equalTo ("Hi,\nVlad"));
	
}
	@Test
	public static void TestCase03_06() throws InterruptedException, IOException{
		assertThat (Testcase03_06.TestCase03_06(), equalTo ("https://tubitv.com/signup?redirect=/login"));
	
}
	@Test
	public static void TestCase03_07() throws InterruptedException, IOException{
		assertThat (Testcase03_07.TestCase03_07(), equalTo ("https://tubitv.com/login")); }
	
	
	
	
	
	
	
	
	
	@Test
	public static void TestCase05_01() throws InterruptedException, IOException{
		assertThat (Testcase05_01.TestCase05_01(), equalTo ("Test 7"));
}
	@Test
	public static void TestCase05_02() throws InterruptedException, IOException{
		assertThat (Testcase05_02.TestCase05_02(), equalTo ("This title is intended for mature audiences, please sign in to watch."));
}
	
	@Test
	public static void TestCase05_02_1() throws InterruptedException, IOException{
		assertThat (Testcase05_02_1.TestCase05_02_1(), equalTo ("Test 3"));
}
	@Test
	public static void TestCase05_02_2() throws InterruptedException, IOException{
		assertThat (Testcase05_02_2.TestCase05_02_2(), equalTo ("Test 3"));
}
	
	@Test
	public static void TestCase05_03() throws InterruptedException, IOException{
		assertThat (Testcase05_03.TestCase05_03(), equalTo ("Test 7"));
}

	@Test
	public static void TestCase05_04() throws InterruptedException, IOException{
		assertThat (Testcase05_04.TestCase05_04(), equalTo ("No matches, but here are some recommendations"));
}
	

	@Test
	public static void TestCase05_05() throws InterruptedException, IOException{
		assertThat (Testcase05_05.TestCase05_05(), equalTo ("Movies. TV. Free."));
}
	
	
	
	@Test
	public static void TestCase05_06() throws InterruptedException, IOException{
		assertThat (Testcase05_06.TestCase05_06(), equalTo ("Test 7"));
}
	@Test
	public static void TestCase05_07() throws InterruptedException, IOException{
		assertThat (Testcase05_07.TestCase05_07(), equalTo ("Test 3"));
}
	
	@Test
	public static void TestCase05_08() throws InterruptedException, IOException{
		assertThat (Testcase05_08.TestCase05_08(), equalTo ("Test 7"));
}

	@Test
	public static void TestCase05_09() throws InterruptedException, IOException{
		assertThat (Testcase05_09.TestCase05_09(), equalTo ("No matches, but here are some recommendations"));
}
	

	@Test
	public static void TestCase05_10() throws InterruptedException, IOException{
		assertThat (Testcase05_10.TestCase05_10(), equalTo ("Watch Now\nFREE" ));
}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public static void TestCase06_0() throws InterruptedException, IOException{
		assertThat (Testcase06_0.TestCase06_0(), equalTo ("Hi,\nok"));
}
	@Test
	public static void TestCase06_01() throws InterruptedException, IOException{
		assertThat (Testcase06_01.TestCase06_01(), equalTo ("User must be aged 13 or above"));
}
	@Test
	public static void TestCase06_02() throws InterruptedException, IOException{
		assertThat (Testcase06_02.TestCase06_02(), equalTo ("01031999"));
}
	@Test
	public static void TestCase06_03() throws InterruptedException, IOException{
		assertThat (Testcase06_03.TestCase06_03(), equalTo ("Change Password\nYou have updated your password successfully."));
}	
	@Test
	public static void TestCase06_04() throws InterruptedException, IOException{
		assertThat (Testcase06_04.TestCase06_04(), equalTo ("Old password is invalid"));
}	
	
	@Test
	public static void TestCase06_05() throws InterruptedException, IOException{
		assertThat (Testcase06_05.TestCase06_05(), equalTo ("Register"));
}	
	@Test
	public static void TestCase06_06() throws InterruptedException, IOException{
		assertThat (Testcase06_06.TestCase06_06(), equalTo ("Register"));
}	
	@Test
	public static void TestCase06_07() throws InterruptedException, IOException{
		assertThat (Testcase06_07.TestCase06_07(), equalTo ("Register"));
}	
	
	
	@Test
	public static void TestCase06_10() throws InterruptedException, IOException{
		assertThat (Testcase06_10.TestCase06_10(), equalTo (true));}
	
	
	
	@Test
	public static void TestCase06_11() throws InterruptedException, IOException{
		assertThat (Testcase06_11.TestCase06_11(), equalTo (false));}
	
}




	





