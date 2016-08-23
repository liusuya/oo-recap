import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircleTest {

    private Circle circle;

    @Test
    public void shouldReturnAValueOf0WhenGetAreaIsCalled() {

        circle = new Circle(0);
        assertThat(circle.getArea(),is(0.0));

    }

    @Test
    public void shouldReturnAValueOf9PiWhenGetAreaIsCalledWithARadiusOf3() {
        circle = new Circle(3);
        assertThat(circle.getArea(),is(Math.PI*9));
    }

    @Test
    public void shouldReturnAValueOf0WhenGetPerimeterIsCalled() {
        circle = new Circle(0);
        assertThat(circle.getPerimeter(),is(0.0));


    }

    @Test
    public void shouldReturnAValueOf6PiWhenGetPerimeterIsCalledWith3() {


    }
}
