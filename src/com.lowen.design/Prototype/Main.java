package com.lowen.design.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:40 03/12/2018
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("==============Simple clone start===============");
        //Init data
        Team originalTeam = createOriginalPerson();
        //输出原始数据
        //super.clone() 浅复制
        Team cloneTeam = originalTeam.clone();
        printCompare(originalTeam, cloneTeam);
        System.out.println("Original team :" + originalTeam);
        //修改原生数据
        modifyCloneTeam(cloneTeam);
        //输出修改后的数据
        System.out.println("After modify clone team, Original Team:" + originalTeam);
        System.out.println("After modify clone team, Clone Team:" + cloneTeam);
        System.out.println("==============Simple clone end===============\n\n");

        System.out.println("==============Deep clone start===============");
        //Init data
        originalTeam = createOriginalPerson();
        //super.deepClone() 深复制
        cloneTeam = originalTeam.deepClone();
        printCompare(originalTeam, cloneTeam);
        System.out.println("Original team :" + originalTeam);
        //修改原生数据
        modifyCloneTeam(cloneTeam);
        //输出修改后的数据
        System.out.println("After modify clone team, Original Team:" + originalTeam);
        System.out.println("After modify clone team, Clone Team:" + cloneTeam);
        System.out.println("==============Deep clone end===============");
    }

    /**
     * 创建新的Team对象并初始化数据
     *
     * @return
     */
    private static Team createOriginalPerson() {
        Person leader = new Person("Original Team Leader");
        List<Person> members = new ArrayList<Person>();
        members.add(new Person("Original Team Member 1"));
        Team originalTeam = new Team(1, "Original Team", leader, members);
        String[] tags = {"Original Tag 1"};
        originalTeam.setTags(tags);
        return originalTeam;
    }

    /**
     * 修改克隆对象的值
     *
     * @param cloneTeam
     */
    private static void modifyCloneTeam(Team cloneTeam) {
        List<Person> cloneTeamMembers = cloneTeam.getMembers();
        Person cloneTeamLeader = cloneTeam.getLeader();
        String[] tags = cloneTeam.getTags();
        //修改原始数据，对比cloneTeam和originalTeam的数据
        cloneTeam.setId(2);
        cloneTeam.setName("Clone Team");
        cloneTeamLeader.setName("Clone Team Leader");
        //修改cloneTeamMembers
        cloneTeamMembers.add(new Person("Clone Team new member"));
        cloneTeamMembers.get(0).setName("Clone Team Member");
        tags[0] = "Clone Tag 1";
    }

    /**
     * 打印对比结果
     *
     * @param originalTeam
     * @param cloneTeam
     */
    private static void printCompare(Team originalTeam, Team cloneTeam) {
        System.out.println("cloneTeam == originalTeam:" + (cloneTeam == originalTeam));
        System.out.println("cloneTeam.getId() == originalTeam.getId():" + (cloneTeam.getId() == originalTeam.getId()));
        System.out.println("cloneTeam.getName() == originalTeam.getName():" + (cloneTeam.getName() == originalTeam.getName()));
        System.out.println("cloneTeam.getLeader() == originalTeam.getLeader():" + (cloneTeam.getLeader() == originalTeam.getLeader()));
        System.out.println("cloneTeam.getMembers() == originalTeam.getMembers():" + (cloneTeam.getMembers() == originalTeam.getMembers()));
        System.out.println("cloneTeam.getTags() == originalTeam.getTags():" + (cloneTeam.getTags() == originalTeam.getTags()));
    }
}
