package org.gaia.portal.view.login;

public interface LoginView  {

    String getUsername();
    String getPassword();

    void signedInSucceed();
    void signInFailed();

}
