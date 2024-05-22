package com.ideyalabs.test_mail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
    private ArrayList<String> cc;
    private ArrayList<String> bcc;
    private String attachment;
}

