package im.ene.lab.nnbook.models;

import im.ene.lab.nnbook.NNHome;

public class NNCategoryHeader {

	public String title;

	public String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = NNHome.HomeURL + url;
	}

}
