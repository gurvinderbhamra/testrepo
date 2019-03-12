package springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    @Autowired
    private HotDrink hotDrink;

    @Autowired
    private Tea tea;

    @Autowired
    public Restaurant(Tea tea){
        this.tea = tea;
    }

    public Restaurant(){
        System.out.println("Bean created via default constructor");
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString(){
        return hotDrink.prepareHotDrink();
    }

    public Tea getTea() {
        return tea;
    }

    @Autowired
    public void setTea(Tea tea) {
        this.tea = tea;
    }
}
