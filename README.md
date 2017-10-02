Initial Setup

Download and Extract the following file.  It contains most relevant files for setting up your local environment for automated test writing with Eclipse.

https://drive.google.com/open?id=0B_W9HkAivGoRaTZKNDM1MnVaeVE

Intall and set up git.  
https://git-for-windows.github.io/

Install Maven
The Maven files should already be in C:\ssn_qa\maven.  Add the environment variable MAVEN_HOME and set it to C:\ssn_qa\maven, then append %MAVEN_HOME\bin% to the end of the Path variable.  To check that both are correctly set, open command prompt and type mvn -version.  If the variables are set up correctly, you will get some output showing the version and where it's located.  

Once Maven is installed, navigate to C:/ssn_qa/testSuites/ in command prompt and initialze git using the command "git init".  You will get a message saying "Initialized empty git repository in {folder location}".  Once done, clone the repository using the command "git clone https://github.com/AaronKlassenSSN/testingtestsuiteupload.git".  

Now open Eclipse.  When you first open it, you'll be prompted to select your workspace.  Set that workspace to C:\ssn_qa\testSuites\ and click OK.  Select the checkbox next to "Use this as the defauly and do not ask again" and click OK.  Once Eclipse starts click the orange "Workbench" button in the top right and you'll be taken to the default Eclipse screen.  Right click  in the Package explorer and click on Import.  When in the select screen, find Maven, expand it, and select Existing Maven Projects.  Set the root directory to your recently cloned repository (C:\ssn_qa\testSuites\qa-automated-test-suites\) and click finish.  

Everything should be set up properly now.  If you right click on testng.xml, select "run as" and then select TestNG Suite, you will see a Chrome window pop up and tests will run.  
