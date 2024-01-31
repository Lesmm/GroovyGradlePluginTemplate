# GroovyGradlePluginTemplate
> A template project for publishing and using your customized gradle plugin


##### 1. File -> New -> New Project -> Phone and Tablet -> Empty Activity -> Enter name 'GroovyGradlePluginTemplate' -> Finish


##### 2. Right click on Project -> New -> Module -> Android Library -> Enter name 'module' -> Finish


### 3. In `module` (for publication):
- 3.1 Delete all files except `build.gradle` and `src/main/`(leave it empty)
- 3.2 Create `groovy` folder under `src/main/`
- 3.3 Create package and plugin class, e.g. ` com.best.GradlePluginExt`
- 3.4 Complete the build.gradle file with `plugins`, `dependencies` and `publishing` sections ...


    // Use your own JAVA version
    export JAVA_HOME=$W_PATH/JDK/jdk-17_macos-x64_bin/Contents/Home
    
    // Then build and publish to local or remote maven plugin repository
    ./gradlew publish


### 4. In `app` (for usage):

Follow the comments `/// >>>>> Usage code A/B/C` codes in files `settings.gradle` and `app/build.gradle`.
Finally, you will see the output below:

    > Configure project :app
    ------------------------
    2024-01-31 20:07:22: applying you customize plugin
    ------------------------


> Tips: you should comment out the codes below `/// >>>>> Usage code B & C` when you want to do first/retry publish the plugin


### 5. How to debug the plugin?


- Click `Edit Configurations...` -> Click `+` -> Gradle -> Enter the name and `app:build --debug` in Run arguments field -> OK

<div align="center">
    <img src="https://raw.githubusercontent.com/Lesmm/GroovyGradlePluginTemplate/master/screenshots/screenshot-20240201-105541.png" width="50%">
</div>

- Set a breakpoint and then click `Debug` button to start debugging

<div align="center">
    <img src="https://raw.githubusercontent.com/Lesmm/GroovyGradlePluginTemplate/master/screenshots/screenshot-20240201-105946.png" width="50%">
</div>

