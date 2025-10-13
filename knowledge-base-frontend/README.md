
# Knowledge-base Frontend (Vite + React + Tailwind)

## Setup

1. Install dependencies:
   ```
   npm install
   ```

2. Start dev server:
   ```
   npm run dev
   ```

3. Open http://localhost:3000

**Note:** Backend must be running at http://localhost:8080 and allow CORS for requests from the frontend.
If you get CORS errors, enable CORS in Spring Boot:

```java
// Example: Global CORS config in Spring
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedOrigins("http://localhost:3000");
  }
}
```
