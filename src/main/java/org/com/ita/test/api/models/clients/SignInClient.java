package org.com.ita.test.api.models.clients;

import org.com.ita.test.api.models.SignInRequest;
import org.com.ita.test.api.models.SignInResponse;

public class SignInClient extends BaseClient{
  public SignInClient(){super();}

    public  SignInResponse post(SignInRequest credential) {
        return prepareRequest()
                .body(credential)
                .when()
                .post("/auth")
                .as(SignInResponse.class);

    }
    }
