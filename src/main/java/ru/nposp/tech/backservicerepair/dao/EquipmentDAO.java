package ru.nposp.tech.backservicerepair.dao;

import java.util.List;
import ru.nposp.tech.backservicerepair.entity.Equipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
public interface EquipmentDAO {
    public List<Equipment> getAllEquipment();
    public Equipment getEquipment(int id);
    public void deleteEquipment(int id);
    public void saveEquipment(Equipment equipment);
}
