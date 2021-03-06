package cn.wangjing921.common.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Base64;
import java.util.List;

/**
 * 文件工具
 * @author afflatus
 */
public class FileUtil {

    /**
     * 遍历文件夹中文件的类路径，不带.java后缀
     * @param f 文件夹名
     * @param list 容器
     * @return
     */
    public static void scanFile(File f, List<String> list) {
        File[] g=f.listFiles();
        for (File z:g) {
            if (z.isFile()) {
                String fileName0 = z.getPath().split("\\.")[0];
                String fileName1 = fileName0.replace('\\', '.');
                String classPath = fileName1.split("java.")[1];
                list.add(classPath);
            }
            if (z.isDirectory()) {
                scanFile(z,list);
            }
        }
    }

    /**
     * base64字符转换成file
     *
     * @param destPath 保存的文件路径
     * @param base64   图片字符串
     * @param fileName 保存的文件名
     * @return file
     */
    public static File base64ToFile(String destPath, String base64, String fileName) {
        File file = null;
        //创建文件目录
        String filePath = destPath;
        File dir = new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(base64);
            file = new File(filePath + "/" + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file;
    }

    /**
     * 将file转换成base64字符串
     *
     * @param path
     * @return
     */
    public static String fileToBase64(String path) {
        String base64 = null;
        InputStream in = null;
        try {
            File file = new File(path);
            in = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            in.read(bytes);
            base64 = Base64.getEncoder().encodeToString(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return base64;
    }

    /**
     * MultipartFile类型文件转File
     *
     * @return File类型文件
     */
    public static File multipartFileToFile(MultipartFile multipartFile, String filePath, String fileName) {
        File f = null;
        File dir = new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        if (StringUtil.BLANK.equals(multipartFile) || multipartFile.getSize() <= 0) {
            multipartFile = null;
        } else {
            try {
                InputStream ins = multipartFile.getInputStream();
                f = new File(filePath + fileName);
                OutputStream os = new FileOutputStream(f);
                int bytesRead = 0;
                byte[] buffer = new byte[8192];
                while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
                os.close();
                ins.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return f;
    }
}
