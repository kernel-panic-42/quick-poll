package io.example.dto;

import java.util.Collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoteResult {
    private int totalVotes;
    private Collection<OptionCount> results;
}
