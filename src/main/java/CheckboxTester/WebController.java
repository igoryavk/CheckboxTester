package CheckboxTester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    private DataInterface dao;
    @Autowired
    public void setDao(DataInterface dao) {
        this.dao = dao;
    }

    @GetMapping("/")
    public String getHomepage(Model model)
    {
        Order order=new Order();
        List<Roll> rolls= dao.getData();
        model.addAttribute("order",order);
        model.addAttribute("rolls",rolls);
        return "homepage";
    }
    @GetMapping("/order")
    public String getOrder(@ModelAttribute("order") Order order)
    {
        return "order";
    }
}
