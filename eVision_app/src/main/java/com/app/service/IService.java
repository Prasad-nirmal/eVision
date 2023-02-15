package com.app.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.app.pojo.Data;

public interface IService {

Data storeData(MultipartFile file) throws IOException;
void deleteData(int id);
byte[] getDataById(int id);

}
