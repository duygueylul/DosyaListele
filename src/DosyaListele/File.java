package DosyaListele;

public class File {

	public File(String folderName) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String folderName = "D:/Ders Notları/Java/";
        File file = new File(folderName);
        if (file.exists() && file.isDirectory()) { 
            File[] files = file.listFiles(); 
            if (files.length > 0) {
                System.out.println(files.length + " dosya bulundu");
                for(int i = 0; i < files.length;i++){
                    System.out.println("Dosya Adı: "+files[i]);
                }
 
            } else { 
                System.out.println("Klasör boş !");
            }
        } else {
            System.out.println("Klasör eksik ya da "+folderName+" bir klasör değil");
        }

	}

	private File[] listFiles() {
		
		return null;
	}

	private boolean isDirectory() {
		
		return false;
	}

	private boolean exists() {
		
		return false;
	}

}
