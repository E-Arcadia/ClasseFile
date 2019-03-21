
/*
  Material do curso de Java
  @author Prof. Martin Mor�es
  @link https://github.com/E-Arcadia/
  @link http://escolaarcadia.blogspot.com.br/
  @e-mail martin.moraes@gmail.com*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExemploClasseFile {

	public static void main(String[] args) throws IOException {

		/*
		 * //Files.exists Path path = Paths.get("C:\\Users\\marti\\Downloads"); boolean
		 * pathExists = Files.exists(path); System.out.println(pathExists);
		 */

//		// Files.createDirectory
//		Path path = Paths.get("data");
//		try {
//			Path novoDir = Files.createDirectory(path);
//			System.out.println(novoDir);
//		} catch (FileAlreadyExistsException e) {
//			// Se o diretório já existe.
//			System.out.println(e.toString());
//		} catch (IOException e) {
//			// Se alguma coisa der errada
//			e.printStackTrace();
//		}

//		// Files.createFile
//		Path path = Paths.get("data\\arquivo1.txt");
//		try {
//			Path novoFile = Files.createFile(path);
//			System.out.println(novoFile);
//		} catch (FileAlreadyExistsException e) {
//			// Se o arquivo já existe.​
//		} catch (IOException e) {
//			// Se alguma coisa der errada​
//			e.printStackTrace();
//		}

		// Files.copy
//		Path origemPath = Paths.get("data/arquivo1.txt");
//		Path destinoPath = Paths.get("data/arquivo2.txt");
//		try {
//			Files.copy(origemPath, destinoPath);
//		} catch (FileAlreadyExistsException e) {
//			// Se arquivo de destino já existe
//		} catch (IOException e) {
//			// Se alguma coisa der errada
//			e.printStackTrace();
//		}

		
//		//Files.copy - Sobrescrevendo
//		Path origemPath = Paths.get("data/arquivo1.txt");
//		Path destinoPath = Paths.get("data/arquivo2.txt");
//		try {
//			Files.copy(origemPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// Se alguma coisa der errada
//			e.printStackTrace();
//		}

		
		//Files.move
//		Path origemPath = Paths.get("data/arquivo1.txt");
//		Path destinoPath = Paths.get("arquivo.txt");
//		try {
//			Files.move(origemPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// Se alguma coisa der errada
//			e.printStackTrace();
//		}
		
		
//		//Files.delete
//		Path path  = Paths.get("arquivo.txt");
//		try {
//			Files.delete(path);
//		}  catch (IOException e) {
//			//Se alguma coisa der errada
//			e.printStackTrace();
//		}
		
		
//		//Files.find
//		Path start = Paths.get("C:\\Users\\Usuário\\eclipse-workspace");
//		int maxDepth = 5;
//		Stream<Path> stream = Files.find(
//			start, 
//			maxDepth, 
//			(path, attr) -> String.valueOf(path).endsWith(".java"));
//		stream.sorted().forEach(System.out::println); 


//		//Files.list
//		Path path  = Paths.get("C:\\\\Users\\\\Usuário\\\\eclipse-workspace");
//		Stream<Path> stream = Files.list(path);
//		stream.sorted().forEach(System.out::println);


	}

}
