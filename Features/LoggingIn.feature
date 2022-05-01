Feature: LogginIn functionality

Scenario Outline: I'm signing in

Given the user is in home page
When the user enter "<username>" and "<password>"
And  the user press submit button
Then the user successfully logged in


Examples:

|username|password|
|guest|guest|
