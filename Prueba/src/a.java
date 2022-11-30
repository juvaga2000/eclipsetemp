
public class a {

	public static void main(String[] args) {
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://divanscore.p.rapidapi.com/teams/get-transfers?teamId=38")
			.get()
			.addHeader("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
			.addHeader("X-RapidAPI-Host", "divanscore.p.rapidapi.com")
			.build();

		Response response = client.newCall(request).execute();
	}
}
