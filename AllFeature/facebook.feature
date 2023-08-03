Feature: Test the Facebook Application

  Scenario Outline: Test The Register Page Functionality
    Given User on Register Page
    When User enter personal information "<firstname>" and "<lastname>", "<mobieNumber>", "<reEmail>", "<password>"
    Then User enter DateOfBirth is "<date>" and "<month>" and "<year>"
    And User select "<gender>"
    Then User Click on SignUp button

    Examples: 
      | firstname | lastname | mobieNumber       | reEmail          | password   | date | month | year | gender |
      | nirmala   | patil    | nirmala@gmail.com | nirmala@gmail.com | nirmala@123| 15 | Jan   | 1993 | Male   |
      | satvik    | mhase    | satvik@gmail.com  | satvik@gmail.com | satvik@123 |   30 | Jun   | 2000 | Female |
