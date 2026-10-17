package FileIO.File1.Utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;



public class CRUD {

	public static void readFile(String path) {
		int data;
		try(FileInputStream fin = new FileInputStream(path)){
			while((data = fin.read()) != -1) {
				System.out.print((char)data);
			}
			
		}
		catch(Throwable t){
			t.printStackTrace();
		}
	}
	
	
	public static void copyToPath(String path1,String path2) {
		int data;
		try(FileInputStream fin = new FileInputStream(path1)){
			try(FileOutputStream fout = new FileOutputStream(path2)){
				while((data = fin.read())!=-1) {
					fout.write(data);
				}
			}//close fout
		}//close Fin
		catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	
	public static void writeObject1(List<Movie> arr,String path) {
		try(FileOutputStream fout = new FileOutputStream(path,true)){
			try(BufferedOutputStream bof = new BufferedOutputStream(fout)){
				try(DataOutputStream dout = new DataOutputStream(fout)){
					for(Movie e:arr) {
						dout.writeInt(e.getId());
						dout.writeUTF(e.getName());
						dout.writeDouble(e.getRating());
					}
				}
			}
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
	
	
	public static void readObjectFromList(String path) {
		List<Movie> lst = new ArrayList<>();
		try(FileInputStream fin = new FileInputStream(path)){
			try(DataInputStream din = new DataInputStream(fin)){
				while(true) {
					Movie m = new Movie();
					m.setId(din.readInt());
					m.setName(din.readUTF());
					m.setRating(din.readDouble());
					lst.add(m);	
				}
			}
		}
		catch(EOFException e) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(Movie e:lst) {
			System.out.println(e.toString());
		}
	}
	
	public static void writeObject2(List<Movie> arr,String path) {
		try(FileOutputStream fout = new FileOutputStream(path)){
			try(ObjectOutputStream oobj = new ObjectOutputStream(fout)){
				oobj.writeObject(arr);
			}
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
	
	
	public static List<Movie> readObjectFromList2(String path) {
		List<Movie> lst = new ArrayList<>();
		try(FileInputStream fin = new FileInputStream(path)){
			try(ObjectInputStream oin = new ObjectInputStream(fin)){
				lst = (List<Movie>) oin.readObject();
				return lst;
			}
		}
		catch(EOFException e) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(Movie e:lst) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	
	public static void writeObject3(List<Movie> arr,String path) {
		try(FileOutputStream fout = new FileOutputStream(path,true)){
			try(BufferedOutputStream bof = new BufferedOutputStream(fout)){
				try(PrintStream pout = new PrintStream(bof)){
					for(Movie e: arr) {
						pout.println(e.getId()+"   "+e.getName()+"   "+e.getRating());
					}
				}
			}
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
	
	
	public static void readObjectFromList3(String path) {
		List<Movie> lst = new ArrayList<>();
		try(FileInputStream fin = new FileInputStream(path)){
			try(BufferedInputStream bin = new BufferedInputStream(fin)){
				
			}
		}
		catch(EOFException e) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(Movie e:lst) {
			System.out.println(e.toString());
		}
	}
	
}
