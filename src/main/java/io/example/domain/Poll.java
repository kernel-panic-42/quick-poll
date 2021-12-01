package io.example.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Poll {

	@Id
	@GeneratedValue
	@Column(name = "POLL_ID")
	private Long id;

	@Column(name = "QUESTION")
	private String question;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "POLL_ID")
	@OrderBy
	private Set<Option> options;

}
