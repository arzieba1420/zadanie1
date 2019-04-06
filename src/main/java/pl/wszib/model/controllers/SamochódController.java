package pl.wszib.model.controllers;

import pl.wszib.model.Samochód;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SamochódController {

    @GetMapping("list")
    public List<Samochód> lista(){

        return autos();
    }

    @GetMapping("carlist")
    public String autoList(Model model ){
       List<Samochód> lista = autos();
       model.addAttribute("nameList",lista);
        return "autoTemplate";

    }

    public List<Samochód> autos(){
        List <Samochód> auta = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            Samochód samochód = new Samochód();
            samochód.setMarka("TestMarka"+i);
            samochód.setModel("TestModel"+i);
            samochód.setCena(1000d*2*i);
            samochód.setPrzebieg(200000d+10*i);
            samochód.setRocznik(2000+i);
            auta.add(samochód);
        }
        return auta;
    }

    @GetMapping("car/single/{index}")
    public String oneAuto(Model model, @PathVariable Integer index){


        model.addAttribute("wybrane_auto",autos().get(index));
        model.addAttribute("index",index);
        return "oneAutoTemplate";
    }
}
