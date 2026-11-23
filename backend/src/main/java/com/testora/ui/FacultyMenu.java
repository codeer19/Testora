package com.testora.ui;
import com.testora.model.*;import com.testora.service.*;import com.testora.util.ConsoleUtil;import java.util.*;
/** Faculty maintenance menu for viewing and deleting problems. */
public class FacultyMenu extends Menu {protected final ProblemService problems=new ProblemService();public FacultyMenu(Scanner s,User u){super(s,u);}public void show(){while(true){System.out.println("1 List problems  2 Delete problem  0 Logout");int c=ConsoleUtil.readInt(in,"> ");if(c==0)return;if(c==1)problems.browse("","").forEach(p->System.out.println(p.getId()+" "+p.getTitle()));if(c==2)try{System.out.println(problems.delete((long)ConsoleUtil.readInt(in,"ID: "))?"Deleted.":"Not found.");}catch(Exception e){System.out.println(e.getMessage());}}}}
