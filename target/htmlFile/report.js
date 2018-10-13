$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/International.feature");
formatter.feature({
  "line": 1,
  "name": "Verify international shipping",
  "description": "",
  "id": "verify-international-shipping",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17151515048,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify IS",
  "description": "",
  "id": "verify-international-shipping;verify-is",
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
  "name": "i click on shipping to link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i should navigate to context chooser page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i select shipping country",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i select currency",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i should navigate to the corresponding country page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.i_am_on_the_hompage()"
});
formatter.result({
  "duration": 18410083298,
  "status": "passed"
});
formatter.match({
  "location": "InternationalSD.i_click_on_shipping_to_link()"
});
formatter.result({
  "duration": 728703073,
  "status": "passed"
});
formatter.match({
  "location": "InternationalSD.i_should_navigate_to_context_chooser_page()"
});
formatter.result({
  "duration": 68424,
  "status": "passed"
});
formatter.match({
  "location": "InternationalSD.i_select_shipping_country()"
});
formatter.result({
  "duration": 911757,
  "error_message": "java.lang.NullPointerException\r\n\tat com.Cucumberframework.Pageobject.Internationalpage.selectInternatioanlCountry(Internationalpage.java:53)\r\n\tat com.Cucumberframework.Stepdefinitions.InternationalSD.i_select_shipping_country(InternationalSD.java:27)\r\n\tat ✽.And i select shipping country(Featurefile/International.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "InternationalSD.i_select_currency()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InternationalSD.i_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InternationalSD.i_should_navigate_to_the_corresponding_country_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1158938684,
  "status": "passed"
});
});