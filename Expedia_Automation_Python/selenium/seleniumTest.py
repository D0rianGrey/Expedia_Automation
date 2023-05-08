from selenium import webdriver
from selenium.webdriver.common.by import By

# Set up the Chrome driver
driver = webdriver.Chrome()

# Navigate to the website to test
driver.get('https://www.google.com.ua')

# Close cookie
closeCookieButton = 'button#L2AGLb'
driver.find_element(By.CSS_SELECTOR, closeCookieButton).click()

# Find the search input field and enter a query
inputField = 'textarea#APjFqb'
driver.find_element(By.CSS_SELECTOR, inputField).send_keys('selenium test')

# Click the search button
submitButton = 'input#gbqfbb'
driver.find_element(By.CSS_SELECTOR, submitButton).click()

# Assert that the search results page title contains the query
titleText = 'Selenium'
assert titleText in driver.title

# Quit the driver
driver.quit()
