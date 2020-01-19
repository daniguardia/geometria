import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CirculoTestPerimetro {
	private double radio;
	private double resultado;
	
	public CirculoTestPerimetro(double radio, double resultado)  {
		this.radio=radio;
		this.resultado=resultado;
	}
	
	@Parameters
	public static Collection<Object[]> valores2(){
		return Arrays.asList(new Object[][] {
				{7,43.98},{0,0},{-3,18.84}
		});
	}
	
	@Test
	public void testPerimetro() {
		Circulo_DGM c = new Circulo_DGM(radio,"");
		double p=c.perimetro();
		assertEquals(resultado,p,0.1);
	}

}
