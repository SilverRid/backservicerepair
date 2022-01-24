package ru.nposp.tech.backservicerepair.dao;

import javax.persistence.EntityManager;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.nposp.tech.backservicerepair.entity.Equipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Repository
public class EquipmentDAOimpl implements EquipmentDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Equipment> getAllEquipment() {
        Session session = entityManager.unwrap(Session.class);

        Query query = session.createQuery("from Equipment");
        List<Equipment> allEquipment = query.getResultList();
        return allEquipment;
    }

    @Override
    public Equipment getEquipment(final int id) {
        Equipment equipment = entityManager.find(Equipment.class, id);
        return equipment;
    }

    @Override
    public void deleteEquipment(final int id) {
        Query query = (Query) entityManager.createQuery("delete from Equipment where id = :equipID");
        query.setParameter("equipID", id);
        query.executeUpdate();
    }

    @Override
    public void saveEquipment(final Equipment equipment) {
        Equipment neweq = entityManager.merge(equipment);
        equipment.setId(neweq.getId());
        equipment.getCompany().setId(equipment.getCompany().getId());
    }
}
