package com.pbob.lazada;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * HomeController
 * 
 * @Controller menandakan bahwa class ini adalah controller
 */
@Controller
public class proController {
    
    /*
     * @GetMapping("/") menandakan bahwa method home() akan dipanggil ketika user mengakses URL http://localhost:8080/
     */
    @GetMapping("/pro")
    public String pro() {
        // Mengembalikan nama view yang akan ditampilkan, yaitu home.html
        return "pro";
    }
}
