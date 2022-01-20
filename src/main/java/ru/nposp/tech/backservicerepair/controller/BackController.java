package ru.nposp.tech.backservicerepair.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.nposp.tech.backservicerepair.entity.Equipment;
import ru.nposp.tech.backservicerepair.services.EquipmentService;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@RestController
public class BackController {
    @Autowired
    EquipmentService equipmentService;
    @GetMapping("/eqs")
    public List<Equipment> showAllEquipment() {
        List<Equipment> allEquipment = equipmentService.getAllEquipment();
        return allEquipment;
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return "Hello, " + name;
    }
    @PostMapping("/eqs")
    public Equipment saveEquipment(@RequestBody Equipment equipment) {
        equipmentService.saveEquipment(equipment);
        return  equipment;
    }
}
