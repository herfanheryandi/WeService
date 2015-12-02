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

//database+forms
import play.db.*;
import java.sql.*;
import models.Provinsi;
import play.data.*;

public class Application extends Controller {
	List<Kota> listKota;
    List<Provinsi> listProvinsi;

    public Result index() throws IOException, SQLException{
        return this.getMap("13","1");
    }
    public Result other(String other) throws IOException, SQLException{
        return notFound("Page " + other + " not found");
    }
    
    public Result map() throws IOException, SQLException{
        DynamicForm requestData = Form.form().bindFromRequest();
        String kode = requestData.get("kode");
        String hari = requestData.get("hari");
        if (hari.equals("Today")){
            hari="1";
        }
        else{
            hari="2";
        }
        return this.getMap(kode,hari);
    }
    
    public Result getMap(String kode, String hari) throws IOException, SQLException{
        org.jsoup.Connection conn = Jsoup.connect("http://data.bmkg.go.id/propinsi_"+kode+"_"+hari+".xml");
        conn.timeout(0);
        conn.method(Connection.Method.GET);
        Response resp = conn.execute();
        Document xml =  resp.parse();
        Elements elem = xml.select("row");
        listKota = new ArrayList<Kota>();
        for (Element e:elem) {
            listKota.add(new Kota(e.child(0).text(),e.child(2).text(),e.child(3).text(),e.child(6).text(),e.child(7).text(),e.child(8).text()));
        }
        //mengambil data provinsi dari database
        listProvinsi = new ArrayList<Provinsi>();
        java.sql.Connection connection = DB.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from provinsi;");
        while (result.next()) {
            listProvinsi.add(new Provinsi(result.getString("id_provinsi"),result.getString("nama_provinsi")));
        }
        return ok(views.html.index.render(listKota,listProvinsi));
    }




}
