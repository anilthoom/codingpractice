package com.anilt.file.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FileResponse {
    private String id;
    private String name;
    private Long size;
    private String url;
    private String contentType;
}
