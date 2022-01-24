package ru.nposp.tech.backservicerepair.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Entity
@Table(name = "equipment")
public class Equipment {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
//
//    @Column(name = "companyname")
//    private String companyName;

    @Column(name = "eqname")
    private @Getter @Setter
    String eqName;

    @Column(name = "partnumber")
    private @Getter @Setter String partNumber;

    @Column(name = "serialnumber")
    private @Getter @Setter int serialNumber;

    @Column(name = "malfunction")
    private @Getter @Setter String malfunction;

    @Column(name = "statusrepair")
    private @Getter @Setter String statusRepair;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private @Getter @Setter Company company;

    public Equipment() {
    }

    public Equipment(final String eqName, final String partNumber, final int serialNumber,
                     final String malfuntion,
                     final String statusRepair) {

        this.eqName = eqName;
        this.partNumber = partNumber;
        this.serialNumber = serialNumber;
        this.malfunction = malfuntion;
        this.statusRepair = statusRepair;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Equipment{" +
            "id=" + id +
            ", eqName='" + eqName + '\'' +
            ", partNumber='" + partNumber + '\'' +
            ", serialNumber=" + serialNumber +
            ", malfunction='" + malfunction + '\'' +
            ", statusRepair='" + statusRepair + '\'' +
            ", company=" + company +
            '}';
    }
}
