import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) throws Throwable {
		
		programmationFonctionnelle();
		
		boiteAFutur();
		
	}

	public static void programmationFonctionnelle() {
		
		List<Integer> liste = new ArrayList<>();

		liste.add(1);
		liste.add(11);
		liste.add(10);

		liste = liste.stream().filter(i -> i > 10).collect(Collectors.toList());

		for (Integer i : liste)
			System.out.println(i);
	}
	
	public static void boiteAFutur() throws InterruptedException, ExecutionException {
		
		MonTraitement traitement1 = new MonTraitement();
		
		ExecutorService executeur = Executors.newCachedThreadPool();
		
		Future<List<Long>> generationDuJour = executeur.submit(traitement1);
		Future<List<Long>> generationDeDemain = executeur.submit(traitement1);
		
		List<Long> numerosDuJour = generationDuJour.get();
		List<Long> numerosDeDemain = generationDeDemain.get();
		
		System.out.println("Numéro du Jour : " + numerosDuJour);
		System.out.println("Numéro de Demain : " + numerosDuJour);
		
	}

}
