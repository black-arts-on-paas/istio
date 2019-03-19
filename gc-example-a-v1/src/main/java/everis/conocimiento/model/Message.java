package everis.conocimiento.model;

import com.fasterxml.jackson.databind.JsonSerializable;
import io.micronaut.core.serialize.ObjectSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

public class Message {
    String id;
    String detail;

    public Message(String id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId(String detail) {
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }
}
