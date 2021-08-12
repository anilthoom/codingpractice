package com.anilt.jackson.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class TOCTree {
    private String id;
    private String name;
    private Boolean opened;
    private String comment;
    private String dueDate;
    private Boolean disabled;
    private String reviewer;
    private Boolean selected;
    private String documents;
    private String attributes;
    private ArrayList<TOCTree> childNodes;
}
