package ru.nposp.tech.backservicerepair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private @Getter @Setter int id;
    @Column(name = "companyname")
    private @Getter @Setter String companyName;
    @Column(name = "inn")
    private @Getter @Setter int inn;
    @Column(name = "kpp")
    private @Getter @Setter int kpp;
    @Column(name = "address")
    private @Getter @Setter String address;

    public Company() {
    }

    public Company(final String companyName, final int inn, final int kpp, final String address) {
        this.companyName = companyName;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + id +
            ", companyName='" + companyName + '\'' +
            ", inn=" + inn +
            ", kpp=" + kpp +
            ", address='" + address + '\'' +
            '}';
    }
}
