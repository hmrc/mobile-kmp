
# mobile-kmp (temp for iOS)

[![Build Status](https://app.bitrise.io/app/9657a111ddf51a22/status.svg?token=XmWxk2LEfRCCqW168pxxIg&branch=master)](https://app.bitrise.io/app/9657a111ddf51a22)
![LINE](https://img.shields.io/badge/line--coverage-98%25-brightgreen.svg)
![BRANCH](https://img.shields.io/badge/branch--coverage-92%25-brightgreen.svg)
![COMPLEXITY](https://img.shields.io/badge/complexity-1.53-brightgreen.svg)


This project is only needed for iOS as there is a limitation in 1.3.61 and lower that limits one KMP project per app. This is meant to be fixed in 1.3.70

For library usage see tax-kalculator and help-to-save-kalculator

https://github.com/hmrc/tax-kalculator
https://github.com/hmrc/help-to-save-kalculator

## Installation

### iOS

Each release tag includes a Carthage binary dependency specification. To use the Carthage binary:
* In the same directory as your Cartfile, add a directory.
```shell script
 $ mkdir Carthage-Binaries
``` 
* Add a JSON file that holds your Carthage binary specifications.
```shell script
 $ touch Carthage-Binaries/HelpToSaveKalculator.json
```
* Point to the latest release in your JSON file.
```json
    {
      "0.3.7": "https://github.com/hmrc/tax-kalculator/releases/download/0.3.7/HelpToSaveKalculator.framework.zip"
    }
```
* List the dependency in your Cartfile
```shell script
    ...
    binary "Carthage-Binaries/HelpToSaveKalculator.json" == 0.3.7
    ...
```
* Update your Carthage dependencies as per your requirements.

#### Simulator Architectures: 
* Most Carthage users will include a Carthage [copy-frameworks](https://www.raywenderlich.com/416-carthage-tutorial-getting-started) build step that removes unwanted architectures for 
distribution builds.
* If you don't use Carthage and just download and link the framework in your project, it'll be necessary to strip unwanted architectures in a build step.
You may want to implement something like [this](http://ikennd.ac/blog/2015/02/stripping-unwanted-architectures-from-dynamic-libraries-in-xcode/).