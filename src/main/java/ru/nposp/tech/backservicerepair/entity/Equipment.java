package ru.nposp.tech.backservicerepair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "eqname")
    private String eqName;

    @Column(name = "partnumber")
    private String partNumber;

    @Column(name = "serialnumber")
    private int serialNumber;

    @Column(name = "malfuntion")
    private String malfuntion;

    @Column(name = "statusrepair")
    private String statusRepair;

    public Equipment() {
    }

    public Equipment(final String companyName, final String eqName, final String partNumber, final int serialNumber,
                     final String malfuntion,
                     final String statusRepair) {
        this.companyName = companyName;
        this.eqName = eqName;
        this.partNumber = partNumber;
        this.serialNumber = serialNumber;
        this.malfuntion = malfuntion;
        this.statusRepair = statusRepair;
    }
    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public String getEqName() {
        return eqName;
    }

    public void setEqName(final String eqName) {
        this.eqName = eqName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(final String partNumber) {
        this.partNumber = partNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMalfuntion() {
        return malfuntion;
    }

    public void setMalfuntion(final String malfuntion) {
        this.malfuntion = malfuntion;
    }

    public String getStatusRepair() {
        return statusRepair;
    }

    public void setStatusRepair(final String statusRepair) {
        this.statusRepair = statusRepair;
    }

    @Override
    public String toString() {
        return "Equipment{" +
            "id=" + id +
            ", companyName='" + companyName + '\'' +
            ", eqName='" + eqName + '\'' +
            ", partNumber='" + partNumber + '\'' +
            ", serialNumber=" + serialNumber +
            ", malfuntion='" + malfuntion + '\'' +
            ", statusRepair='" + statusRepair + '\'' +
            '}';
    }
}
