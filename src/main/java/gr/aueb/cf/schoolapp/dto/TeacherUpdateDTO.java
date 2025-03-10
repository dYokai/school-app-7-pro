package gr.aueb.cf.schoolapp.dto;

public class TeacherUpdateDTO extends BaseDTO{
    private Integer Id;

    public TeacherUpdateDTO() {

    }

    public TeacherUpdateDTO(Integer Id, String firstname, String lastname, String vat, String fatherName,
                            String phoneNumber, String email, String street, String streetNum, String zipCode,
                            Integer cityId, Integer id) {
        super(firstname, lastname, vat, fatherName, phoneNumber, email, street, streetNum, zipCode, cityId);
        this.Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
