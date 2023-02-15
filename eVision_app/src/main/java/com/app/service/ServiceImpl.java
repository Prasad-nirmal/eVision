package com.app.service;

import java.io.IOException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.app.dao.DataDao;
import com.app.pojo.Data;
import com.app.utility.ImageUtil;

@Service
@Transactional
class ServiceImpl implements IService {

	@Autowired
	private DataDao datadao;

	@Override
	public Data storeData(MultipartFile file) throws IOException {
		Data image= new Data();
		image.setcImage(ImageUtil.compressImage(file.getBytes()));
//		//image.setpImage(ImageUtil.compressImage(pImage.getBytes()));
		return datadao.save(image);
	}
	
//	public Image uploadImage (MultipartFile cImage, MultipartFile pImage ) throws IOException {
//		Image image= new Image();
//		image.setcImage(ImageUtil.compressImage(cImage.getBytes()));
//		//image.setpImage(ImageUtil.compressImage(pImage.getBytes()));
//		return imagerepo.save(image);

	@Override
	public void deleteData(int id) {
	datadao.deleteById(id);
	System.out.println("deleted");
		
	}

	@Override
	public byte [] getDataById(int id) {
		Optional <Data> imageData=datadao.findById(id);
		return ImageUtil.decompressImage(imageData.get().getcImage());
	}
	
}
