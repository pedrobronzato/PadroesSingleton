package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EmpresaTest {
    @Test
    public void deveRetornarNomeEmpresa() {
        Empresa.getInstance().setNomeEmpresa("UniAcademia");
        assertEquals("UniAcademia", Empresa.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarCnpjEmpresa() {
        Empresa.getInstance().setCnpjEmpresa("21.562.368/0001-13");
        assertEquals("21.562.368/0001-13", Empresa.getInstance().getCnpjEmpresa());
    }
}