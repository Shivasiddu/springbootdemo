package com.zensar.springbootdemo.endpoints;



import java.util.Random;



import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator{



@Override
protected void doHealthCheck(Builder builder) throws Exception {
// TODO Auto-generated method stub
System.out.println("Inside doHealthCheck");
Random random=new Random();
int randomdownNumber=random.nextInt(100);
if(randomdownNumber%2==0) {
builder.up();
}
else {
builder.down();
}

}



}