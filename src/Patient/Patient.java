package Patient;

import java.util.Date;

public class Patient {

    protected String clinicNumber;
    protected String name;
    protected String breed;
    protected Owner owners;
    protected boolean isVaccinated;
    protected String desparasitationDate;

    protected String generateNumber(){
        return null;
    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Owner getOwners() {
        return owners;
    }

    public void setOwners(Owner owners) {
        this.owners = owners;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getDesparasitationDate() {
        return desparasitationDate;
    }

    public void setDesparasitationDate(String desparasitationDate) {
        this.desparasitationDate = desparasitationDate;
    }
}
