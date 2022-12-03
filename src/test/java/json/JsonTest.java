package json;

import org.junit.Assert;
import org.junit.Test;

public class JsonTest {

    @Test
    public void testCriandoJson() {
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        String valor = manipulandoJson.criandoJson();
        Assert.assertEquals("Resultado diferente do esperado","Jorge",valor);
    }
    @Test
    public void lerJson(){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        manipulandoJson.navegarJsonArquivo();

    }

}
