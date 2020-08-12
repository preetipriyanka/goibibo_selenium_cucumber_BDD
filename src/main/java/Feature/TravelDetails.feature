Feature: Travel Details Feature

  Scenario: Enter Travel Details

    Given Home Page should be open
    When Page Title is Goibibo-XXX
    Then Maximize the window
    Then Source is entered
    And destination is entered
    And Booking Date Details are selected
    And Search button is clicked
    Then Flight details page should get opened
    And Flight Search should be sorted by Highest price
    Then Click on first Book Button
    Then Add Travel Protection
    Then Enter the details of Traveller
    And Click on Proceed
    Then Select the wallet option for payment
    Then Browser should be closed