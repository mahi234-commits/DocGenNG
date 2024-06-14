package com.DocGenNG.model.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
public class DocumentsRequest {

    @NotEmpty(message = "quoteId is required")
    private String quoteId;


    @NotEmpty(message = "docType is required")
    private String docType;


    @NotEmpty(message = "template is required")
    private String template;
}