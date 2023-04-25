import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAdd.class,
        TestAllMethodsExceptException.class,
        TestBeforeAndAfter.class,
        TestBeforeClassAndAfterClass.class,
        TestDifferentAssertions.class,
        TestException.class,
        TestExpectedException.class,
        TestParameterized.class

})
public class TestSuite {

}
