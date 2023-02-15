package com.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.dao.Response;
import com.app.pojo.Data;
import com.app.service.IService;

@RestController
@RequestMapping("/evision")
public class DataController {
@Autowired 
IService iservice;

@PostMapping("/storedata")
	public @ResponseBody void storeData(@RequestParam("Image")MultipartFile file) throws IOException {
		System.out.println("in storeData method");
		iservice.storeData (file);
	}

@GetMapping("/getdata/{id}")
public ResponseEntity<byte []> getDataById(@PathVariable int id){
	byte [] image = iservice.getDataById(id);
	return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(image);
}
//public ResponseEntity<?> getDataById(@PathVariable int id){
//Data data=iservice.getDataById(id);
//return Response.success(data);
//}

@DeleteMapping("/removedata/{id}")
public @ResponseBody void removeData (@PathVariable("id") int id) {
	System.out.println("Inside Delete Method");
	iservice.deleteData(id);
}

}
