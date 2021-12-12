//package ir.mci.infradashboard.db.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="asset")
//public class Asset {
//
//    @Column(name = "ID")
//    public Long id;
//    @Column(name = "DATACENTER")
//    public String datacenter;
//    @Column(name = "RACK")
//    public String rack;
//    @Column(name = "UNIT")
//    public String unit;
//    @Column(name = "SERVERMODEL")
//    public String servermodel;
//    @Column(name = "CPU")
//    public String cpu;
//    @Column(name = "RAM")
//    public String ram;
//    @Column(name = "PROJECT")
//    public String project;
//    @Column(name = "PUBLISHED")
//    public boolean published;
//
//    public Asset(Long id, String datacenter, String rack, String unit, String servermodel, String cpu, String ram, String project, boolean published) {
//        this.id = id;
//        this.datacenter = datacenter;
//        this.rack = rack;
//        this.unit = unit;
//        this.servermodel = servermodel;
//        this.cpu = cpu;
//        this.ram = ram;
//        this.project = project;
//        this.published = published;
//    }
//
//    public Asset() {
//    }
//
//    @Override
//    public String toString() {
//        return "Asset{" +
//                "id=" + id +
//                ", datacenter='" + datacenter + '\'' +
//                ", rack='" + rack + '\'' +
//                ", unit='" + unit + '\'' +
//                ", servermodel='" + servermodel + '\'' +
//                ", cpu='" + cpu + '\'' +
//                ", ram='" + ram + '\'' +
//                ", project='" + project + '\'' +
//                ", published=" + published +
//                '}';
//    }
//}
