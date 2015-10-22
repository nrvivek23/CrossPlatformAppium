#!/bin/sh

Echo "0-automaionAndroidPrepScript.sh"

./0-automaionAndroidPrepScript.sh

#Build
mvn clean compile
#Run Tests

mvn -DplatformType='Android' -DplatformVersion='4.4.2' -DdeviceName='GalaxyS5' -DdeviceUDID='null' -Dtest=com.qa.shopkick.tests.SmokeSuiteTwo test

############ Going to Uninstall the app
#adb uninstall com.shopkick.app