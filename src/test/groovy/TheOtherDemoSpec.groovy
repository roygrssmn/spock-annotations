import annotations.Performance
import spock.lang.IgnoreIf
import spock.lang.Specification
import spock.lang.Unroll


/**
 * Created by Roy Grossman on 29/03/2017.
 */
@Performance
//@IgnoreIf{ !Boolean.valueOf(properties['test.include.Performance']) })
class TheOtherDemoSpec extends Specification {

    @Unroll("Performance test number #time")
    def "A test in the other demo spec"(){
        setup:
        int i = time

        expect:
        true

        where:
        time << [1,2,3,4]
    }

}