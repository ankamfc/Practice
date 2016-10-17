import java.util.HashMap;


public class Hashex {
	
	public HashMap<Integer, Student> buildMap(Student[] students){
		HashMap<Integer, Student> mapper= new HashMap<Integer, Student>();
		for(Student s: students){
			mapper.put(s.getId(), s);
		}
		return mapper;
	}
}
