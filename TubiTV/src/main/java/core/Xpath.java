package core;

public interface Xpath  {
                                //REGISTER
	String register ="//button[contains(@class,'NewBrandButton NewBrandButton--secondary NewBrandButton--block')]";   //register in the right corner
	String first_name="//input [@autocomplete='given-name']"; //first_name field
	String last_name="//input [@autocomplete='family-name']";  //last_name field
	String email ="//input [@autocomplete='email']";   //email field
	String password ="/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]/input";  //password field
	String repassword ="/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[5]/input";  //confirm_password field
	String month="/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input";  //month field
	String day="/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input";    //day field
	String year="//input[@maxlength='4']";   //year field
	String orange_register="//button[contains(@class,'NewBrandButton--large _3z')]";  //orange register button
	String facebook="//button[contains(@class,'NewBrandButton NewBrandButton--large NewBrandButton--block _1IIxN')]"; //register via facebook
	String register_down= "//a[contains(@href,'/signup')]"; //register below orange "Sign in"
	String register_up="//a[contains(@href,'/signup?redirect=/login')]"; //register on right corner in sign page 
	String emessage="//p[@class='_1mkulvZZqh']"; //error message about year restriction
	
	                                     //SIGN IN
	String sign_in="//a[contains(@class,'bFNdfWAZ4w')]"; // sign in 
	String semail="//input[contains(@autocomplete,'email')]"; //email field in sign in page 
    String spassword="//input[contains(@type,'password')]"; //password field in sign page 
    String orange_signIn="//button[contains(@type,'submit')]"; // orange Sign In button
    String error_message2_02 ="/html/body/div/div/div[2]/div/div[1]/div/div/div/form/p"; // Error message for test case 2.02,2.03,2.04
    String signin_down = "//a[contains(@class,'bFNdfWAZ4w')]"; //sign in in right corner,  in Register page
    String signin_up="/html/body/div/div/div[2]/header/div/div[2]/div/ul/li/a"; //sign in in 
    String sfacebook="//button[@class='NewBrandButton NewBrandButton--large NewBrandButton--block _1IIxN98aWu']"; //sign via Facebook

                                               //ACTIVATE
    String afacebook="//button[@class='NewBrandButton NewBrandButton--large NewBrandButton--block _1IIxN98aWu']"; // Register via Facebook in activate page 
    String aregister="//button[contains(@class,'NewBrandButton NewBrandButton--large NewBrandButton--block NewBrandButton--inverse _3jDvDZPml5')]"; //Register via email in activate page
    String asign_in="//a[@href='/login']"; //Sign In in activate page 
    String tubitv = "//a[@class='_3y1nFa6DUX']"; // tubiTV black icon on the right corner
    String greting = "/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]"; // greeting button on the right corner 
    String register_="//a[contains(@class,'bFNdfWAZ4w')]"; //register button from the sign_in page 
    String signin_="//a[@href='/login']"; //signIn button from the register page
    
    
    
    
                                              //Forgot
    String forgot_password="//a[@href='/forgot']";     //  Forgot password in register page 
    String email_field="//input[@class='Input__input']";  //email field in forgot password page
    String submit="//button[@class='NewBrandButton NewBrandButton--large']";   // submit button in forgot password
          
    
                                            //Search
    String search_field="//section[@class='yOpR1UpemN _3xdFJDff8t']"; //search field 
    String tets7="//div[@class='_3ytAJuD6ba']";  //test 7 title
    String test3="//div[@class='_3ytAJuD6ba']";   //test 3 title
    String message="//div[@class='_1OxbQr9uDv']"; //message that you need  register to watch this movie
    String ssignin="//button[@class='NewBrandButton']";  //sign button for whatch this movie
    String test3t="//h1[@class='_2I1Kknp0lk']"; //test3 title after sign in
    
    
                                        //Settings
    String setings="/html/body/div/div/div[2]/header/div/div[2]/div/div/div[2]/a[1]"; //setings in the left upper corner
    String first_nama="//input[@name='firstName']";    //first name field in setings page
    String save="//button[@class='NewBrandButton NewBrandButton--large']";  //save button
    String smount= "//input[@name='birthMonth']";  //month button in setting page
    String sday="//input[@name='birthDay']";
    String syear="//input[@name='birthYear']";
    String sspassword="//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[1]/input";
    String npassword="//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[2]/input";
    String rnpassword="//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[3]/input";
    String changepassword ="//button[@type='submit']" ;
    	String success="//div[@class='_14o6wr4pKM']";
    	String errormesage="//div[@class='_1EDmgAGcC9']";
    	String errmesage="//div[@class='_10sW9rGLei']"; //error message if you younger then 13 years old for TC 06.01
    	//delete account
    	String removemyacount="//h2[@class='Ut9tQq5_t-']";  //remove my account button
    	String delete ="//button[@class='NewBrandButton NewBrandButton--large NewBrandButton--inverse']";  //delete permanently button
    String many="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div[2]/div[1]/label"; // checkbox with "There's too many ads"
    String dlike="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div[2]/div[2]/label";  //checkbox with "I don't lie the content
    String ive="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div[2]/div[3]/label"; //checkbox with "I've experienced Technical Issues
    String other="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div[2]/div[4]/label"; //checkbox with "Other"
    String submiti="//button[@class='NewBrandButton']"; //submit button when checkboxes are selected
    String pfield="//div[@class='_399LkPVZQA _3zq6e_tAmh _1aZ3xRJKzH']"; //password field in last step
    String laststep="//button[@class='NewBrandButton']"; //button in the last step
    String textarea="//textarea[@class='_2A86-Dym-h']"; //text field  after you select "Other"
    //Parental controls
    String parental="//div[@data-index='1']"; //parental controls TC 06.08
    String level ="//span[@class='Input__input']"; //level of parental controls 
    String ps="//input[@name='password']"; // password field
    //notifications
    String notifications ="//div[@data-index='2']"; //notifications menu TC 06.10
    String tubit="//a[@href='/home']";  // tubitv logo in the left corner
    String checkbox="//input[@value='Weekly newsletter']"; //check box for TC 06.10
    String ssave="//button[@class='NewBrandButton NewBrandButton--large']";  //save button for notifications
                                           //Facebook
    String continueas="//button[@class='_42ft _4jy0 layerConfirm _1fm0 _51_n autofocus _4jy3 _4jy1 selected _51sy']"; //continue button when you register with e new facebook acount
    String newpassword="//input[@type='password']"; //password field for new facebook user 
    String newpassword1="/html/body/div/div/div[2]/div/div[1]/div/div/div/form/div[3]/input";
    String newregister="//button[@type='submit']";  // register button when you change a password for tubi account with a new facebook
    String tubilogo="/html/body/div/div/div[2]/header/div/div[1]/div/a/svg/path";   //tubi logo in left upper corner for 
    
    
}