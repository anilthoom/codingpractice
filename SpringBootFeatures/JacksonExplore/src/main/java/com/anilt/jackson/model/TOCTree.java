package com.anilt.jackson.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class TOCTree {
    private String id;
    private String name;
    private String opened;
    private String comment;
    private String dueDate;
    private String disabled;
    private String reviewer;
    private String selected;
    private String documents;
    private String attributes;
    private ArrayList<TOCTree> childNodes;
}
