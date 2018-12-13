package com.lowen.design.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ：Lowen
 * @Date ：Created in 16:38 03/12/2018
 */
public class Team implements Cloneable {

    private Integer id;
    private String name;
    private String tags[];
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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (id != null ? !id.equals(team.id) : team.id != null) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;
        if (leader != null ? !leader.equals(team.leader) : team.leader != null) return false;
        return members != null ? members.equals(team.members) : team.members == null;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", leader=" + leader +
                ", members=" + members +
                '}';
    }

    /**
     * 深度克隆,只是demo，暂时没做非空判断，优秀的代码，是需要时刻考虑异常情况的
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
                cloneMembers.add(person.clone());
            }
            team.setMembers(cloneMembers);
            String[] cloneTags = new String[tags.length];
            System.arraycopy(tags, 0, cloneTags, 0, tags.length);
            team.setTags(cloneTags);
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
