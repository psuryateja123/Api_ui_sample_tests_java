# Api_ui_sample_tests_java
# Test guidence 

#### The tests in this framework are written in BDD (cucumber) pattern using feature file.

#### Folder structure:
* There is a [src](src) folder and it has [test](src/test) folder.
* Test has a java folder, in java folder there exists a resource folder that has the following
* [Feature files](src/test/java/resource/feature_files)
* [Page objects](src/test/java/resource/page_objects)
* [Step definitions](src/test/java/resource/step_defs)
* [Utils](src/test/java/resource/utils)
* [Locators](src/test/java/resource/utils)

#### [Feature files](src/test/java/resource/feature_files)
* In this folder, there are two feature files.
* [API Test](src/test/java/resource/feature_files/api_tests.feature): This feature file has all the scenarios api automation.
* [UI Test](src/test/java/resource/feature_files/ui_test.feature).feature: This feature file has all the scenarios, UI tests.

#### [Page objects](src/test/java/resource/page_objects)
* It has a class, 
* In [ui_test_pageobject](src/test/java/resource/page_objects/ui_test_pageobject.java), I have placed the methods that are related to the News search.

#### [Step definitions](src/test/java/resource/step_defs)
* It has two step definition files
* [API stepsDefs](src/test/java/resource/step_defs/api_automationStepDefs.java) is related to [API Test](src/test/java/resource/feature_files/api_tests.feature).
* [UI stepDefs](src/test/java/resource/step_defs/ui_testStepDefs.java)is related to [UI Test](src/test/java/resource/feature_files/ui_test.feature)

#### [Utils](src/test/java/resource/utils): 
* In this folder there are two class, they are the supporting class for the project.
* [Env.java](src/test/java/resource/utils/Env.java) has url and the name of the browser, further configurations browserstack configurations can be added.
* [RunTest.java](src/test/java/resource/utils/RunTest.java) has browser driver configurations, cucumber options - location of feature files, location of steps definition files. In this class further browserstack configuration can be added.
* [Locators.java](src/test/java/resource/utils/locators.java) has locators and will be used in [ui_test_pageobject.java](src/test/java/resource/utils/ui_test_pageobject.java)


#### cloning the project:
* open terminal and navigate to the location where the project need to be clone, then type
```
 https://github.com/psuryateja123/Api_ui_sample_tests_java.git
```

#### Running the test:
* I have used tags to run the individual feature file. 
* To run the tests in Treatment cost feature file, open the terminal and navigate to the root folder of the project and type

```
 mvn clean test -Dcucumber.options="src/test/java/resource/feature_files --tags @smoke"
```

* As I have configured the tags as smoke and smoke1 in the feature file. 

#### Viewing results:

* For viewing the results for the test run, open the [report.js](report.js) (open in a browser)

#### Improvements:

* There is a further room for expanding the framework by integrating BrowserStack to run on multiple browsers. 
* Integration of Allure report for better visual representation, I have added to other projects in [JavaScript](https://github.com/psuryateja123/cypress_meetup_demo) and [Python](https://github.com/psuryateja123/python-behave)
* Integration of framework to CI and adding build notifications to communication channels like - Slack, did it for my previous projects in [JavaScript](https://github.com/psuryateja123/cypress_meetup_demo) and [Python](https://github.com/psuryateja123/python-behave)
