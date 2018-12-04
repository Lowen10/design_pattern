package com.lowen.design.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：Lowen
 * @Date ：Created in 16:38 03/12/2018
 */
public class Team implements Cloneable {

    private Integer id;
    private String name;
    private Person leader;
    private List<Person> members;

    public Team(Integer id, String name, Person leader, List<Person> members) {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.members = members;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getLeader() {
        return leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leader=" + leader +
                ", members=" + members +
                '}';
    }

    /**
     * 深度克隆
     *
     * @return
     */
    public Team deepClone() {
        try {
            Team team = (Team) super.clone();
            Person cloneLeader = leader.clone();
            team.setLeader(cloneLeader);
            List<Person> cloneMembers = new ArrayList<Person>();
            for (Person person : members) {
                cloneMembers.add(person);
            }
            team.setMembers(cloneMembers);
            return team;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 浅度克隆
     *
     * @return
     */
    @Override
    public Team clone() {
        try {
            return (Team) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
