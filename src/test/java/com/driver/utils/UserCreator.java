package com.driver.utils;

import com.driver.model.UserModel;

public class UserCreator {

    private static final String TESTDATA_USER_EMAIL = "testdata.user.email";
    private static final String TESTDATA_USER_PASSWORD = "testdata.user.password";

    public static UserModel withCredentialsFromProperty(){
        return new UserModel(TestDataReader.getTestData(TESTDATA_USER_EMAIL),
                TestDataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static UserModel withEmptyUserEmail(){
        return new UserModel("", TestDataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static UserModel withEmptyPassword(){
        return new UserModel(TestDataReader.getTestData(TESTDATA_USER_EMAIL), "");
    }
}