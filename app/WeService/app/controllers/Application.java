package controllers;

import play.*;
import play.mvc.*;
import models.Kota;
import views.html.*;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Application extends Controller {
	List<Kota> list;
	
    public Result index() throws IOException{
    	Connection conn = Jsoup.connect("http://data.bmkg.go.id/propinsi_13_1.xml");
        conn.timeout(0);
        conn.method(Connection.Method.GET);
        Response resp = conn.execute();
        Document xml =  resp.parse();
        Elements elem = xml.select("row");
        list = new ArrayList<Kota>();
        for (Element e:elem) {
            list.add(new Kota(e.child(0).text(),e.child(2).text(),e.child(3).text(),e.child(6).text(),e.child(7).text(),e.child(8).text()));
        }
        return ok(views.html.index.render(list));
    }

}
