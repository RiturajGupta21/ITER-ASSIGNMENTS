import java.io.File;
public class A2qno11 {
	static String UNIX_NULL_DEV="/dev/null";
	static String WINDOWS_NULL_DEV="Null";
	static String FAKE_NULL_DEV="jnk";
	static String getNullDev() {
		if(new File(UNIX_NULL_DEV).exists()) {
			return UNIX_NULL_DEV;
		}
		String sys=System.getProperty("os.name");
		if(sys==null) {
			return FAKE_NULL_DEV;
		}
		if(sys.startsWith("Windows")) {
			return WINDOWS_NULL_DEV;
		}
		return FAKE_NULL_DEV;
	}
	public static void main(String[] args) {
		String devNull=getNullDev();
		System.out.println(devNull);
		
	}

}
