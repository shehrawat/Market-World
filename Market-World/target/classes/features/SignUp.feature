Feature: Market-World referral

Scenario Outline: Functionality of SignUp

Given users are already on login page
When title of logins page is
Then Then user clicks on  Sign Up button
Then users enters "<fullname>" and "<email>"and "<password>"
Then user click on signup button
Then user opens gmail
Then user entaer "<email>"and "<password>"
Then user open email
Then user verify himself
Then user enters "<email>"and "<password>" for login
Then user clicks on Login button for login
Then user close the browser

Examples:

	|           fullname  		     	|	email        							|   	 password	   |
	|			AJay Singh				|  testingajay5@gmail.com	 				|	    qwerty@@       |
#	|			AJay Singh				|  testingajay9@yopmail.com  				|   	qwerty@@       |
#	|			AJay Singh				|  testingajay8@yopmail.com  				|   	qwerty@@	   |
#	|			AJay Singh				|  testingajay6@yopmail.com  				|   	qwerty@@       |
#	|			AJay Singh				|  singhajay.hestabit@yopmail.com  			|   	qwerty@@	   |
#	|			AJay Singh				|  testingajay4@yopmail.com 				|	    qwerty@@       |
#	|			AJay Singh				|  testingajay10@yopmail.com  				|   	qwerty@@       |
#	|			AJay Singh				|  testingajay11@yopmail.com  				|   	qwerty@@	   |
#	|			AJay Singh				|  testingajay2@yopmail.com  				|   	qwerty@@       |
#	|			AJay Singh				|  testingajay3@yopmail.com	  				|   	qwerty@@	   |