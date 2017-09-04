package hello;

import java.io.Serializable;

/**
 * Created by wq on 2017/9/2.
 */
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;
    int id;
    String uuid;
    String mobile_number;
    String email;
    String created_at;
    String updated_at;

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", email='" + email + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", authentication_token='" + authentication_token + '\'' +
                ", password_digest='" + password_digest + '\'' +
                '}';
    }

    String authentication_token;
    String password_digest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getAuthentication_token() {
        return authentication_token;
    }

    public void setAuthentication_token(String authentication_token) {
        this.authentication_token = authentication_token;
    }

    public String getPassword_digest() {
        return password_digest;
    }

    public void setPassword_digest(String password_digest) {
        this.password_digest = password_digest;
    }
}
