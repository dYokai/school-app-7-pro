package gr.aueb.cf.schoolapp.dto;

public class TeacherReadOnlyDTO extends BaseDTO {
    private Integer Id;
    private String uuid;

    public TeacherReadOnlyDTO() {

    }

    public TeacherReadOnlyDTO(Integer id, String uuid) {
        Id = id;
        this.uuid = uuid;
    }

    public TeacherReadOnlyDTO(Integer id, String uuid, String firstname, String lastname, String vat,
                              String fatherName, String phoneNumber, String email, String street, String streetNum,
                              String zipCode, Integer cityId) {
        super(firstname, lastname, vat, fatherName, phoneNumber, email, street, streetNum, zipCode, cityId);
        Id = id;
        this.uuid = uuid;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
