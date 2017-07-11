package spock
/**
 * Created by Roy Grossman on 02/03/2017.
 */
runner {
    println "Run regression tests"
    include annotations.Regression
    // exclude annotations.Regression
    filterStackTrace true
    optimizeRunOrder false
}
