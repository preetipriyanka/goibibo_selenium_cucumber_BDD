$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Feature/TravelDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Travel Details Feature",
  "description": "",
  "id": "travel-details-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Enter Travel Details",
  "description": "",
  "id": "travel-details-feature;enter-travel-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Home Page should be open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Page Title is Goibibo-XXX",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Maximize the window",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Source is entered",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "destination is entered",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Booking Date Details are selected",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Search button is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Flight details page should get opened",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Flight Search should be sorted by Highest price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on first Book Button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Add Travel Protection",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the details of Traveller",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Proceed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select the wallet option for payment",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Browser should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelDetails.user_already_on_login_page()"
});
formatter.result({
  "duration": 20806096431,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.title_of_website()"
});
formatter.result({
  "duration": 17776914,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.max_win()"
});
formatter.result({
  "duration": 4341758812,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.src_details()"
});
formatter.result({
  "duration": 11403805643,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.des_details()"
});
formatter.result({
  "duration": 850506431,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.date_details()"
});
formatter.result({
  "duration": 311062571,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.search()"
});
formatter.result({
  "duration": 275652602,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.flight_details_page_verification()"
});
formatter.result({
  "duration": 29806555947,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.Sorted_by_price()"
});
formatter.result({
  "duration": 406074531,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.Book()"
});
formatter.result({
  "duration": 470279241,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.travel_protect()"
});
formatter.result({
  "duration": 1678578482,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.select_title()"
});
formatter.result({
  "duration": 752077359,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.Proceed()"
});
formatter.result({
  "duration": 8092109114,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.Payment()"
});
formatter.result({
  "duration": 4339693442,
  "status": "passed"
});
formatter.match({
  "location": "TravelDetails.close_browser()"
});
formatter.result({
  "duration": 2660189508,
  "status": "passed"
});
});