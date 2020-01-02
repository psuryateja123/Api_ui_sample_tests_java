@smoke

Feature: checking the api status

  Scenario Outline: Check accepted or rejected status
    Given I post the api "<api>"  with json "<json_file>" and matches the result "<result>"
    Examples:

    |api                                                  |json_file| result|
    |  http://dummydecisionapi.azurewebsites.net/decision |   john.json      |Accepted|
    |  http://dummydecisionapi.azurewebsites.net/decision |   karen.json      |Declined|
