Feature: Validate a hotel booking functionlity in Adactin hotel application
Scenario: Login Page
Given user Launch The Adactin Url
When enter Username In Username Field
And enter Password In Password Field
Then user Click The Login Button And It Redirects To Search Hotel Page

Scenario: Search Page
When user Select The Location In Location Field
And user Select The Hotel In Hotels Field
And user Select The Room Type In Room Type Field
And user Select The No Of Rooms In No Of Rooms Field
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In check Out Field
And user Select The Adults Per Room In Adults Per Room Field
And user Select The Childeren Per Room In Children Per Room Field
Then user Click The Search Button And It Redirects To Select Hotel Page

Scenario: Select Hotel Page
When user Select The Hotel By Clicking Corresponding Radio Button
Then user Click The Continue Button and It Redirects To Booking Page

Scenario: Booking Page
When user Enter First Name In First Name Field
And user Enter Last Name In Last Name Field
And user Enter Billing Address In Billing Address Field
And user Enter Credit Card Number In Credit Card No Field
And user Select Credit Card Type In Credit Card Type Field
And user Select Expiry Month In Month Field
And user Select Expiry Year In Year Field
And user Enter Cvv Number in Cvv Number Field
Then user Click The Book Now Button And It Redirects To Booking Confirmation Page  