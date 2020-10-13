import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Test {

    @Test
    fun passingTest() {
        assertThat(true, equalTo(true))
    }
}