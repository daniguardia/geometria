import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CirculoTestArea {
	private double radio;
	private double resultado;
	
	public CirculoTestArea(double radio, double resultado)  {
		this.radio=radio;
		this.resultado=resultado;
	}
	
	@Parameters
	public static Collection<Object[]> valores(){
		return Arrays.asList(new Object[][] {
				{7,153.94},{0,0},{-3,28.27}
		});
	}

	@Test
	public void testArea() {
		Circulo_DGM c = new Circulo_DGM(radio,"");
		double a=c.area();
		assertEquals(resultado,a,0.1);
	}
	

}
