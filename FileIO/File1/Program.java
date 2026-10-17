package FileIO.File1;

import java.util.ArrayList;
import java.util.List;

import FileIO.File1.Utils.CRUD;
import FileIO.File1.Utils.Movie;

public class Program {

	public static void main(String[] args) {
		String path1 = "D:/CDAC/CoreJava/FileIO/File1.txt";
		String path2 = "D:/CDAC/CoreJava/FileIO/File2.txt";
		String path3 = "D:/CDAC/CoreJava/FileIO/File3.txt";
		String path4 = "D:/CDAC/CoreJava/FileIO/File4.txt";
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Star Wars", 7.5));
		list.add(new Movie(2, "Godfather", 8.0));
		list.add(new Movie(3, "Hidden Figures", 7.0));
		list.add(new Movie(4, "Bruce Almighty", 6.5));
		list.add(new Movie(5, "Forest Gump", 8.5));
		
		
		
		
//		CRUD.readFile(path1);		
//		CRUD.copyToPath(path1, path2);
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
		CRUD.writeObject3(list,path4);
		CRUD.readObjectFromList2(path4);

	}

}
