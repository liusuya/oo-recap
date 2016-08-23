import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    private Rectangle rec;

    @Test
    public void shouldReturnAValueOf0WhenCalculateAreaIsCalled() {
        rec = new Rectangle(0, 0);
        assertThat(rec.calculateArea(),is(0));
    }

    @Test
    public void shouldReturnAValueOf15WhenCalculateAreaIsCalledWithValuesOf3And5() {
        rec=new Rectangle(3,5);
        assertThat(rec.calculateArea(), is(15));
    }

    @Test
    public void shouldReturnAValueOf0WhenCalculatePerimeterIsCalled() {
        rec = new Rectangle(0,0);
        assertThat(rec.calculatePerimeter(), is(0));
    }

    @Test
    public void shouldReturnAValueOf16WhenCalculatePerimeterIsCalledWithValuesOf3And5() {
        rec = new Rectangle(3,5);
        assertThat(rec.calculatePerimeter(), is(16));
    }
}
