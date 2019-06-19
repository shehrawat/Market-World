Feature: Market-World referral

Scenario Outline: Functionality of login

Given user is already on home page
When title of home page is
Then Then user clicks on  login button
Then users enter the "<email>"and "<password>"
Then user click on login button
Then user click on enter competition button
Then user click on play game button
Then user click on start game button

Examples:

	|	email        							|   	 password	   |
	|  testingajay5@gmail.com	 				|	    qwerty@@       |