package ru.mesotron.jpauc.ejb.auth;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ru.mesotron.jpauc.domain.auth.Group;
import ru.mesotron.jpauc.ejb.PersistableEjb;

@Stateless
@LocalBean
public class GroupEjb extends PersistableEjb<Group> {

}
