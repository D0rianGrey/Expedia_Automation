from selene import browser
from selene.support.jquery_style_selectors import s

# Start the browser
browser.open_url('https://www.google.com.ua')

closeCookieButton = 'button#L2AGLb'

s(closeCookieButton).click()

# Find the search input field and enter a query
inputField = 'textarea#APjFqb'
s(inputField).type('selene test')

# Click the search button
submitButton = 'input#gbqfbb'
s(submitButton).click()

# Assert that the search results page title contains the query
titleText = 'GitHub - yashaka/selene: User-oriented Web UI browser tests in Python'
assert titleText in browser.title()

# Close the browser
browser.quit()
