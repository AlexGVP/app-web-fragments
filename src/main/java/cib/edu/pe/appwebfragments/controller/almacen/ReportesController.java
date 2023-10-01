package cib.edu.pe.appwebfragments.controller.almacen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/reporte")
public class ReporteController {
    @GetMapping("")
    public String index() {
        return "almacen/reporte";
    }
}
