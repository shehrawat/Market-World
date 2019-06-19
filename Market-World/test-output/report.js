$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Cucumber Market world/Market-World/src/main/java/features/Login.feature");
formatter.feature({
  "name": "Market-World referral",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Functionality of login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "title of home page is",
  "keyword": "When "
});
formatter.step({
  "name": "Then user clicks on  login button",
  "keyword": "Then "
});
formatter.step({
  "name": "users enter the \"\u003cemail\u003e\"and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on enter competition button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on play game button",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on start game button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "testingajay5@gmail.com",
        "qwerty@@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Functionality of login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of home page is",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.title_of_home_page_is()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Then user clicks on  login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.then_user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enter the \"testingajay5@gmail.com\"and \"qwerty@@\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.users_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on enter competition button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_enter_competition_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on play game button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_play_game_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on start game button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_start_game_button()"
});
formatter.result({
  "status": "passed"
});
});