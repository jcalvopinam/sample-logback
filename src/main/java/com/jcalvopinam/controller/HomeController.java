package com.jcalvopinam.controller;

import com.jcalvopinam.console.Linux;
import com.jcalvopinam.console.Mac;
import com.jcalvopinam.console.OS;
import com.jcalvopinam.console.Windows;
import com.jcalvopinam.utils.Commons;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author juanca <juan.calvopina@gmail.com>
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private static final String PID = "123-WEB-987";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model) {

        model.addAttribute(Commons.PID, "This is a Sample of logback with MDC");

        MDC.put("PID", String.format("PID: [%s]", PID));
        logger.debug("OS from Web");

        OS windows = new Windows();
        model.addAttribute("windows", windows.getName());

        OS linux = new Linux();
        model.addAttribute("linux", linux.getName());

        OS mac = new Mac();
        model.addAttribute("mac", mac.getName());

        return "welcome";

    }
}