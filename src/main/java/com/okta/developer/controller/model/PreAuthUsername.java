package com.okta.developer.controller.model;

import lombok.Data;

/**
 * @author jcavazos
 */
@Data
public class PreAuthUsername {
    private String username;

    public String getUsername() {
        return username;
    }
}
