Feature: LogginIn functionality

Scenario Outline: Hello

Given the user is in home page
When the user enter "<username>" and "<password>"
And  the user press submit button
Then the user successfully logged in
  And  the user press submit button
  Then the user successfully logged in



Examples:

|username|password|
|guest|guest|
