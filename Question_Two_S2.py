import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.alert import Alert

driver = webdriver.Edge()
expected_otp_message = "Please enter the OTP"

driver.get("https://www.flipkart.com/")

    # Verify Login button is present
login_button = driver.find_element(By.XPATH, "//a[text()='Login']")
assert login_button.is_displayed()
login_button.click()

    # Enter details
phone_input = driver.find_element(By.XPATH, "//input[@type='text' and @class='_2IX_2- VJZDxU']")
phone_input.send_keys("9656901341")

request_otp_button = driver.find_element(By.XPATH, "//button[text()='Request OTP']")
request_otp_button.click()

otp_message = driver.find_element(By.XPATH, "//div[contains(text(), 'Please enter the OTP sent to')]")
assert expected_otp_message in otp_message.text

