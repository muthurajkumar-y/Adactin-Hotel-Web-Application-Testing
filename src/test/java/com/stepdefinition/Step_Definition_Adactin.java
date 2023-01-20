package com.stepdefinition;

import java.time.Duration;

import com.adactin.base.Adactin_Base;
import com.adactin.runner.Book_Page;
import com.adactin.runner.Login_Page;
import com.adactin.runner.Search_Page;
import com.adactin.runner.Select_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition_Adactin extends Adactin_Base {

	@Given("user Launch The Adactin Url")
	public void user_launch_the_adactin_url() {
		url("https://adactinhotelapp.com/");
		maximize(driver);

	}

	/// Login Page

	Login_Page login = new Login_Page(driver);

	@When("enter Username In Username Field")
	public void enter_username_in_username_field() {
		sendkeys(login.getUsername(), "muthurajkumar");

	}

	@When("enter Password In Password Field")
	public void enter_password_in_password_field() {
		sendkeys(login.getPassword(), "Qwertyuiop@123");

	}

	@Then("user Click The Login Button And It Redirects To Search Hotel Page")
	public void user_click_the_login_button_and_it_redirects_to_search_hotel_page() {
		click(login.getLogin_Btn());
	}

	// Search Page

	Search_Page search = new Search_Page(driver);

	@When("user Select The Location In Location Field")
	public void user_select_the_location_in_location_field() {
		select_Value(search.getLocation_Drop(), "London");

	}

	@When("user Select The Hotel In Hotels Field")
	public void user_select_the_hotel_in_hotels_field() {
		select_Index(search.getHotels_Drop(), 2);
	}

	@When("user Select The Room Type In Room Type Field")
	public void user_select_the_room_type_in_room_type_field() {
		select_Visible(search.getRoomtype_Drop(), "Deluxe");
	}

	@When("user Select The No Of Rooms In No Of Rooms Field")
	public void user_select_the_no_of_rooms_in_no_of_rooms_field() {
		select_Value(search.getNum_Of_Rooms_Drop(), "2");
	}

	@When("user Enter The Check In Date In Check In Date Field")
	public void user_enter_the_check_in_date_in_check_in_date_field() {
		clear(search.getCheckin_Date_Box());
		sendkeys(search.getCheckin_Date_Box(), "25/11/2022");
	}

	@When("user Enter The Check Out Date In check Out Field")
	public void user_enter_the_check_out_date_in_check_out_field() {
		clear(search.getCheckout_Date_Box());
		sendkeys(search.getCheckout_Date_Box(), "26/11/2022");
	}

	@When("user Select The Adults Per Room In Adults Per Room Field")
	public void user_select_the_adults_per_room_in_adults_per_room_field() {
		select_Index(search.getNum_Of_Adult_Drop(), 3);
	}

	@When("user Select The Childeren Per Room In Children Per Room Field")
	public void user_select_the_childeren_per_room_in_children_per_room_field() {
		select_Visible(search.getNum_Of_Child_Drop(), "1 - One");
	}

	@Then("user Click The Search Button And It Redirects To Select Hotel Page")
	public void user_click_the_search_button_and_it_redirects_to_select_hotel_page() {
		click(search.getSearch_Btn());
	}

	// select Page

	Select_Page select = new Select_Page(driver);

	@When("user Select The Hotel By Clicking Corresponding Radio Button")
	public void user_select_the_hotel_by_clicking_corresponding_radio_button() {
		click(select.getHotel_Select_Radio());
	}

	@Then("user Click The Continue Button and It Redirects To Booking Page")
	public void user_click_the_continue_button_and_it_redirects_to_booking_page() {
		click(select.getContinue_Btn());
	}

	// Book Page

	Book_Page book = new Book_Page(driver);

	@When("user Enter First Name In First Name Field")
	public void user_enter_first_name_in_first_name_field() {
		sendkeys(book.getFname_Box(), "Muthurajkumar");
	}

	@When("user Enter Last Name In Last Name Field")
	public void user_enter_last_name_in_last_name_field() {
		sendkeys(book.getLname_Box(), "Y");
	}

	@When("user Enter Billing Address In Billing Address Field")
	public void user_enter_billing_address_in_billing_address_field() {
		sendkeys(book.getAddress_Box(), "Coimbatore");
	}

	@When("user Enter Credit Card Number In Credit Card No Field")
	public void user_enter_credit_card_number_in_credit_card_no_field() {
		sendkeys(book.getCard_Box(), "4653897634568367");
	}

	@When("user Select Credit Card Type In Credit Card Type Field")
	public void user_select_credit_card_type_in_credit_card_type_field() {
		select_Value(book.getCard_Type_Drop(), "VISA");
	}

	@When("user Select Expiry Month In Month Field")
	public void user_select_expiry_month_in_month_field() {
		select_Index(book.getMonth_Drop(), 12);
	}

	@When("user Select Expiry Year In Year Field")
	public void user_select_expiry_year_in_year_field() {
		select_Visible(book.getYear_Drop(), "2022");
	}

	@When("user Enter Cvv Number in Cvv Number Field")
	public void user_enter_cvv_number_in_cvv_number_field() {
		sendkeys(book.getCvv_Box(), "7279");
	}

	@Then("user Click The Book Now Button And It Redirects To Booking Confirmation Page")
	public void user_click_the_book_now_button_and_it_redirects_to_booking_confirmation_page() {
		click(book.getBook_Btn());
		wait(15);
	}

}
