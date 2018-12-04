package com.lowen.design.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:40 03/12/2018
 */
public class Main {

    public static void main(String[] args) {
        //Init data
        Person leader = new Person("Original Team Leader");
        List<Person> members = new ArrayList<Person>();
        members.add(new Person("Original Team Member 1"));
        Team originalTeam = new Team(1, "Original Team", leader, members);
        //输出原始数据
        System.out.println("Original team :" + originalTeam);

        Team cloneTeam = originalTeam.clone();
        cloneTeam.setId(2);
        cloneTeam.setName("Clone Team");
        Person cloneTeamLeader = cloneTeam.getLeader();
        cloneTeamLeader.setName("Clone Team Leader");
        List<Person> cloneTeamMembers = cloneTeam.getMembers();
        cloneTeamMembers.add(new Person("Clone Team new member"));
        cloneTeamMembers.get(0).setName("Clone Team Member");
        System.out.println("Original team :" + originalTeam);
        System.out.println("Clone team :" + cloneTeam);

    }
}
