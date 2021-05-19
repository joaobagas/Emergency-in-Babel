package com.joaob.emergencyinbabel.data.api;

import com.joaob.emergencyinbabel.data.domain.Phrase;

import java.util.ArrayList;
import java.util.List;

public class PhrasesResponse {
    private List<Phrase> phrases;
    public ArrayList<Phrase> getPhrases() { return new ArrayList<Phrase>(); }
    public void setPhrases(List<Phrase> phrases) { this.phrases = phrases; }
}
