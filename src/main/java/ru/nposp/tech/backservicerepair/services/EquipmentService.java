package ru.nposp.tech.backservicerepair.services;

import java.util.List;
import ru.nposp.tech.backservicerepair.entity.Equipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
public interface EquipmentService {
    public List<Equipment> getAllEquipment();
    public Equipment getEquipment(int id);
    public void deleteEquipment(int id);
    public void saveEquipment(Equipment equipment);
}
