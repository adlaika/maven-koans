Running Instructions:
=====================
* Clone the contents of the project at

* Open a terminal and cd to the directory you unarchived:
```cd <the directory you just unarchived>```
* Within it you'll find:
    * *pom.xml*: maven project object model file, defines the project structure and dependencies
    * *build.gradle*: gradle build file, defines the project build process and dependencies
    * *src/main/java*: production java sources for the project
    * *src/test/java*: test java sources for the project
    * *target/*: output of the project build via maven
    * *build/*: output of the project build via gradle
    * *out/*: output of the project build via Intellij when imported via gradle

Running koans from Maven:
=========================
* enter: ```mvn test``` to compile the project source and execute the tests

Running koans from Gradle:
==========================
* enter: ```gradle test``` to compile the project source and execute the tests

Running koans from Intellij IDEA:
=================================
* Open IDEA
* Select the ```Import Project``` option from either the file menu or the welcome screen
* Select pom.xml file for the project from the file menu to import as a maven project
* Select build.gradle file for the project from the file menu to import as a gradle project
* Accept the defaults for the project import screens
* To run the tests through maven (if imported as a maven project)
    * Open the maven projects tab on the right hand side
    * Select the maven-koans -> Lifecycle -> test item
    * Press the green "play" arrow at the top of the tab
* To run the tests through gradle (if imported as a gradle project)
    * Open the JetGradle tab on the right hand side
    * Open tasks tab within the JetGradle Tab
    * Doubleclick the test item
* To run the tests via the IDEA test runner
    * Click the empy dropdown at the top center of the IDE window
    * Select the ```Edit Configurations ...``` option
    * Click the + button at the top right of the window
    * Select the TestNG option
    * Set the following choices
       * Provide a name for the configuration at the top
       * Select the ```All in package``` option
       * Leave the ```Package``` input blank
       * Select the ```In whole project``` option
       * Leave the rest of the options default
    * Select your new Run Config from the dropdown and press the green play button next to it

Test Ordering
=============
* *beginner*: Novice
    * AboutKoans
    * AboutAssertions
    * AboutEquality
    * AboutPrimitives
    * AboutStrings
    * AboutObjects
    * AboutLoops
    * AboutInheritance
    * AboutCasting
    * AboutConditionals
    * AboutConstructors
    * AboutEnums
    * AboutExceptions
    * AboutMethodPreference
    * AboutOperators
    * AboutArrays
* *intermediate*: Intermediate
    * AboutAutoboxing
    * AboutCollections
    * AboutComparison
    * AboutDates
    * AboutEquality
    * AboutFileIO
    * AboutInnerClasses
    * AboutLocale
    * AboutRegularExpressions
    * AboutSerialization
* *advanced*: Advanced
    * AboutMocks

Something's wrong:
==================
* Ask your friendly local java dev for a hand at the low low cost of 1 pint


