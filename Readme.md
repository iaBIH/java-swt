# Jave SWT Example

This is a simple working example of building java swt application using maven and ant.

The example create a window in the center of the screen. The window has a button when clicked, it changes the window title. 


![Screenshot from 2023-04-10 16-45-33](https://user-images.githubusercontent.com/28802516/230925111-18bd8be0-7896-4786-a3c8-cfbd0c30d2bf.png)

### building and running using ant




             ant clean
             ant
             # to run the compiled jar again
             java -jar dist/swt-example.jar


### building and running using maven 

       
Maven repository does not work innm y case, so I have to use local repository  by installing the library file using:


             mvn install:install-file -Dfile=lib/swt.jar -DgroupId=org.eclipse.swt -DartifactId=org.eclipse.swt.linux.x86_64 -Dversion=4.27

After that: 

             mvn dependency:copy-dependencies
             mvn clean install
             # to run the compiled jar again
             java -jar target/dist/Window-1.0.0.jar 



    <groupId></groupId>
        <artifactId>o</artifactId>
        <version></version>
   
