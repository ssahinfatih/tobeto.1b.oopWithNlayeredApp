package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        // sadece db erişim doları buraya yazılır... Sql
        System.out.println("Hibernate ile veritabnına bağlandı");
    }
}
