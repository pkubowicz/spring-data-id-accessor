Demonstrates a regression in spring-data-mongo 2.4.6 (Spring Boot 2.4.4)

```
No accessor to set property private final java.lang.String com.example.User.id!
java.lang.UnsupportedOperationException: No accessor to set property private final java.lang.String com.example.User.id!
	at com.example.User_Accessor_a89b9l.setProperty(Unknown Source)
	at org.springframework.data.mapping.model.InstantiationAwarePropertyAccessor.setProperty(InstantiationAwarePropertyAccessor.java:104)
	at org.springframework.data.mapping.model.ConvertingPropertyAccessor.setProperty(ConvertingPropertyAccessor.java:63)
```

