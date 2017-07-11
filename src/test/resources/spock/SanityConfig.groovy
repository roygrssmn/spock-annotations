package spock
/**
 * Created by Roy Grossman on 02/03/2017.
 */
runner {
    println "Run only sanity tests"
    include annotations.Sanity
    filterStackTrace true
    optimizeRunOrder false
}
