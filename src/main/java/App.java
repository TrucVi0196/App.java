import java.io.*;

public class App {
    private static final String FILENAME = "MyFile.txt";

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String data = "ABC" +
                    "Chuyên Viên Kiểm Thử" + "Dia chi hien tai: 28bis Mạc Đĩnh Chi, Đa Kao, Quận 1, Thành phố Hồ Chí Minh";

            File file = new File(FILENAME);
            // kiểm tra nếu file chưa có thì tạo file mới
            if (!file.exists()) {
                file.createNewFile();
            }
            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("Xong");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
