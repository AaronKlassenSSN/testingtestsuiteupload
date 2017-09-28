Initial Setup

Download and Extract the following file.  It contains most relevant files for setting up your local environment for automated test writing with Eclipse.

https://drive.google.com/open?id=0B_W9HkAivGoRbmhudFZFMXNNVDg

Intall and set up git.  
https://git-for-windows.github.io/

Once installed, navigate to C:/ssn_qa/automated-testing-tools/qa-test-suites/ and initialze git using the command "git init"

You will get a message saying "Initialized empty git repository in {folder location}".  Once done, clone the repository using the command "git clone https://github.com/AaronKlassenSSN/testingtestsuiteupload.git".  Now import the recently cloned directory into your Eclipse workspace.  You should be able to run the test suite through Eclipse.  To test, right click on testng.xml, hover over Run As, then select TestNG Suite.  If the test runs successfully, you will see a browser pop up and run the test, as well as console output in eclipse containing test results.  


Install Maven

Download and extract the following file to C:/Program Files/Maven/.
http://apache.mirror.gtcomm.net/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.zip

Once downloaded and installed, add new environment variables MAVEN_HOME and M2_HOME.  Set both of those to the directory you extracted the Maven files to.  Also append those to the PATH variable (%MAVEN_HOME%\bin;%M2_HOME%\bin)

Once done, open command prompt and run mvn -version.  You should get output like this: 

Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-03T16:39:06-03:00)
Maven home: C:\Program Files\Maven\bin\..
Java version: 1.8.0_101, vendor: Oracle Corporation
Java home: C:\ssn_dev\sdks\java\jdk18_u101_x86\jre
Default locale: en_CA, platform encoding: Cp1252
OS name: "windows 7", version: "6.1", arch: "x86", family: "windows"