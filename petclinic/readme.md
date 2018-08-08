# PetClinic application

Based on the Spring PetClinic this application is modified to have a Supplements page which can load supplements data either from a local String or via a remote request to the Supplements webapp.

See [XRebel APM Demo Google Doc](https://docs.google.com/a/zeroturnaround.com/document/d/1mdsDi3mu3Zy9r_0TZLKD6llTXsePceIUlGWdfdrJRt0/edit?usp=sharing) for more information

### Setup

####Eclipse
- Import the project
- Built it via ```mvn package```
- Install XRebel Local and JRebel plugins
- Create the Run configuration for this project
- Depending on the demo, add XRebel Local and/or JRebel to the run config
- Start the app

####IntelliJ
- Import the project
- Built it via ```mvn package```
- Install the JRebel plguin for IntelliJ if needed
- [Download XRebel Local](https://zeroturnaround.com/software/xrebel/download/) and install it
- Create the run configuration and [add XRebel Local to it](http://manuals.zeroturnaround.com/xrebel/install/index.html#intellij-idea)
- Start the app

###Activation
- PetClinic should start up and you should see the XRebel and/or JRebel banner(s) in the console
- The app is available under http://localhost:8080
- Once it opens up, the XRebel Local activation screen shows
- Upload your ```xrebel.lic``` file and click Confirm



