package springaop;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Services {

    public void service1(){
        System.out.println("service 1");
    }
    public void service2(){
        System.out.println("service 2");
    }
    public void service3(){
        System.out.println("service 3 : with dummy argument");
    }
    public void service4(Integer x){
        System.out.println("service 4 : with Integer argument");
    }
    public void service5()throws IOException{
        System.out.println("service 5 throwing IOException");
        throw new IOException();
    }
}
