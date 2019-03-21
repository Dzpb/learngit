package file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Csv {
    static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    public void createCsvFile(String fileName, String filePath, List<Map> data, Map<String,String> headMap){
        File csvFile = null;
        BufferedWriter csvBufferWriter = null;
        File file = new File(filePath);
        if (!file.exists()){
            file.mkdir();
        }
        // 定义文件名格式并创建文件
        try {
            csvFile = File.createTempFile(fileName,".csv", file);
            csvBufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile),"GBK"));

            //写入文件头部
            writeRow(headMap, csvBufferWriter);
           /* Iterator headEntry = headMap.entrySet().iterator();
            while(headEntry.hasNext()){
                Map.Entry entry = (Map.Entry) headEntry.next();
                String val = (String) entry.getValue();
                val = val==null ? "":val;
                csvBufferWriter.write(val);
                if (headEntry.hasNext()){
                    csvBufferWriter.write(",");
                }
            }*/

            // 文件头部和文件体之间换行
            csvBufferWriter.write("\r\n");

            //写入文件内容   文件体
            if(data!=null && data.size()>0){
                for(Map map : data){
                    writeRow(map, csvBufferWriter);
                    csvBufferWriter.write("\r\n");
                }

            }
            csvBufferWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                csvBufferWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 写一行数据
    public void writeRow(Map map, BufferedWriter br) throws IOException{
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            String val = (String) entry.getValue();
            val = val==null ? "":val;
            br.write(val);
            if (it.hasNext()){
                br.write(",");
            }
        }
    }

    public static void main(String[] args) {

        Map headMap = new HashMap();
        headMap.put("name","姓名");
        headMap.put("age","年龄");
        headMap.put("date","日期");

        List<Map> list = new ArrayList<>();
        for (int i=10; i<60; i++){
            Map map = new HashMap();
            map.put("name","张三"+i);
            map.put("age",String.valueOf(i));
            map.put("date",sdf.format(new Date()));
            list.add(map);
        }
        System.out.println(sdf.format(new Date()));
        Csv csv = new Csv();
       csv.createCsvFile("hkCsv","D:\\csv",list,headMap);
    }
}
