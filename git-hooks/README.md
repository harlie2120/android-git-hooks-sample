# android-git-hooks
Git hooks collection for Android project:
- [Pre-commit] Code autoformat with Intellij formatter in Android Studio
- [Pull request] Script to run Android gradle lint for changed modules only

Requirements
------------
Android Studio is installed and you must set ANDROID_STUDIO environment variable with Android Studio's path.  
MacOS: `/Applications/Android Studio.app`  

How to Use
----------
Add the contents of this repo to your root project
1. `$ cd $PROJECT`
2. `$ git remote add android-git-hooks https://github.com/harlie2120/android-git-hooks.git`
3. `$ git subtree add --prefix=git-hooks/ android-git-hooks master`

Any person who clones your project must symlink the folder into .git folder
1. `$ mv .git/hooks .git/hooks.old && ln -s ../git-hooks .git/hooks`

You can update the hooks inside your project
1. `$ git remote add android-git-hooks https://github.com/harlie2120/android-git-hooks.git`
2. `$ git fetch android-git-hooks master`
3. `$ git subtree pull --prefix=git-hooks/ android-git-hooks master`
