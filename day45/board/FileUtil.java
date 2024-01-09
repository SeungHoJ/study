package board;

import java.io.File;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

public class FileUtil {
	private static FileUtil instance = new FileUtil();
	public static FileUtil getInstance() {
		return instance;
	}
	
	private FileUtil() {}
	
	
	private String saveDirectory = "C:\\upload";
	private final int maxPostSiez = 1024 * 1024* 50;
	private final String encoding = "UTF-8";
	private final FileRenamePolicy policy = new DefaultFileRenamePolicy();
	
	public BoardDTO getDTO(HttpServletRequest request) throws IOException{
		BoardDTO dto = new BoardDTO();
		MultipartRequest mpRequest = new MultipartRequest(request,saveDirectory,maxPostSiez,encoding,policy);
		
		File uploadFile = mpRequest.getFile("image");
		if(uploadFile != null) {
			dto.setImage(uploadFile.getName());
		}
		dto.setContent(mpRequest.getParameter("content"));
		dto.setTitle(mpRequest.getParameter("title"));
		dto.setIpaddr(mpRequest.getParameter("ipaddr"));
		dto.setWriter(mpRequest.getParameter("writer"));
		return dto;
	}
	
	
	
}
