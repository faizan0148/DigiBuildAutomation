$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "I want to Test The Login Page",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3892854100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The Login Page is Open",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginNameSetupPage.navigateToDigiBuildLoginpage()"
});
formatter.result({
  "duration": 6553342700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Valid Login Page is Open",
  "description": "",
  "id": "login-page;valid-login-page-is-open",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@endtoendautomation"
    },
    {
      "line": 7,
      "name": "@endtoendautomation"
    },
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Valid Login Page is Open",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageVerificationSteps.searchResultsAreDisplayed()"
});
formatter.result({
  "duration": 3042922800,
  "status": "passed"
});
formatter.after({
  "duration": 3005438200,
  "status": "passed"
});
});