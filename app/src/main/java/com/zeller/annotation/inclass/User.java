package com.zeller.annotation.inclass;

import com.example.ann.Seriable;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/3/28
 * @date 17/3/28
 */

public class User {
    @Seriable
    private String username;
    @Seriable
    private String password;

    private String three;
    private String four;
}
