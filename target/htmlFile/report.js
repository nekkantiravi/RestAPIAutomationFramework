$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/Freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Verify CRM registration page",
  "description": "",
  "id": "verify-crm-registration-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13068969100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify CRM successful creation of registration page",
  "description": "",
  "id": "verify-crm-registration-page;verify-crm-successful-creation-of-registration-page",
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
  "name": "i click on signup link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i should navigate to registration  page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i select edition from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i should enter firstname",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i should enter lastname",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i should enter email",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i should enter confirmemail",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i should enter username",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i should enter password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i should enter confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "i check the terms and conditions checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "i click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "i should navigate to profile details page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.i_am_on_the_hompage()"
});
formatter.result({
  "duration": 285649600,
  "error_message": "java.lang.ExceptionInInitializerError\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n\tat ✽.Given i am on the hompage(Featurefile/Freecrm.feature:5)\r\nCaused by: java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.util.Comparator java.util.TreeMap.comparator accessible: module java.base does not \"opens java.util\" to unnamed module @71dac704\r\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:357)\r\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)\r\n\tat java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:177)\r\n\tat java.base/java.lang.reflect.Field.setAccessible(Field.java:171)\r\n\tat cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)\r\n\tat cucumber.deps.com.thoughtworks.xstream.converters.collections.TreeMapConverter.\u003cclinit\u003e(TreeMapConverter.java:50)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\r\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\r\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FreeCrmSD.i_click_on_signup_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_navigate_to_registration_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_select_edition_from_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_firstname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_confirmemail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_should_enter_confirm_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_check_the_terms_and_conditions_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCrmSD.i_shoud_navigate_to_profile_details_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4523545900,
  "status": "passed"
});
});