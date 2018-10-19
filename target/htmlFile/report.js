$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/Windowhandler.feature");
formatter.feature({
  "line": 1,
  "name": "Handling different types of popups",
  "description": "",
  "id": "handling-different-types-of-popups",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8423112616,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Handling window popup",
  "description": "",
  "id": "handling-different-types-of-popups;handling-window-popup",
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
  "name": "i click on childpoup window link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "child window should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i click on close button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i should navigate to parent window",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.i_am_on_the_hompage()"
});
formatter.result({
  "duration": 3117444754,
  "status": "passed"
});
formatter.match({
  "location": "WindowpoupSD.i_click_on_childpoup_window_link()"
});
formatter.result({
  "duration": 301613708,
  "status": "passed"
});
formatter.match({
  "location": "WindowpoupSD.child_window_should_be_opened()"
});
formatter.result({
  "duration": 35495,
  "status": "passed"
});
formatter.match({
  "location": "WindowpoupSD.i_click_on_close_button()"
});
formatter.result({
  "duration": 80223936,
  "status": "passed"
});
formatter.match({
  "location": "WindowpoupSD.i_should_navigate_to_parent_window()"
});
formatter.result({
  "duration": 61154,
  "status": "passed"
});
formatter.after({
  "duration": 731772341,
  "status": "passed"
});
});