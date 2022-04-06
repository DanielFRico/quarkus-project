package org.mobiera.repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Id;

import org.mobiera.entities.User;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User,Id>{

}
