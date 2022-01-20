package ru.nposp.tech.backservicerepair.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nposp.tech.backservicerepair.dao.EquipmentDAO;
import ru.nposp.tech.backservicerepair.entity.Equipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Service
public class EquipmentServiceImp implements EquipmentService{
    @Autowired
    private EquipmentDAO equipmentDAO;

    @Override
    @Transactional
    public List<Equipment> getAllEquipment() {
        return equipmentDAO.getAllEquipment();
    }

    @Override
    @Transactional
    public Equipment getEquipment(final int id) {
        return null;
    }

    @Override
    @Transactional
    public void deleteEquipment(final int id) {

    }

    @Override
    @Transactional
    public void saveEquipment(final Equipment equipment) {

    }
}
