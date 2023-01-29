package ru.infoza.telegrambot.database;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "tg_data") //привязываемся к существующей таблице с готовыми колонками
public class User {
    @Id
    private long id; //BigInt
    private String name; //Text
    private int msg_numb; //Integer
}
