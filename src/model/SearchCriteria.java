package model;

public class SearchCriteria {
	private String queryString;

	public SearchCriteria(String queryString) {
		this.queryString = queryString;
	}

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
}
