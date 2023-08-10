#from selenium import webdriver

#driver #webdriver.chrome(executable_path="C:\\Users\\ADITHYAH\\Downloads\\chromedriver_win32\\chromedriver.exe")
#driver.get("https://www.w3schools.com/")

from selenium import webdriver
driver = webdriver.Chrome()
driver.maximize_window()
driver.get("https://www.w3schools.com/")
logo=driver.find_element("xpath","//*[@id='pagetop']/a[1]")
print(logo.is_displayed())