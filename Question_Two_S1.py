import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By

driver=webdriver.Edge()
driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/")

expected_title = "Want to practice test automation? Try these demo sites! | Automation Panda"
print(driver.title)
assert driver.title == expected_title
 #verify title
speaking_link = "Speaking"
expected_speaking_title = "Speaking Engagements – Automation Panda"

speaking_element = driver.find_element_by_link_text(speaking_link)
speaking_element.click()


assert expected_speaking_title in driver.title
# verify keynote
keynote_addresses_text = "Keynote Addresses"
keynote_element = driver.find_element_by_link_text(keynote_addresses_text)
assert keynote_element.is_displayed()
assert "Keynote Addresses" in keynote_element.text
#verify conference
conference_talks_text = "Conference Talks"
conference_element = driver.find_element_by_link_text(conference_talks_text)
assert conference_element.is_displayed()
assert "Conference Talks" in conference_element.text