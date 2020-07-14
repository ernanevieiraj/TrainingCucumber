package code;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AprenderCucumber {


    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
    }

    @Quando("executá-lo")
    public void executá_lo() {
    }

    @Entao("a especifição deve finalizar com sucesso")
    public void a_especifição_deve_finalizar_com_sucesso() {
    }

    private int contador = 0;

    @Dado("que o valor do contador é {int}")
    public void que_o_valor_do_contador_é(Integer int1) {
        contador = int1;
    }

    @Quando("eu incrementar em {int}")
    public void eu_incrementar_em(Integer int1) {
        contador = contador + int1;
    }

    @Entao("o valor do contador será {int}")
    public void o_valor_do_contador_será(Integer int1) {
        Assert.assertEquals(java.util.Optional.ofNullable(int1), java.util.Optional.ofNullable(contador));
    }

    Date entrega = new Date();
    @Dado("que o prazo é dia {int}\\/{int}\\/{int}")
    public void que_o_prazo_é_dia(Integer dia, Integer mes, Integer ano) {
        Calendar cal = Calendar.getInstance();
        cal.set((Calendar.DAY_OF_MONTH), dia);
        cal.set((Calendar.MONTH), mes - 1);
        cal.set((Calendar.YEAR), ano);
        entrega = cal.getTime();
    }

    @Quando("a entrega atrasar em {int}  {int} (dia\\dias\\mes\\meses)")
    public void a_entrega_atrasar_em(Integer atraso, String tempo) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        if (tempo.equals("dias")){
            cal.add(Calendar.DAY_OF_MONTH, atraso);
        }else if (tempo.equals("meses")) {
            cal.add(Calendar.MONTH, atraso);
        }
        entrega = cal.getTime();
    }

    @Então("a entrega será efetuada em {string}")
    public void a_entrega_será_efetuada_em(String str) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = format.format(entrega);
        Assert.assertEquals(str, dataFormatada);
    }


}
