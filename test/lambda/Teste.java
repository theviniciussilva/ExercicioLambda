package lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Teste {

    @Test
    public void verificaMulher(Stream<User> listaFeminina){
        Assert.assertEquals("Feminino", listaFeminina);
    }
}