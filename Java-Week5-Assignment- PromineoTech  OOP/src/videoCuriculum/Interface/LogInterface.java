package videoCuriculum.Interface;

/*
 * an interface
 */
public interface LogInterface {
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	void close();

}
