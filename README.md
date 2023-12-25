private Key getSignInKey() {
    byte[] keyBytes = Decoders.BASE64.decode(secretKey);
    return Keys.hmacShaKeyFor(keyBytes);
  }

  
# Spring-security-demo
#### Article On Jwt
+ https://3alam.pro/1337r00t/articles/jwt
#### Article On Medium
+ https://medium.com/@bhushannemade2001/spring-boot-3-1-jwt-authentication-authorization-secure-your-apis-like-a-pro-4873e507db4d
##### https://medium.com/@vikas.taank_40391/everything-that-you-need-to-know-about-oauth2-fb6a29b59e46
#### Spring Security
+ https://www.youtube.com/watch?v=-W8zj8l4bpI&list=PLMkr7X9JBPp4OlZCl0dzk8nXVb3Qygmeo&index=90
+ https://www.youtube.com/watch?v=KxqlJblhzfI
