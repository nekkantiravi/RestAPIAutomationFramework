$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/CRMSignIn.feature");
formatter.feature({
  "line": 1,
  "name": "validate sign in crm page",
  "description": "",
  "id": "validate-sign-in-crm-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5275005538,
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
  "duration": 4383733859,
  "status": "passed"
});
formatter.match({
  "location": "CrmSignInSD.i_enter_username_and_password()"
});
formatter.result({
  "duration": 196088083,
  "status": "passed"
});
formatter.match({
  "location": "CrmSignInSD.i_click_on_login_button()"
});
formatter.result({
  "duration": 1294106251,
  "status": "passed"
});
formatter.match({
  "location": "CrmSignInSD.i_should_naviage_to_main_page()"
});
formatter.result({
  "duration": 123592,
  "status": "passed"
});
formatter.after({
  "duration": 773869690,
  "status": "passed"
});
});