import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class test {
    byte[] result = prev.getResponseData();  //这个是获取到请求返回的数据，prev是获取上个请求的返回
    String file_name = vars.get("Cert_Filepath") + "\\cert.zip"; //代表存放文件的位置和文件名
    File file = new File(file_name);
    FileOutputStream out = new FileOutputStream(file);
        out.write(result);
        out.close();

    String resourcepath = vars.get("Cert_Filepath") + "\\cert";
    File pathFile = new File(resourcepath);
        if(!pathFile.exists())

    {
        pathFile.mkdirs();
    }

    ZipFile zp = null;
    zp=new

    ZipFile(file_name, Charset.forName("gbk"));
    Enumeration entries = zp.entries();
        while(entries.hasMoreElements())

    {
        ZipEntry entry = (ZipEntry) entries.nextElement();
        String zipEntryName = entry.getName();
        InputStream in = zp.getInputStream(entry);
        String outpath = (resourcepath + zipEntryName).replace("/", File.separator);
        File file = new File(outpath.substring(0, outpath.lastIndexOf(File.separator)));
        if (!file.exists()) {
            file.mkdirs();
        }
        if (new File(outpath).isDirectory())
            continue;
        OutputStream out = new FileOutputStream(outpath);
        byte[] bf = new byte[2048];
        int len;
        while ((len = in.read(bf)) > 0) {
            out.write(bf, 0, len);
        }
        in.close();
        out.close();
    }
        zp.close();
}