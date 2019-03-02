//Implement Composite Design Pattern to maintaing the directories of
// employees on the basis of departments.

import java.util.ArrayList;
import java.util.List;

interface Directory{
    void showDirectoryDetails();
}

class Developer implements Directory{
    private String name;
    private String language;

    public Developer(String name, String language){
        this.name = name;
        this.language = language;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void showDirectoryDetails(){
        System.out.println("Developer(name : " + name + ", language : " + language + ")");
    }

    @Override
    public String toString(){
        return "Developer(name : " + name + ", language : " + language + ")";
    }
}

class Manager implements Directory{
    private String name;
    private String type;

    public Manager(String name, String type){
        this.name = name;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showDirectoryDetails(){
        System.out.println("Developer(name : " + name + ", type : " + type + ")");
    }

    @Override
    public String toString(){
        return "Developer(name : " + name + ", type : " + type + ")";
    }
}

class DeveloperDirectory implements Directory{
    List<Directory> developerDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails(){
        System.out.println("Developer Directory");
        developerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

class ManagerDirectory implements Directory{
    List<Directory> managerDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails(){
        System.out.println("Manager Directory");
        managerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

class CompanyDirectory implements Directory{
    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails(){
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
}

public class Q7 {
    public static void main(String args[]){
        Developer developer1 = new Developer("Gurvinder", "java");
        Developer developer2 = new Developer("Nitin", "java");

        Manager manager1 = new Manager("Arzoo", "HR");
        Manager manager2 = new Manager("Kavita", "Senior");

        DeveloperDirectory developerDirectory = new DeveloperDirectory();
        developerDirectory.developerDirectory.add(developer1);
        developerDirectory.developerDirectory.add(developer2);

        ManagerDirectory managerDirectory = new ManagerDirectory();
        managerDirectory.managerDirectory.add(manager1);
        managerDirectory.managerDirectory.add(manager2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(developerDirectory);
        companyDirectory.companyDirectory.add(managerDirectory);
        companyDirectory.showDirectoryDetails();

    }
}

