$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Babu/eclipse-workspace/CucumberNew/src/main/resources/Facebook.feature");
formatter.feature({
  "name": "Facebook Login Test Using Cucumber BDD",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the login by giving negative username and positive password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Configure the browser in webdriver manager",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.to_Configure_the_browser_in_webdriver_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser our case edge browser",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.to_launch_the_browser_our_case_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the login by entering negative username",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.to_check_the_login_by_entering_negative_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the login by entering positive password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.to_check_the_login_by_entering_positive_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To submit the value by clicking login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.to_submit_the_value_by_clicking_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To quit the browser after clicking the login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.to_quit_the_browser_after_clicking_the_login()"
});
formatter.result({
  "status": "passed"
});
});