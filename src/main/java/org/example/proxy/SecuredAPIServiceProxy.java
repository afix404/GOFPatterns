package org.example.proxy;

public class SecuredAPIServiceProxy implements ExternalApiService{

    private RealApiService realApiService;


    public SecuredAPIServiceProxy(RealApiService realApiService) {
        this.realApiService = realApiService;
    }

    @Override
    public String fetchData(String query, String token) throws IllegalAccessException {
        if(token == null || !isValidToken(token)){
            throw new IllegalAccessException("Неверный токен");
        }
        return realApiService.fetchData(query, token);
    }


    private boolean isValidToken(String token){
        return "valid_token".equals(token);
    }
}
