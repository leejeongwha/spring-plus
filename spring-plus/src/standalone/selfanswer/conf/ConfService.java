package selfanswer.conf;

public class ConfService {
	private ConfDAO confDAO;
	
	public ConfService(ConfDAO confDAO) {
		this.confDAO = confDAO;
	}

	public ConfDAO getConfDAO() {
		return confDAO;
	}

	public void setConfDAO(ConfDAO confDAO) {
		this.confDAO = confDAO;
	}
	
}
