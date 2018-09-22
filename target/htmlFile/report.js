$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile/Myaccount.feature");
formatter.feature({
  "line": 1,
  "name": "Check the functionality of Myaccount page",
  "description": "",
  "id": "check-the-functionality-of-myaccount-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6306851014,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify My Address link",
  "description": "",
  "id": "check-the-functionality-of-myaccount-page;verify-my-address-link",
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
  "name": "i click on Myaccount link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i should navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i enter user name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i enter password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i should naivigate to Myaccount page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "i click on Address link on the left navigation",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "i should navigate to Adddress page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "i click on shipping address edit link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i should navigate to shipping address",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "i enter first name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "i enter last name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "i select country",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "i enter address",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "i enter city",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "i select state",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "i select zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "i click on save address button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should naivigate to Myaccount page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSD.i_am_on_the_hompage()"
});
formatter.result({
  "duration": 23406633765,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSD.i_click_on_Myaccount_lin()"
});
formatter.result({
  "duration": 8483317225,
  "status": "passed"
});
formatter.match({
  "location": "SigninSD.i_should_navigate_to_login_page()"
});
formatter.result({
  "duration": 48570781,
  "status": "passed"
});
formatter.match({
  "location": "SigninSD.i_enter_user_name()"
});
formatter.result({
  "duration": 145947125,
  "status": "passed"
});
formatter.match({
  "location": "SigninSD.i_enter_password()"
});
formatter.result({
  "duration": 102547106,
  "status": "passed"
});
formatter.match({
  "location": "SigninSD.i_click_on_Login_button()"
});
formatter.result({
  "duration": 6026698000,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_should_naivigate_to_Myaccount_page()"
});
formatter.result({
  "duration": 246850329,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_click_on_Address_link_on_the_left_navigation()"
});
formatter.result({
  "duration": 3345116621,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_should_navigate_to_Adddress_page()"
});
formatter.result({
  "duration": 225665643,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_click_on_shipping_address_edit_link()"
});
formatter.result({
  "duration": 3895660597,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_should_navigate_to_shipping_address()"
});
formatter.result({
  "duration": 49375198,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_enter_first_name()"
});
formatter.result({
  "duration": 110234611,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_enter_name()"
});
formatter.result({
  "duration": 104355227,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_select_country()"
});
formatter.result({
  "duration": 420252829,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_enter_address()"
});
formatter.result({
  "duration": 37633,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_enter_city()"
});
formatter.result({
  "duration": 168927958,
  "status": "passed"
});
formatter.match({
  "location": "MyaccountSD.i_select_state()"
});
formatter.result({
  "duration": 199577050,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"javascript:void(0)\" class\u003d\"select2-choice\" tabindex\u003d\"-1\"\u003e...\u003c/a\u003e is not clickable at point (653, 393). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:13:22.693Z\u0027\nSystem info: host: \u0027OSIT-L-0209\u0027, ip: \u0027192.168.60.113\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\RNEKKA~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: f65b48020fffa00a3cacbad29a59ba2e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.Cucumberframework.Pageobject.Myaccountpage.selectState(Myaccountpage.java:127)\r\n\tat com.Cucumberframework.Stepdefinitions.MyaccountSD.i_select_state(MyaccountSD.java:74)\r\n\tat ✽.And i select state(Featurefile/Myaccount.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyaccountSD.i_select_zipcode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyaccountSD.i_click_on_save_address_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyaccountSD.i_should_naivigate_to_Myaccount_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1193479135,
  "status": "passed"
});
});