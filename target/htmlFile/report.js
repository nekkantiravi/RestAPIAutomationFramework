$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/CRMSignIn.feature");
formatter.feature({
  "line": 1,
  "name": "validate sign in crm page",
  "description": "",
  "id": "validate-sign-in-crm-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5410926883,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate signin CRM page",
  "description": "",
  "id": "validate-sign-in-crm-page;validate-signin-crm-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i am on the hompage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i should naviage to main page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.i_am_on_the_hompage()"
});
formatter.result({
  "duration": 9047954043,
  "status": "passed"
});
formatter.match({
  "location": "CrmSignInSD.i_enter_username_and_password()"
});
formatter.result({
  "duration": 203574925,
  "status": "passed"
});
formatter.match({
  "location": "CrmSignInSD.i_click_on_login_button()"
});
formatter.result({
  "duration": 6299270466,
  "status": "passed"
});
formatter.match({
  "location": "CrmSignInSD.i_should_naviage_to_main_page()"
});
formatter.result({
  "duration": 103492,
  "status": "passed"
});
formatter.after({
  "duration": 749865183,
  "status": "passed"
});
});