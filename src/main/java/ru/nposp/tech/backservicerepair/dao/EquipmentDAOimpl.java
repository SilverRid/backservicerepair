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

        Query<Equipment> query = session.createQuery("from Equipment", Equipment.class);
        List<Equipment> allEquipment = query.getResultList();
        return allEquipment;
    }

    @Override
    public Equipment getEquipment(final int id) {
        return null;
    }

    @Override
    public void deleteEquipment(final int id) {

    }

    @Override
    public void saveEquipment(final Equipment equipment) {

    }
}
