package org.example.proxy;

public class RealApiService implements ExternalApiService{
    @Override
    public String fetchData(String query, String token) throws IllegalAccessException {
       /* if(token == null || !isValidToken(token)){
            throw new IllegalAccessException("Неверный токен");
        }*/
        System.out.println("Выполняется запрос к API с параметром " + query);
        return "Данные по запросу " + query;
    }



  /*  private boolean isValidToken(String token){
        return "valid_token".equals(token);
    }*/
}
