package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("f24-14");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("f24-14"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void testEqualities(){
        Team team2 = new Team("TeamClone");
        team2.addMember("Dummy");
        Team team3 = new Team("TeamClone");
        team3.addMember("Dummy2");
        assertTrue(team.equals(team), "Team equals itself");
        assertTrue(!team.equals(1), "Team does not equal non-team object");
        assertTrue(!team.equals(team2), "Team does not equal different team object");
        assertTrue(!team2.equals(team3), "Team equals itself");
        // assertTrue(!team2.equals(team), "Team does not equal imposter");
    }

    @Test
    public void testToString(){
        assertTrue(team.toString().equals("Team(name="+team.getName()+", members="+team.getMembers()+")"));
    }

    @Test
    public void testHashCode(){
        assertEquals(-1327023895, team.hashCode());
    }
}
