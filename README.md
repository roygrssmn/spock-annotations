# Spock configuration testing

#### Example of using spock configuration file in order to run specific tests or specific classes using Spock Test Framework

### Installing

Clone project or untar to a folder

```
$ git clone https://....
```

## Running examples

Running the regression test
```
$ ./gradlew RegressionTest
```
Running the sanity test
```
$ ./gradlew SanityTest
```

Running the performance test
```
$ ./gradlew PerformanceTest
```

Running the performance test with specific spock config file
```
$ ./gradlew PerformanceTest -Pspock.configuration=spock/PerformanceConfig.groovy
```


## Spock configuration parameters
* ```filterStackTrace```
    * Filters spockFrameWork exceptions
    * Configure Spock whether it should filter stack traces or not
    * Default True

* ```optimizeRunOrder```
    * re-run failing methods before successful methods
    * run the fastest methods, followed by the slower methods
    * Default False

* ```include```
    * Annotations and Base classes to run

* ```exclude```
   * Annotations and Base classes to run

## Authors

* **Roy Grossman** - *Initial work* - [roy424](https://github.com/roy424)

## License

This project is licensed under the Apache2 License - see the [Apache2 License](https://www.apache.org/licenses/LICENSE-2.0) file for details

## Acknowledgments

* Based on knowledge from pass work# spock-annotations
