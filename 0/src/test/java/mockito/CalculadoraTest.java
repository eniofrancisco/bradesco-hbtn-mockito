package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {

    @Mock
    ServicoMatematico servico;

    @InjectMocks
    Calculadora calculadora;

    @Test
    void testCalcularSomaComMock() {
        when(servico.somar(2, 3)).thenReturn(5);

        int resultado = calculadora.calcularSoma(2, 3);

        assertEquals(5, resultado);
        verify(servico).somar(2, 3);
    }
}
