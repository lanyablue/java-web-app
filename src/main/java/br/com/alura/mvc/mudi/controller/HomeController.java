package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi Smartphone Redmi 9A");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/81oPj2JzHDL._AC_SL1500_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Vers%C3%A3o-Global/dp/B08CGXVPXW/ref=sr_1_1?keywords=celular+xiaomi&qid=1659363319&sprefix=celular%2Caps%2C218&sr=8-1&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Uma descrição qualquer para esse pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }

}
