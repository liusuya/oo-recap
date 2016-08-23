import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void shouldReturnAValueOf0WhenCalculateAreaIsCalled() {
        Square square=new Square(0);
        assertThat(square.calculateArea(), is(0));
    }

    @Test
    public void shouldReturn9WhenCalculateAreaIsCalledWith3()  {
        Square square = new Square(3);
        assertThat(square.calculateArea(), is(9));

    }
}
