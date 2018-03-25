package com.Nau.coll;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.FetchProfile;
import org.hibernate.annotations.IndexColumn;
@Entity
@NamedQuery(name = "xyx", query = "from TeamLeader")
public class TeamLeader {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long leader_id;
	@Column(name="LEADER_NAME")
	@Fetch(FetchMode.SELECT)
	private String leader_name;
	/*@ElementCollection(targetClass=java.lang.String.class, fetch=FetchType.EAGER)
	@JoinTable(name="MEMBERS", joinColumns=@JoinColumn(name="LEADER_ID"))
	@IndexColumn(name="ORDER_ID")
	@Column(name="MEMBER_NAME")
	private List<String> teamMembers;*/
	
	/*@ElementCollection(targetClass=java.lang.String.class, fetch=FetchType.EAGER)
	@JoinTable(name="MEMBERS", joinColumns=@JoinColumn(name="LEADER_ID"))
	@Column(name="MEMBER_NAME")
	private Set<String> teamMembers;*/
	
	@ElementCollection(targetClass=java.lang.String.class, fetch=FetchType.EAGER)
	@JoinTable(name="MEMBERS", joinColumns=@JoinColumn(name="LEADER_ID"))
	@Column(name="MEMBER_NAME")
	private Map<String, String> teamMembers;
	
	public TeamLeader() {
		// TODO Auto-generated constructor stub
	}
	public long getLeader_id() {
		return leader_id;
	}
	public void setLeader_id(long leader_id) {
		this.leader_id = leader_id;
	}
	public String getLeader_name() {
		return leader_name;
	}
	public void setLeader_name(String leader_name) {
		this.leader_name = leader_name;
	}
	/*public List<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}*/
	/*public Set<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Set<String> teamMembers) {
		this.teamMembers = teamMembers;
	}*/
	public Map<String, String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Map<String, String> teamMembers) {
		this.teamMembers = teamMembers;
	}
}
