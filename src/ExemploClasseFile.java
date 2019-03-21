
/*
  Material do curso de Java
  @author Prof. Martin Morães
  @link https://github.com/E-Arcadia/
  @link http://escolaarcadia.blogspot.com.br/
  @e-mail martin.moraes@gmail.com*/

	import java.io.File;
	import java.io.FileFilter;
	import java.io.FilenameFilter;
	import java.io.IOException;
	import java.util.Scanner;

	public class ExemploClasseFile {

		public static void main(String[] args) throws IOException {

			File arq = new File("C:\\Users\\Martin\\s.txt");

			// Cria arquivo definido em arq
			if (arq.createNewFile())
				System.out.println("Arquivo criado: " + arq.getName());
			else
				System.out.println("Arquivo não Criado: " + arq.getName());

			/*// Cria arquivo temporário no diretório padrão
			System.out.println("Caminho padrão dos arquivos temporários: "
					+ System.getProperty("java.io.tmpdir"));
			File arqTmp = File.createTempFile("AAA-Teste", ".tmp");
			System.out.println("Arquivo Criado: " + arqTmp.getName());*/

			/*// Cria diretório
			File dir = new File("C:\\Users\\Martin\\DIR");
			if (dir.mkdir())
				System.out.println("Criou a pasta: " + dir.getName());
			else
				System.out.println("Não criou a pasta: " + dir.getName());*/

			/*// Cria arvore de diretório
			File dirs = new File("C:\\Users\\Martin\\DIR\\dirA\\dirB\\dirC\\dirD");
			if (dirs.mkdirs())
				System.out.println("Criou a pasta: " + dirs.getName());
			else
				System.out.println("Não criou a pasta: " + dirs.getName());*/
			
			/*// Renomeia pasta e arquivo
			File dirs = new File("C:\\Users\\Martin\\DIR\\dirA\\dirB\\dirC\\dirD");
			File dirDest = new File("C:\\Users\\Martin\\DIR\\dirA\\dirB\\dirC\\dirDDDDD");
			if (dirs.renameTo(dirDest))
				System.out.println("Renomeou a pasta: " + dirDest.getName());
			else
				System.out.println("Não Renomeou a pasta: " + dirDest.getName());*/
			
			/*// Exlui a pasta ou arquivo
			File dir = new File("C:\\Users\\Martin\\DIR\\dirA\\dirB\\dirC\\dirDDDDD");
			if (dir.delete())
				System.out.println("Excluiu a pasta: " + dir.getName());
			else
				System.out.println("Não excluiu a pasta: " + dir.getName());*/
			
			/*// Exlui a pasta ou arquivo quando o aplicativo é encerrado
			File dir = new File(
					"C:\\Users\\Martin\\DIR\\dirA\\dirB\\dirC");
			dir.deleteOnExit();
			System.out.println("Marcou para exclusão: " + dir.getName()
					+ "\n Pausa para verificação - Pressione uma tecla para continuar.");
			new Scanner(System.in).nextLine();*/
			
			

			/*System.out
					.println("Retorna uma string com o caminho + arquivo ou caminho - abstrato: \n\t\t"
							+ arq.getAbsolutePath());
			System.out
					.println("Retorna na forma canônica o caminho do arquivo. Relativo ao SO: \n\t\t"
							+ arq.getCanonicalPath());
			System.out.println("Retorna o nome do File ou diretório - abstrato: \n\t\t" + arq.getName()); 
			System.out
					.println("Retorna o nome do caminho e nome do arquivo - abstrato: \n\t\t"
							+ arq.getPath());
			System.out
					.println("Retorna uma String com o caminho do diretório pai, ou nulo se não tem um diretório pai - abstrato: \n\t\t"
							+ arq.getParent());*/
			
			/*//Testes no arquivo / diretório
			System.out.println("Verificação em: " + arq.getCanonicalPath());
			System.out.println("Testa se o arquivo ou diretório abstrato existe: \n\t\t" + arq.exists());
			System.out.println("Testa se o caminho abstrato é absoluto: \n\t\t" + arq.isAbsolute());
			System.out.println("Testa se o indicado é um diretório: \n\t\t" + arq.isDirectory());
			System.out.println("Testa se o indicado é um arquivo normal: \n\t\t" + arq.isFile());
			System.out.println("Testa se o arquivo é um arquivo oculto: \n\t\t" + arq.isHidden());*/


	/*		//Byte e Data
			System.out.println("\n\n");
			System.out.println("Retorna o total em bytes do tamanho da partição: \n\t\t" + arq.getTotalSpace());
			System.out.println("Retorna o total em bytes disponível da partição: \n\t\t" + arq.getFreeSpace());
			System.out.println("Retorna o total em bytes utilizados na partição: \n\t\t" + arq.getUsableSpace());
			System.out.println("Retorna o total em bytes do tamanho do arquivo: \n\t\t" + arq.length());
			System.out.println("Retorna a data (long) da última modificação do arquivo: \n\t\t" + arq.lastModified());*/

			/*//Lista e Filtros
			File arqA = new File("C:\\Users\\Martin\\");
			System.out.println("\n\nConteúdo de: " + arqA.getAbsolutePath());
			String[] listArq; 
			
			//Sem Filtro
			listArq = arqA.list();
			for(String nom : listArq)
				System.out.println("\t\t" + nom);
			
			//Com Filtro
			System.out.println("\n\nConteúdo de: " + arqA.getAbsolutePath() + " com filtro.");
			listArq = arqA.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.endsWith("txt");
				}
			});
			for(String nom : listArq)
				System.out.println("\t\t" + nom);*/
			

			/*//Retorna tipo File com filtro
			System.out.println("Retorna uma matriz do tipo File com filtro - FileFilter: "); 
			File[] listaFile = arqA.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					return pathname.isFile();
				}
			});
			for(File nom : listaFile)
				System.out.println("\t\t" + nom.getName());*/
			
			/*//Lista o diretório RAIZ
			System.out.println("\n\nListe as raízes do sistema de arquivo disponíveis");
			File[] listaRaiz = File.listRoots();
			for(File nom : listaRaiz)
				System.out.println("\t\t" + nom.getAbsolutePath());*/
			
			
		}


	}
