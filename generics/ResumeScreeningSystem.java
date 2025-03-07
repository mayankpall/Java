package com.bridgelabz.generics;



import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;
    private String skills;

    public JobRole(String candidateName, String skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSkills() {
        return skills;
    }

    public abstract String getRole();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public String getRole() {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public void processResumes() {
        for (T resume : resumes) {
            System.out.println("Processing Resume: " + resume.getCandidateName() + " for " + resume.getRole() + " Role");
            System.out.println("Skills: " + resume.getSkills());
        }
    }
}

class ScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Screening Resume: " + resume.getCandidateName() + " for " + resume.getRole());
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        Resume<ProductManager> productManagerResumes = new Resume<>();

        SoftwareEngineer se1 = new SoftwareEngineer("Mayank", "Java");
        DataScientist ds1 = new DataScientist("Vibhor", "Python");
        ProductManager pm1 = new ProductManager("Arnav", "c++");

        softwareEngineerResumes.addResume(se1);
        dataScientistResumes.addResume(ds1);
        productManagerResumes.addResume(pm1);

        System.out.println("Processing Resumes:");
        softwareEngineerResumes.processResumes();
        dataScientistResumes.processResumes();
        productManagerResumes.processResumes();

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(se1);
        allResumes.add(ds1);
        allResumes.add(pm1);

        System.out.println("\nScreening All Resumes:");
        ScreeningPipeline.screenResumes(allResumes);
    }
}
