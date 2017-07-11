import annotations.Performance
import annotations.Sanity
import annotations.Regression
import spock.lang.Specification


/**
 * Created by Roy Grossman on 29/03/2017.
 */
class DemoSpec extends Specification {

    @Regression
    def "Regression test #1"(){expect: isTrue()}

    @Regression
    def "Regression test #2"(){expect: true}

    @Performance
    def "Performance test"(){expect: true}

    @Sanity
    def "Sanity test"(){expect: true}

    boolean isTrue(){
        assert 1 == 2 : "Assertion demo for 'filterStackTrace' example"
    }

}