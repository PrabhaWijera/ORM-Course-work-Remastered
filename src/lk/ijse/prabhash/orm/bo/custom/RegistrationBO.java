package lk.ijse.prabhash.orm.bo.custom;

import javafx.collections.ObservableList;


import lk.ijse.prabhash.orm.bo.SuperBO;
import lk.ijse.prabhash.orm.dto.RoomDTO;
import lk.ijse.prabhash.orm.dto.StudentDTO;
import lk.ijse.prabhash.orm.view.tm.CartTM;

import java.io.IOException;
import java.util.List;

public interface RegistrationBO extends SuperBO {
    void Register(ObservableList<CartTM> list, String studentId, String lblId)throws Exception;
    List<StudentDTO> getAllStudents() throws IOException;
    List<RoomDTO> getAllRooms() throws IOException;
    List<RoomDTO> getRoomDetailUsingId(String id) throws Exception;
    List<StudentDTO> getStudentDetailUsingId(String id) throws Exception;
    String generateRegistrationId()throws Exception;

    void Register(String studentId, String lblId);
}
