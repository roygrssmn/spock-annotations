package spock
/**
 * Created by Roy Grossman on 02/03/2017.
 */
runner {
    println "Run only performance tests"
//    include annotations.Performance
//    exclude annotations.Performance
    filterStackTrace false
    optimizeRunOrder false
}
