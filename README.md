Cross Platform Appium-JUnit-Project Using Maven
---
# Install Maven (Maven 3.3.3)
# Install Homebrew : http://brew.sh/
 ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

# get node.js
 brew install node

# get appium
 npm install -g appium

# get appium client
 npm install wd

You will then need to start appium, eg:

 ./0-OneStop.sh

#To compile and run all tests, run:

    mvn clean compile
    mvn test

#To run a single test, run:

   mvn -Dtest=com.qa.shopkick.tests.Authentication.EmailAuthentication test

# Good idea to follow

# Check out the code from Stash
https://github.com/nrvivek23/CrossPlatformAppium.git

#Download Android Studio ... It has IDE and Android SDK and Command Prompt
# Import the code as a Maven project