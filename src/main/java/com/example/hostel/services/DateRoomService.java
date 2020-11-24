package com.example.hostel.services;


import com.example.hostel.domain.DateRoom;
import com.example.hostel.domain.Room;
import com.example.hostel.domain.User;
import com.example.hostel.repos.DateRoomRepository;
import com.example.hostel.repos.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DateRoomService {
    public final DateRoomRepository dateRoomRepository;
    public final RoomRepository roomRepository;

    public void reserveRoom(DateRoom dateRoom, User user, Room room){
        dateRoom.setUser(user);
        dateRoom.setRoom(room);
        dateRoomRepository.save(dateRoom);
    }


    public List<DateRoom> findAllDateRoom() {
        return dateRoomRepository.findAll();
    }

}

