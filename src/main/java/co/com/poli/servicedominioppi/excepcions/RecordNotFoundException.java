package co.com.poli.servicedominioppi.excepcions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,
        reason = "El servicio de consulta no esta disponible    ")
public class RecordNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
}