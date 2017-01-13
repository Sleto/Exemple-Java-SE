import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MonTraitement implements Callable<List<Long>> {

	@Override
	public List<Long> call() throws Exception {
		
		List<Long> resultatsDuLoto = new ArrayList<>();
		
		for (int i = 0 ; i < 10 ; i++)
			resultatsDuLoto.add(Math.round(Math.random() * 10));
		
		return resultatsDuLoto;
	}

}
