package hello.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;
/**
 * 为控制提供一个与存储层（例如 文件系统、临时存储文件、数据库）进行交互
 * */
public interface StorageService {

    //初始化文件系统
    void init();
   //将多个文件保存在文件夹中
    void store(MultipartFile file);


    Stream<Path> loadAll();

    //将文件名称解析为文件路径
    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

}